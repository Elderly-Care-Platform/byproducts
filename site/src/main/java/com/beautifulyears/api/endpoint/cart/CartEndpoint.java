package com.beautifulyears.api.endpoint.cart;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.apache.log4j.Logger;
import org.broadleafcommerce.core.offer.domain.OfferCode;
import org.broadleafcommerce.core.offer.service.exception.OfferMaxUseExceededException;
import org.broadleafcommerce.core.order.domain.NullOrderImpl;
import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.domain.OrderItem;
import org.broadleafcommerce.core.order.service.OrderItemService;
import org.broadleafcommerce.core.order.service.OrderService;
import org.broadleafcommerce.core.order.service.call.MergeCartResponse;
import org.broadleafcommerce.core.order.service.call.OrderItemRequestDTO;
import org.broadleafcommerce.core.order.service.exception.AddToCartException;
import org.broadleafcommerce.core.order.service.exception.RemoveFromCartException;
import org.broadleafcommerce.core.order.service.type.OrderStatus;
import org.broadleafcommerce.core.pricing.service.exception.PricingException;
import org.broadleafcommerce.core.web.api.BroadleafWebServicesException;
import org.broadleafcommerce.core.web.api.wrapper.OrderWrapper;
import org.broadleafcommerce.core.web.order.CartState;
import org.broadleafcommerce.profile.core.domain.Customer;
import org.broadleafcommerce.profile.web.core.CustomerState;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.beautifulyears.api.wrapper.ExtendOrderWrapper;
import com.beautifulyears.dao.order.ExtendOrderDao;
import com.beautifulyears.service.logistic.awb.AwbService;
import com.beautifulyears.service.order.ExtendOrderService;

/**
 * This endpoint provide services related to cart operations.
 * 
 * @author Aspire Software Solutions
 *
 */
@Component
@Scope("singleton")
@Path("/cart/")
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class CartEndpoint extends org.broadleafcommerce.core.web.api.endpoint.order.CartEndpoint {
	
	@Resource(name = "blExtendOrderService")
	protected ExtendOrderService extendOrderService;
	
	@Resource(name = "blOrderItemService")
    protected OrderItemService orderItemService;
	
  final static Logger logger = Logger.getLogger(CartEndpoint.class);

  /*
   * This method is used to get cart information for customer
   * 
   * (non-Javadoc)
   * 
   * @see
   * org.broadleafcommerce.core.web.api.endpoint.order.CartEndpoint#findCartForCustomer(javax.servlet
   * .http.HttpServletRequest)
   */
  @Override
  @GET
  public OrderWrapper findCartForCustomer(@Context HttpServletRequest request) {
    logger.debug("Executing method : findCartForCustomer()");
    return super.findCartForCustomer(request);
  }

  /*
   * This method is used to create cart for customer
   * 
   * (non-Javadoc)
   * 
   * @see
   * org.broadleafcommerce.core.web.api.endpoint.order.CartEndpoint#createNewCartForCustomer(javax
   * .servlet.http.HttpServletRequest)
   */
  @Override
  @POST
  public OrderWrapper createNewCartForCustomer(@Context HttpServletRequest request) {
    logger.debug("Executing method : createNewCartForCustomer()");
    Customer customer = CustomerState.getCustomer(request);

    if (customer == null) {
        customer = customerService.createCustomerFromId(null);
        CustomerState.setCustomer(customer);
    }
    
    OrderWrapper order = super.createNewCartForCustomer(request);
    return order;
  }
  
  
  @POST
  @Path("/merge")
  public OrderWrapper mergeCart(@Context HttpServletRequest request,
		  @QueryParam("guestOrderId") Long guestOrderId) throws PricingException, RemoveFromCartException, AddToCartException {
    logger.debug("Executing method : createNewCartForCustomer()");
    Customer customer = CustomerState.getCustomer(request);

    if (customer == null) {
        customer = customerService.createCustomerFromId(null);
        CustomerState.setCustomer(customer);
    }
    
    MergeCartResponse mergedOrder = extendOrderService.mergeOrder(customer, guestOrderId, true);
    mergedOrder.getOrder().setCustomer(customer);
    CartState.setCart(mergedOrder.getOrder());
    
    
    List<Order> namedOrders = orderService.findOrdersForCustomer(customer,OrderStatus.NAMED);
    for(Order namedOrder : namedOrders){
    	
    	List<OrderItem> items = new ArrayList<OrderItem>(namedOrder.getOrderItems());
        for (OrderItem item : items) {
        	orderService.removeItem(namedOrder.getId(), item.getId(), false);
            
            OrderItemRequestDTO orderItemRequest = orderItemService.buildOrderItemRequestDTOFromOrderItem(item);
            mergedOrder.setOrder(orderService.addItem(mergedOrder.getOrder().getId(), orderItemRequest, true));
        }
        
        orderService.cancelOrder(namedOrder);
    	
    	
    	
//    	orderService.addAllItemsFromNamedOrder(namedOrder, true);
//    	for(OrderItem item : namedOrder.getOrderItems()){
//    		mergedOrder.getOrder().addOrderItem(item);
//    	}
    }
    orderService.save(mergedOrder.getOrder(), true, true);
    OrderWrapper wrapper = (OrderWrapper) context.getBean(OrderWrapper.class.getName());
    wrapper.wrapDetails(mergedOrder.getOrder(), request);

    return wrapper;
  }

  /*
   * This method is used to add product to the cart
   * 
   * (non-Javadoc)
   * 
   * @see
   * org.broadleafcommerce.core.web.api.endpoint.order.CartEndpoint#addProductToOrder(javax.servlet
   * .http.HttpServletRequest, javax.ws.rs.core.UriInfo, java.lang.Long, java.lang.Long, int,
   * boolean)
   */
  @Override
  @POST
  @Path("{productId}")
  public OrderWrapper addProductToOrder(@Context HttpServletRequest request,
      @Context UriInfo uriInfo, @PathParam("productId") Long productId,
      @QueryParam("categoryId") Long categoryId,
      @QueryParam("quantity") @DefaultValue("1") int quantity,
      @QueryParam("priceOrder") @DefaultValue("true") boolean priceOrder) {
    logger.debug("Executing method : addProductToOrder()");
    System.out.println(uriInfo.getQueryParameters());
    Iterator<Entry<String, List<String>>> it = uriInfo.getQueryParameters().entrySet().iterator();
    while (it.hasNext()) {
    	Map.Entry<String, List<String>> pair = (Map.Entry<String, List<String>>) it
				.next();
    	List<String> value = pair.getValue();
    	List<String> newList = new LinkedList<String>();
    	for (String option : value) {
			try {
				option = URLDecoder.decode(option,"UTF-8");
				System.out.print("--------------modified option = "+option);
				newList.add(option);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
    	uriInfo.getQueryParameters().put(pair.getKey(), newList);
    }
    return super.addProductToOrder(request, uriInfo, productId, categoryId, quantity, priceOrder);
  }

  /*
   * This method is used to remove product from the cart
   * 
   * (non-Javadoc)
   * 
   * @see
   * org.broadleafcommerce.core.web.api.endpoint.order.CartEndpoint#removeItemFromOrder(javax.servlet
   * .http.HttpServletRequest, java.lang.Long, boolean)
   */
  @Override
  @DELETE
  @Path("items/{itemId}")
  public OrderWrapper removeItemFromOrder(@Context HttpServletRequest request,
      @PathParam("itemId") Long itemId,
      @QueryParam("priceOrder") @DefaultValue("true") boolean priceOrder) {
    logger.debug("Executing method : removeItemFromOrder()");
    return super.removeItemFromOrder(request, itemId, priceOrder);
  }

  /*
   * This method is used to update the quantity of the product in the cart
   * 
   * (non-Javadoc)
   * 
   * @see
   * org.broadleafcommerce.core.web.api.endpoint.order.CartEndpoint#updateItemQuantity(javax.servlet
   * .http.HttpServletRequest, java.lang.Long, java.lang.Integer, boolean)
   */
  @Override
  @PUT
  @Path("items/{itemId}")
  public OrderWrapper updateItemQuantity(@Context HttpServletRequest request,
      @PathParam("itemId") Long itemId, @QueryParam("quantity") Integer quantity,
      @QueryParam("priceOrder") @DefaultValue("true") boolean priceOrder) {
    logger.debug("Executing method : updateItemQuantity()");
    return super.updateItemQuantity(request, itemId, quantity, priceOrder);
  }

  /*
   * This method is used to update the options of product in the cart
   * 
   * (non-Javadoc)
   * 
   * @see
   * org.broadleafcommerce.core.web.api.endpoint.order.CartEndpoint#updateProductOptions(javax.servlet
   * .http.HttpServletRequest, javax.ws.rs.core.UriInfo, java.lang.Long, boolean)
   */
  @Override
  @PUT
  @Path("items/{itemId}/options")
  public OrderWrapper updateProductOptions(@Context HttpServletRequest request,
      @Context UriInfo uriInfo, @PathParam("itemId") Long itemId,
      @QueryParam("priceOrder") @DefaultValue("true") boolean priceOrder) {
    logger.debug("Executing method : updateProductOptions()");
    return super.updateProductOptions(request, uriInfo, itemId, priceOrder);
  }

  /*
   * This method is used to add offer code to product in the cart
   * 
   * (non-Javadoc)
   * 
   * @see
   * org.broadleafcommerce.core.web.api.endpoint.order.CartEndpoint#addOfferCode(javax.servlet.http
   * .HttpServletRequest, java.lang.String, boolean)
   */
  @Override
  @POST
  @Path("offer")
  public OrderWrapper addOfferCode(@Context HttpServletRequest request,
      @QueryParam("promoCode") String promoCode,
      @QueryParam("priceOrder") @DefaultValue("true") boolean priceOrder) {
    logger.debug("Executing method : addOfferCode()");
    Order cart = CartState.getCart();

    if (cart == null || cart instanceof NullOrderImpl) {
      throw BroadleafWebServicesException.build(Response.Status.NOT_FOUND.getStatusCode())
          .addMessage(BroadleafWebServicesException.CART_NOT_FOUND);
    }

    OfferCode offerCode = offerService.lookupOfferCodeByCode(promoCode);

    if (offerCode == null) {
      throw BroadleafWebServicesException.build(Response.Status.NOT_FOUND.getStatusCode())
          .addMessage(BroadleafWebServicesException.PROMO_CODE_INVALID, promoCode);
    }

    try {
      if (cart.getOrderAdjustments().size() > 0) {
        orderService.removeAllOfferCodes(cart, priceOrder);
      }
      cart = orderService.addOfferCode(cart, offerCode, priceOrder);
      ExtendOrderWrapper wrapper =
          (ExtendOrderWrapper) context.getBean(ExtendOrderWrapper.class.getName());
      wrapper.wrapDetails(cart, request);
      return wrapper;
    } catch (PricingException e) {
      throw BroadleafWebServicesException.build(
          Response.Status.INTERNAL_SERVER_ERROR.getStatusCode(), null, null, e).addMessage(
          BroadleafWebServicesException.CART_PRICING_ERROR);
    } catch (OfferMaxUseExceededException e) {
      throw BroadleafWebServicesException.build(Response.Status.BAD_REQUEST.getStatusCode(), null,
          null, e).addMessage(BroadleafWebServicesException.PROMO_CODE_MAX_USAGES, promoCode);
    }
  }

  /*
   * This method is used to remove offer code from the product in the cart
   * 
   * (non-Javadoc)
   * 
   * @see
   * org.broadleafcommerce.core.web.api.endpoint.order.CartEndpoint#removeOfferCode(javax.servlet
   * .http.HttpServletRequest, java.lang.String, boolean)
   */
  @Override
  @DELETE
  @Path("offer")
  public OrderWrapper removeOfferCode(@Context HttpServletRequest request,
      @QueryParam("promoCode") String promoCode,
      @QueryParam("priceOrder") @DefaultValue("true") boolean priceOrder) {
    logger.debug("Executing method : removeOfferCode()");
    return super.removeOfferCode(request, promoCode, priceOrder);
  }

  /*
   * This method is used to remove all offer codes from the cart
   * 
   * (non-Javadoc)
   * 
   * @see
   * org.broadleafcommerce.core.web.api.endpoint.order.CartEndpoint#removeAllOfferCodes(javax.servlet
   * .http.HttpServletRequest, boolean)
   */
  @Override
  @DELETE
  @Path("offers")
  public OrderWrapper removeAllOfferCodes(@Context HttpServletRequest request,
      @QueryParam("priceOrder") @DefaultValue("true") boolean priceOrder) {
    logger.debug("Executing method : removeAllOfferCodes()");
    return super.removeAllOfferCodes(request, priceOrder);
  }
}

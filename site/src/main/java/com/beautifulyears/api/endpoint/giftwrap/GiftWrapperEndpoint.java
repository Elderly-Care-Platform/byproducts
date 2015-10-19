package com.beautifulyears.api.endpoint.giftwrap;

import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.broadleafcommerce.common.money.Money;
import org.broadleafcommerce.core.catalog.domain.Category;
import org.broadleafcommerce.core.catalog.domain.CategoryImpl;
import org.broadleafcommerce.core.catalog.domain.Product;
import org.broadleafcommerce.core.catalog.domain.ProductImpl;
import org.broadleafcommerce.core.catalog.domain.Sku;
import org.broadleafcommerce.core.catalog.domain.SkuImpl;
import org.broadleafcommerce.core.catalog.service.CatalogService;
import org.broadleafcommerce.core.order.dao.OrderItemDao;
import org.broadleafcommerce.core.order.domain.GiftWrapOrderItem;
import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.domain.OrderItem;
import org.broadleafcommerce.core.order.service.OrderItemService;
import org.broadleafcommerce.core.order.service.OrderService;
import org.broadleafcommerce.core.order.service.call.GiftWrapOrderItemRequest;
import org.broadleafcommerce.core.order.service.type.OrderItemType;
import org.broadleafcommerce.core.web.api.endpoint.BaseEndpoint;
import org.broadleafcommerce.core.web.api.wrapper.OrderWrapper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * This is giftwrapper endpoint which is used to giftwrap an order. As per the broadleaf code, when
 * user wants to giftwrap an order, giftwrap will be added as an order item within that order. So,
 * to giftwrap an order there should be one product with giftwrap. And to have product we must have
 * category and default sku. So in that case, either we can create product for giftwrap everytime
 * when customer wants to giftwrap an order or we can create one product for giftwrap permanently
 * and use that product every time. With giftwrap we required to set sku. So we can use either
 * product's default sku or can create new sku depends on requirements and set it with giftwrapitem
 * object.
 * 
 * @author Aspire Software Solutions
 *
 */
@Component
@Scope("singleton")
@Path("/giftwrap/")
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class GiftWrapperEndpoint extends BaseEndpoint {

  final static Logger logger = Logger.getLogger(GiftWrapperEndpoint.class);

  @Resource(name = "blOrderService")
  protected OrderService orderService;

  @Resource(name = "blOrderItemDao")
  protected OrderItemDao orderItemDao;

  @Resource(name = "blOrderItemService")
  protected OrderItemService orderItemService;

  @Resource
  protected CatalogService catalogService;

  /**
   * This is post method which is used to save giftwrap.
   * 
   * @param request
   * @param orderId
   * @return
   * @throws Exception
   */
  @POST
  @Path("add")
  public OrderWrapper addGiftWrapper(@Context HttpServletRequest request,
      @QueryParam("orderId") Long orderId) throws Exception {
    logger.debug("Executing method : addGiftWrapper()");
    OrderWrapper orderWrapper = (OrderWrapper) context.getBean(OrderWrapper.class.getName());
    if (null != orderId) {
      logger.info("Getting order with order id = " + orderId);
      Order order = orderService.findOrderById(orderId);

      Product giftWrapProduct = catalogService.findProductById((long) 9951);
      // Product giftWrapProduct = addProduct("Gift Box", "Gift Wraps", true);

      try {
        GiftWrapOrderItem item =
            createGiftWrapOrderItem(createGiftWrapOrderItemRequest(giftWrapProduct,
                giftWrapProduct.getDefaultSku(), 1, order.getOrderItems()));
        item.setOrder(order);
        item = (GiftWrapOrderItem) orderItemService.saveOrderItem(item);
        item.assignFinalPrice();
        item = (GiftWrapOrderItem) orderItemService.saveOrderItem(item);
        order.getOrderItems().add(item);
        order = orderService.save(order, true);
      } catch (Exception e) {
        e.printStackTrace();
        logger.error("Getting exception in giftwrapping an order with order id = " + orderId);
      }
      orderWrapper.wrapSummary(order, request);
    }
    return orderWrapper;
  }

  /**
   * To add new product within database. Currently this method is used to add product for giftwrap.
   * 
   * @param productName
   * @param categoryName
   * @param active
   * @return
   */
  protected Product addProduct(String productName, String categoryName, boolean active)
      throws Exception {
    logger.debug("Executing method : addProduct()");
    Calendar activeStartCal = Calendar.getInstance();
    activeStartCal.add(Calendar.DAY_OF_YEAR, -2);

    Calendar activeEndCal = Calendar.getInstance();
    activeEndCal.add(Calendar.DAY_OF_YEAR, -1);

    Category category = new CategoryImpl();
    category.setName(categoryName);
    category.setActiveStartDate(activeStartCal.getTime());
    category = catalogService.saveCategory(category);

    Sku newSku = createSku(productName, 44.99);

    Product newProduct = new ProductImpl();
    newProduct.setDefaultCategory(category);
    newProduct.setDefaultSku(newSku);
    newProduct = catalogService.saveProduct(newProduct);

    return newProduct;
  }

  /**
   * To save an order with giftwrap we need to create new sku or we can use product's default sku.
   * This method is used for that. Currently we are using product's default sku.
   * 
   * @param productName
   * @param price
   * @return
   */
  private Sku createSku(String productName, double price) throws Exception {
    logger.debug("Executing method : createSku()");
    Calendar activeStartCal = Calendar.getInstance();
    activeStartCal.add(Calendar.DAY_OF_YEAR, -2);

    Calendar activeEndCal = Calendar.getInstance();
    activeEndCal.add(Calendar.DAY_OF_YEAR, -1);
    Sku newSku = new SkuImpl();
    newSku.setName(productName);
    newSku.setRetailPrice(new Money(price));
    newSku.setActiveStartDate(activeStartCal.getTime());
    // newSku.setDiscountable(true);
    newSku.setDiscountable(false);
    newSku = catalogService.saveSku(newSku);
    return newSku;
  }

  /**
   * This method is used to create new giftwrap item request.
   * 
   * @param product
   * @param sku
   * @param quantity
   * @param wrappedItems
   * @return
   */
  private GiftWrapOrderItemRequest createGiftWrapOrderItemRequest(Product product, Sku sku,
      int quantity, List<OrderItem> wrappedItems) throws Exception {
    logger.debug("Executing method : createSku()");
    GiftWrapOrderItemRequest request = new GiftWrapOrderItemRequest();
    request.setSku(sku);
    request.setQuantity(quantity);
    request.setProduct(product);
    request.setCategory(product.getDefaultCategory());
    request.setWrappedItems(wrappedItems);
    return request;
  }

  /**
   * This method is used to create new giftwrap order item.
   * 
   * @param itemRequest
   * @return
   * @throws Exception
   */
  public GiftWrapOrderItem createGiftWrapOrderItem(final GiftWrapOrderItemRequest itemRequest)
      throws Exception {
    logger.debug("Executing method : createGiftWrapOrderItem()");
    final GiftWrapOrderItem item = (GiftWrapOrderItem) orderItemDao.create(OrderItemType.GIFTWRAP);
    item.setSku(itemRequest.getSku());
    item.setOrder(itemRequest.getOrder());
    item.setBundleOrderItem(itemRequest.getBundleOrderItem());
    item.setQuantity(itemRequest.getQuantity());
    item.setCategory(itemRequest.getCategory());
    item.setProduct(itemRequest.getProduct());
    item.setBaseSalePrice(itemRequest.getSku().getSalePrice());
    item.setBaseRetailPrice(itemRequest.getSku().getRetailPrice());
    item.setDiscreteOrderItemFeePrices(itemRequest.getDiscreteOrderItemFeePrices());

    if (itemRequest.getSalePriceOverride() != null) {
      item.setSalePriceOverride(Boolean.TRUE);
      item.setSalePrice(itemRequest.getSalePriceOverride());
      item.setBaseSalePrice(itemRequest.getSalePriceOverride());
    }

    if (itemRequest.getRetailPriceOverride() != null) {
      item.setRetailPriceOverride(Boolean.TRUE);
      item.setRetailPrice(itemRequest.getRetailPriceOverride());
      item.setBaseRetailPrice(itemRequest.getRetailPriceOverride());
    }

    item.updateSaleAndRetailPrices();
    // item.assignFinalPrice();
    item.getWrappedItems().addAll(itemRequest.getWrappedItems());
    for (OrderItem orderItem : item.getWrappedItems()) {
      orderItem.setGiftWrapOrderItem(item);
    }

    return item;
  }
}

/*
 * Copyright 2008-2012 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.beautifulyears.api.endpoint.checkout;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.broadleafcommerce.core.checkout.service.exception.CheckoutException;
import org.broadleafcommerce.core.checkout.service.workflow.CheckoutResponse;
import org.broadleafcommerce.core.order.domain.FulfillmentGroup;
import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.domain.OrderAttribute;
import org.broadleafcommerce.core.order.domain.OrderAttributeImpl;
import org.broadleafcommerce.core.order.domain.OrderItem;
import org.broadleafcommerce.core.pricing.service.exception.PricingException;
import org.broadleafcommerce.core.web.api.BroadleafWebServicesException;
import org.broadleafcommerce.core.web.api.wrapper.OrderPaymentWrapper;
import org.broadleafcommerce.core.web.api.wrapper.OrderWrapper;
import org.broadleafcommerce.core.web.order.CartState;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.beautifulyears.BYConstants;
import com.beautifulyears.api.wrapper.ExtendOrderPaymentWrapper;
import com.beautifulyears.api.wrapper.ExtendOrderWrapper;
import com.beautifulyears.sample.profile.domain.ExtendAddress;
import com.beautifulyears.service.email.ExtendEmailService;
import com.beautifulyears.service.logistic.checkOut.LogisticCheckOutService;

/**
 * This endpoint provides rest for checkout.
 * 
 * @author Aspire Software Solutions
 *
 */
@Component
@Scope("singleton")
@Path("/cart/checkout/")
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class CheckoutEndpoint extends
    org.broadleafcommerce.core.web.api.endpoint.checkout.CheckoutEndpoint {

  final static Logger logger = Logger.getLogger(CheckoutEndpoint.class);
  
  @Resource(name = "blLogisticCheckoutService")
	protected LogisticCheckOutService logisticCheckoutService;

  /*
   * This method is used to get payment details for order
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.checkout.CheckoutEndpoint
   * #findPaymentsForOrder( javax.servlet.http.HttpServletRequest)
   */
  @Override
  @GET
  @Path("payments")
  public List<OrderPaymentWrapper> findPaymentsForOrder(@Context HttpServletRequest request) {
    logger.debug("Executing method : findPaymentsForOrder()");
    return super.findPaymentsForOrder(request);
  }

  /*
   * This method is used to add payment details to the order
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.checkout.CheckoutEndpoint
   * #addPaymentToOrder(javax .servlet.http.HttpServletRequest,
   * org.broadleafcommerce.core.web.api.wrapper.OrderPaymentWrapper)
   */
  @POST
  @Path("payment")
  public OrderPaymentWrapper addPaymentToOrder(@Context HttpServletRequest request,
      ExtendOrderPaymentWrapper wrapper) {
    logger.debug("Executing method : addPaymentToOrder()");
    return super.addPaymentToOrder(request, wrapper);
  }

  /*
   * This method is used to remove payment details from the order
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.endpoint.checkout.CheckoutEndpoint
   * #removePaymentFromOrder (javax.servlet.http.HttpServletRequest,
   * org.broadleafcommerce.core.web.api.wrapper.OrderPaymentWrapper)
   */
  @Override
  @DELETE
  @Path("payment")
  public OrderWrapper removePaymentFromOrder(@Context HttpServletRequest request,
      OrderPaymentWrapper wrapper) {
    logger.debug("Executing method : removePaymentFromOrder()");
    return super.removePaymentFromOrder(request, wrapper);
  }

  /**
   * It is used to perform checkout operation, Extend endpoint to save shipping address
   * 
   * @param request
   * @param orderWrapper
   * @return
 * @throws PricingException 
   * 
   */

  @POST
  public OrderWrapper performCheckout(@Context HttpServletRequest request,
      ExtendOrderWrapper orderWrapper) throws PricingException {
	  int sessionType = (Integer)request.getAttribute("sessionType");
	  
	  if(sessionType != 0){
		  if(sessionType == 1){
			  throw BroadleafWebServicesException.build(500).addMessage("3010");
		  }else{
			  throw BroadleafWebServicesException.build(500).addMessage("3011");
		  }
	  }
    logger.debug("Executing method : performCheckout()");
    // Get the cart
    Order cart = CartState.getCart();
    if (cart != null) {
      try {
        ExtendAddress address = null;
        // Get the unwrapped order from the wrapper
        Order order = orderWrapper.unwrap(request, context);
        // Set fulfillment group in cart
        cart.setFulfillmentGroups(order.getFulfillmentGroups());
        // Get the address selected by Customer
        for (FulfillmentGroup fulfillment : order.getFulfillmentGroups()) {
          address = (ExtendAddress) fulfillment.getAddress();
        }
        
        
        Map<String, OrderAttribute>  attributeMap;
        if(null != order.getOrderAttributes()){
        	attributeMap = order.getOrderAttributes();
        }else{
        	attributeMap = new HashMap<String, OrderAttribute>();
        }
       Map<String, String> addressMap = address.getAddressMap();
        for (String key : addressMap.keySet()) {
        	OrderAttribute addressAttribute = new OrderAttributeImpl();
	        addressAttribute.setName(key);
	        addressAttribute.setValue(addressMap.get(key));
	        addressAttribute.setOrder(order);
	        attributeMap.put(key, addressAttribute);
        }
        order.setOrderAttributes(attributeMap);
        
        
        
          CheckoutResponse response = checkoutService.performCheckout(cart);
          System.out.println("System checkout done completely..trying out logistic checkout");
//          CheckoutResponse response1 = logisticCheckoutService.checkOut(cart);
          // Get order and wrap it
          order = response.getOrder();
          ExtendOrderWrapper wrapper =
              (ExtendOrderWrapper) context.getBean(ExtendOrderWrapper.class.getName());
          wrapper.wrapDetails(order, request);

//          // Send confirmation mail
//          ExtendEmailService emailService =
//              (ExtendEmailService) context.getBean("extendEmailService");
//          try {
//        	  if(null != address.getPrimaryEmail()){
//        		  emailService.sendOrderConfirmation(order, null, address.getPrimaryEmail());
//        	  }
//        	  for(String adminEmail : BYConstants.ADMIN_EMAILS){
//        		  emailService.sendOrderConfirmationAdmin(order, null,
//        				  adminEmail);
//        	  }
//        	  
//        	  for(OrderItem item : order.getOrderItems()){
//        		  for(String adminEmail : BYConstants.ADMIN_EMAILS){
//            		  emailService.sendOrderItemConfirmation(order, item, adminEmail);
//            	  }
//        	  }
//            
//          } catch (IOException e) {
//            e.printStackTrace();
//          }
          return wrapper;
      } catch (CheckoutException e) {
        throw BroadleafWebServicesException.build(
            Response.Status.INTERNAL_SERVER_ERROR.getStatusCode()).addMessage(
            BroadleafWebServicesException.CHECKOUT_PROCESSING_ERROR);
      }
    }

    throw BroadleafWebServicesException.build(Response.Status.NOT_FOUND.getStatusCode())
        .addMessage(BroadleafWebServicesException.CART_NOT_FOUND);
  }
}

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

package com.beautifulyears.api.endpoint.cart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.broadleafcommerce.core.catalog.domain.Product;
import org.broadleafcommerce.core.catalog.domain.Sku;
import org.broadleafcommerce.core.catalog.service.CatalogService;
import org.broadleafcommerce.core.order.domain.BundleOrderItem;
import org.broadleafcommerce.core.order.domain.DiscreteOrderItem;
import org.broadleafcommerce.core.order.domain.FulfillmentGroup;
import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.domain.OrderItem;
import org.broadleafcommerce.core.order.service.type.OrderStatus;
import org.broadleafcommerce.core.pricing.service.exception.PricingException;
import org.broadleafcommerce.core.web.api.BroadleafWebServicesException;
import org.broadleafcommerce.profile.core.domain.Customer;
import org.broadleafcommerce.profile.web.core.CustomerState;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.beautifulyears.api.wrapper.ExtendOrderWrapper;
import com.beautifulyears.api.wrapper.OrderHistoryWrapper;
import com.beautifulyears.domain.fedex.CancelPendingShipmentWebService;
import com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo;
import com.beautifulyears.sample.profile.domain.ExtendAddress;
import com.beautifulyears.service.email.ExtendEmailService;
import com.beautifulyears.service.fedExOrder.FedExOrderService;
import com.beautifulyears.webserviceclient.CancelPendingShipmentWebServiceClient;

/**
 * This endpoint provides rest related to order.
 * 
 * @author Aspire Software Solutions
 *
 */
@Component
@Scope("singleton")
@Path("/orders/")
@Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class OrderHistoryEndpoint extends
    org.broadleafcommerce.core.web.api.endpoint.order.OrderHistoryEndpoint {

  final static Logger logger = Logger.getLogger(OrderHistoryEndpoint.class);

  @Resource(name = "blCatalogService")
  protected CatalogService catalogService;

  /*
   * This method is used to get order for particular customer
   * 
   * (non-Javadoc)
   * 
   * @see
   * org.broadleafcommerce.core.web.api.endpoint.order.OrderHistoryEndpoint#findOrdersForCustomer
   * (javax.servlet.http.HttpServletRequest, java.lang.String)
   */
  @GET
  public OrderHistoryWrapper findOrdersForCustomer(@Context HttpServletRequest request,
      @QueryParam("orderStatus") @DefaultValue("SUBMITTED") String orderStatus,
      @QueryParam("pageSize") @DefaultValue("10") Integer pageSize,
      @QueryParam("page") @DefaultValue("1") Integer page,
      @QueryParam("timeInterval") @DefaultValue("Past30Days") String timeInterval) {
    logger.debug("Executing method : findOrdersForCustomer()");
    Customer customer = CustomerState.getCustomer(request);
    OrderStatus status = OrderStatus.getInstance(orderStatus);

    if (customer != null && status != null) {
      List<Order> orders = orderService.findOrdersForCustomer(customer, OrderStatus.SUBMITTED);
      List<Order> deliveredOrders =
          orderService.findOrdersForCustomer(customer, OrderStatus.DELIVERED);
      if (null != deliveredOrders && !deliveredOrders.isEmpty()) {
        orders.addAll(deliveredOrders);
      }

      if (orders != null && !orders.isEmpty()) {
        Date date = new Date();
        List<Order> filterOrderList = new ArrayList<Order>();
        if (timeInterval.equals("Past30Days")) {
          date.setMonth(date.getMonth() - 1);
          date.setHours(0);
          date.setMinutes(0);
          date.setSeconds(0);
          for (Order order : orders) {
            if (order.getSubmitDate().compareTo(date) > 0) {
              filterOrderList.add(order);
            }
          }
        } else if (timeInterval.equals("Past6months")) {
          date.setMonth(date.getMonth() - 6);
          date.setHours(0);
          date.setHours(0);
          date.setMinutes(0);
          date.setSeconds(0);
          for (Order order : orders) {
            if (order.getSubmitDate().compareTo(date) > 0) {
              filterOrderList.add(order);
            }
          }
        } else {
          filterOrderList = orders;
        }

        int size = filterOrderList.size();
        orders = getOrderPagination(filterOrderList, page, pageSize);
        OrderHistoryWrapper orderHistoryWrapper =
            (OrderHistoryWrapper) context.getBean(OrderHistoryWrapper.class.getName());
        orderHistoryWrapper.wrapDetails(size, orders, request);
        return orderHistoryWrapper;
      }

      throw BroadleafWebServicesException.build(Response.Status.NOT_FOUND.getStatusCode())
          .addMessage(BroadleafWebServicesException.CART_NOT_FOUND);
    }

    throw BroadleafWebServicesException.build(Response.Status.BAD_REQUEST.getStatusCode())
        .addMessage(BroadleafWebServicesException.CUSTOMER_NOT_FOUND);
  }

  /**
   * Get order details based on order id
   * 
   * @param request
   * @param orderId
   * @return
   */
  @GET
  @Path("{orderId}")
  public ExtendOrderWrapper getOrderById(@Context HttpServletRequest request,
      @PathParam("orderId") Long orderId) {
    Order order = orderService.findOrderById(orderId);
    ExtendOrderWrapper wrapper =
        (ExtendOrderWrapper) context.getBean(ExtendOrderWrapper.class.getName());
    wrapper.wrapSummary(order, request);
    return wrapper;
  }

  /**
   * Cancel orders
   * 
   * @param request
   * @param orderId
   * @return
   */
  @DELETE
  @Path("{orderId}")
  public ExtendOrderWrapper cancelOrder(@Context HttpServletRequest request,
      @PathParam("orderId") Long orderId, @QueryParam("trackingNumber") String trackingNumber) {
    ExtendOrderWrapper wrapper =
        (ExtendOrderWrapper) context.getBean(ExtendOrderWrapper.class.getName());

    if (null != orderId && null != trackingNumber) {

      // Cancel fedex shipment
      CancelPendingShipmentWebService model =
          CancelPendingShipmentWebServiceClient.cancelPendingShipmentWebService(trackingNumber);

      // TODO Set error to success
      if (model.getCancelPendingShipmentServiceSeverity() == "ERROR") {
        Order order = orderService.findOrderById(orderId);
        order.setStatus(OrderStatus.CANCELLED);
        wrapper.wrapSummary(order, request);

        // Update product quantity
        Long productId = null;
        List<OrderItem> orderItems = order.getOrderItems();
        for (OrderItem orderItem : orderItems) {
          if (orderItem instanceof DiscreteOrderItem) {
            DiscreteOrderItem doi = (DiscreteOrderItem) orderItem;
            productId = doi.getProduct().getId();
          } else if (orderItem instanceof BundleOrderItem) {
            BundleOrderItem doi = (BundleOrderItem) orderItem;
            productId = doi.getProduct().getId();
          }
          int quantity = orderItem.getQuantity();
          Product product = catalogService.findProductById(productId);
          Sku sku = product.getDefaultSku();
          Integer quantityAvailable = sku.getQuantityAvailable();
          if (null != quantityAvailable) {
            quantityAvailable = quantityAvailable + quantity;
            sku.setQuantityAvailable(quantityAvailable);
          }
        }

        // Cancel order
        FedExOrderService fedExOrderService =
            (FedExOrderService) context.getBean("blFedExOrderService");
        OrderTrackingInfo trackInfo = fedExOrderService.findOrderByOrderId(orderId);
        fedExOrderService.removeTrackingInfo(trackInfo);
        orderService.cancelOrder(order);

        // Send cancellation mail
        ExtendEmailService emailService =
            (ExtendEmailService) context.getBean("extendEmailService");
        ExtendAddress address = null;
        for (FulfillmentGroup fulfillmentGroup : order.getFulfillmentGroups()) {
          address = (ExtendAddress) fulfillmentGroup.getAddress();
        }
        try {
          emailService.sendOrderCancellation(order, address.getPrimaryEmail());
          emailService.sendOrderCancellationAdmin(order, "jharana.v@beautifulyears.com");
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    return wrapper;
  }

  /**
   * Save feedback
   * 
   * @param request
   * @param orderId
   * @param wrapper
   * @return
   */
  @POST
  @Path("feedback/{orderId}")
  public ExtendOrderWrapper cancelOrder(@Context HttpServletRequest request,
      @PathParam("orderId") Long orderId, ExtendOrderWrapper wrapper) {
    Order order = wrapper.unwrap(request, context);
    try {
      order = orderService.save(order, false);
    } catch (PricingException e) {
      e.printStackTrace();
    }
    ExtendOrderWrapper exwrapper =
        (ExtendOrderWrapper) context.getBean(ExtendOrderWrapper.class.getName());
    exwrapper.wrapDetails(order, request);
    return exwrapper;
  }

  /**
   * Return paginated list
   * 
   * @param orders
   * @param page
   * @param pageSize
   * @return
   */
  private List<Order> getOrderPagination(List<Order> orders, Integer page, Integer pageSize) {
    if (null != orders && orders.size() > 0) {
      int listSize = orders.size();

      int startIndex = (page - 1) * pageSize;
      int endIndex = startIndex + pageSize;

      if (listSize < endIndex) {
        endIndex = listSize;
      }
      if (listSize >= startIndex) {
        orders = orders.subList(startIndex, endIndex);
      } else {
        orders.clear();
      }
    }
    return orders;
  }
}

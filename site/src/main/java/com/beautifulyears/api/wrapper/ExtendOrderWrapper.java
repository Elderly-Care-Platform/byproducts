package com.beautifulyears.api.wrapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.log4j.Logger;
import org.broadleafcommerce.common.currency.util.BroadleafCurrencyUtils;
import org.broadleafcommerce.common.money.Money;
import org.broadleafcommerce.core.offer.domain.OrderAdjustment;
import org.broadleafcommerce.core.order.domain.DiscreteOrderItem;
import org.broadleafcommerce.core.order.domain.FulfillmentGroup;
import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.domain.OrderAttribute;
import org.broadleafcommerce.core.order.domain.OrderItem;
import org.broadleafcommerce.core.order.service.OrderService;
import org.broadleafcommerce.core.order.service.call.ActivityMessageDTO;
import org.broadleafcommerce.core.payment.domain.OrderPayment;
import org.broadleafcommerce.core.web.api.wrapper.APIUnwrapper;
import org.broadleafcommerce.core.web.api.wrapper.AdjustmentWrapper;
import org.broadleafcommerce.core.web.api.wrapper.CartMessageWrapper;
import org.broadleafcommerce.core.web.api.wrapper.CustomerWrapper;
import org.broadleafcommerce.core.web.api.wrapper.FulfillmentGroupWrapper;
import org.broadleafcommerce.core.web.api.wrapper.OrderAttributeWrapper;
import org.broadleafcommerce.core.web.api.wrapper.OrderPaymentWrapper;
import org.broadleafcommerce.core.web.api.wrapper.OrderWrapper;
import org.broadleafcommerce.profile.core.domain.Address;
import org.springframework.context.ApplicationContext;

import com.beautifulyears.sample.catalog.domain.ExtendProductImpl;
import com.beautifulyears.sample.profile.domain.ExtendAddress;

/**
 * This wrapper provides wrap and unwrap method for order
 * 
 * @author Aspire Software Solutions
 *
 */
@XmlRootElement(name = "order")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class ExtendOrderWrapper extends OrderWrapper implements APIUnwrapper<Order> {

  final static Logger logger = Logger.getLogger(ExtendOrderWrapper.class);

  @XmlElement
  private String orderNumber;

  @XmlElement
  private Date submittedDate;

  @XmlElement(name = "fulfillmentGroup")
  @XmlElementWrapper(name = "fulfillmentGroups")
  protected List<ExtendFulfillmentGroupWrapper> fulfillmentGroups;

  @XmlElement(name = "payment")
  @XmlElementWrapper(name = "payments")
  protected List<ExtendOrderPaymentWrapper> payments;

  @XmlElement(name = "orderAdjustment")
  @XmlElementWrapper(name = "orderAdjustments")
  protected List<ExtendAdjustmentWrapper> orderAdjustments;

  @XmlElement(name = "trackingInfo")
  protected FedExTrackingWrapper trackingInfo;

  @XmlElement(name = "feedback")
  protected String feedback;

	@XmlElement(name = "orderItem")
	@XmlElementWrapper(name = "orderItems")
	protected List<ExtendOrderItemWrapper> orderItems;

	/*
	 * Extend wrap details method to add extended entities in existing wrapper
	 * 
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.broadleafcommerce.core.web.api.wrapper.OrderWrapper#wrapDetails(org
	 * .broadleafcommerce.core .order.domain.Order,
	 * javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public void wrapDetails(Order model, HttpServletRequest request) {
		this.id = model.getId();
		Address address = null;

    if (model.getStatus() != null) {
      this.status = model.getStatus().getType();
    }

    if (model.getFeedback() != null) {
      this.feedback = model.getFeedback();
    }

    this.totalTax = model.getTotalTax();
    this.totalShipping = model.getTotalShipping();
    this.subTotal = model.getSubTotal();
    this.total = model.getTotal();
    this.orderNumber = model.getOrderNumber();
    this.submittedDate = model.getSubmitDate();
    if (model.getOrderItems() != null && !model.getOrderItems().isEmpty()) {
			this.orderItems = new ArrayList<ExtendOrderItemWrapper>();
      for (OrderItem orderItem : model.getOrderItems()) {
				ExtendOrderItemWrapper orderItemWrapper = (ExtendOrderItemWrapper) context
						.getBean(ExtendOrderItemWrapper.class.getName());
        orderItemWrapper.wrapSummary(orderItem, request);
        this.orderItems.add(orderItemWrapper);
      }
    }

    if (model.getFulfillmentGroups() != null && !model.getFulfillmentGroups().isEmpty()) {
      this.fulfillmentGroups = new ArrayList<ExtendFulfillmentGroupWrapper>();
      for (FulfillmentGroup fulfillmentGroup : model.getFulfillmentGroups()) {
        address = fulfillmentGroup.getAddress();
        FulfillmentGroupWrapper fulfillmentGroupWrapper =
            (FulfillmentGroupWrapper) context.getBean(FulfillmentGroupWrapper.class.getName());
        fulfillmentGroupWrapper.wrapSummary(fulfillmentGroup, request);
        this.fulfillmentGroups.add((ExtendFulfillmentGroupWrapper) fulfillmentGroupWrapper);
      }
    }

    if (model.getPayments() != null && !model.getPayments().isEmpty()) {
      this.payments = new ArrayList<ExtendOrderPaymentWrapper>();
      for (OrderPayment payment : model.getPayments()) {
        ExtendOrderPaymentWrapper paymentWrapper =
            (ExtendOrderPaymentWrapper) context.getBean(OrderPaymentWrapper.class.getName());
        paymentWrapper.wrapSummary(payment, request);
        this.payments.add(paymentWrapper);
      }
    }

    if (model.getOrderAdjustments() != null && !model.getOrderAdjustments().isEmpty()) {
      this.orderAdjustments = new ArrayList<ExtendAdjustmentWrapper>();
      for (OrderAdjustment orderAdjustment : model.getOrderAdjustments()) {
        AdjustmentWrapper orderAdjustmentWrapper =
            (AdjustmentWrapper) context.getBean(AdjustmentWrapper.class.getName());
        orderAdjustmentWrapper.wrapDetails(orderAdjustment, request);
        this.orderAdjustments.add((ExtendAdjustmentWrapper) orderAdjustmentWrapper);
      }
    }

    if (model.getOrderAttributes() != null && !model.getOrderAttributes().isEmpty()) {
      Map<String, OrderAttribute> itemAttributes = model.getOrderAttributes();
      this.orderAttributes = new ArrayList<OrderAttributeWrapper>();
      Set<String> keys = itemAttributes.keySet();
      for (String key : keys) {
        OrderAttributeWrapper orderAttributeWrapper =
            (OrderAttributeWrapper) context.getBean(OrderAttributeWrapper.class.getName());
        orderAttributeWrapper.wrapSummary(itemAttributes.get(key), request);
        this.orderAttributes.add(orderAttributeWrapper);
      }
    }
    CustomerWrapper customerWrapper =
        (CustomerWrapper) context.getBean(CustomerWrapper.class.getName());
    customerWrapper.wrapDetails(model.getCustomer(), request);
    this.customer = customerWrapper;

    if (model.getOrderMessages() != null && !model.getOrderMessages().isEmpty()) {
      for (ActivityMessageDTO dto : model.getOrderMessages()) {

        CartMessageWrapper cartMessageWrapper =
            (CartMessageWrapper) context.getBean(CartMessageWrapper.class.getName());
        cartMessageWrapper.wrapSummary(dto, request);
        if (cartMessages == null) {
          cartMessages = new ArrayList<CartMessageWrapper>();
        }
        this.cartMessages.add(cartMessageWrapper);

      }
    }

//    if (model.getStatus() != OrderStatus.IN_PROCESS) {
//      // To append the FedEx information to the response of Order Checkout
//      FedExOrderService fedExOrderService =
//          (FedExOrderService) context.getBean("blFedExOrderService");
//      OrderTrackingInfo orderTrackingInfo = fedExOrderService.findOrderByOrderId(this.id);
//      FedExTrackingWrapper fedexwrapper =
//          (FedExTrackingWrapper) context.getBean(FedExTrackingWrapper.class.getName());
//      fedexwrapper.wrapDetails(orderTrackingInfo, request);
//      this.trackingInfo = fedexwrapper;
//    }
  }

  /*
   * Unwrap the json of order and return object of order
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.APIUnwrapper#unwrap(javax. servlet.http.
   * HttpServletRequest, org.springframework.context.ApplicationContext)
   */
  @Override
  public Order unwrap(HttpServletRequest request, ApplicationContext context) {
    logger.debug("Executing method : unwrap()");
    // Find order by order id
    OrderService orderService = (OrderService) context.getBean("blOrderService");
    Order order = orderService.findOrderById(this.id);
    if (this.fulfillmentGroups != null) {
      ExtendAddress address = null;
      List<FulfillmentGroup> fulfillmentGroupList = new ArrayList<FulfillmentGroup>();
      // Unwrap fulfillment group passed in json and get the shipping address
      for (ExtendFulfillmentGroupWrapper fulfillmentGroupWrapper : this.fulfillmentGroups) {
        address = (ExtendAddress) fulfillmentGroupWrapper.unwrap(request, context).getAddress();
      }
      // Add shipping address in fulfillment group
      for (FulfillmentGroup FulfillmentGroup : order.getFulfillmentGroups()) {
        FulfillmentGroup.setAddress(address);
        fulfillmentGroupList.add(FulfillmentGroup);
      }
			
      // Set shippping address in order
      order.setFulfillmentGroups(fulfillmentGroupList);
    }

    if (this.feedback != null) {
      order.setFeedback(this.feedback);
    }
    return order;
  }

  /*
   * Wrap the model
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.OrderWrapper#wrapSummary(org
   * .broadleafcommerce.core .order.domain.Order, javax.servlet.http.HttpServletRequest)
   */
  @Override
  public void wrapSummary(Order model, HttpServletRequest request) {
    wrapDetails(model, request);
  }

}

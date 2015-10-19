package com.beautifulyears.util.service;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.broadleafcommerce.core.order.domain.FulfillmentGroup;
import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.service.OrderService;
import org.broadleafcommerce.core.order.service.type.OrderStatus;
import org.broadleafcommerce.core.pricing.service.exception.PricingException;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.beautifulyears.sample.profile.domain.ExtendAddress;
import com.beautifulyears.service.email.ExtendEmailService;
import com.beautifulyears.service.order.ExtendOrderService;

/**
 * This service update status of order from fedex and send mail for feedback
 * 
 * @author Aspire Software Solutions
 *
 */
@Service("blUpdateOrderStatusService")
public class UpdateOrderStatusServiceImpl implements UpdateOrderStatusService {

  @Resource(name = "blExtendOrderService")
  protected ExtendOrderService extendOrderService;

  @Resource(name = "blOrderService")
  protected OrderService orderService;

  protected ApplicationContext context;

  @Resource(name = "extendEmailService")
  protected ExtendEmailService emailService;

  /*
   * Update Order Status
   * 
   * (non-Javadoc)
   * 
   * @see com.beautifulyears.util.service.UpdateOrderStatusService#updateOrderStatus()
   */
  @Override
  public void updateOrderStatus() {

    List<Order> orders = extendOrderService.findOrderByStatus(OrderStatus.SUBMITTED);

    // Implement fedex here
    for (Order order : orders) {
      // request fedex service to get status of the order
      // get status of order from fedex and set it in order
      try {
        OrderStatus status = OrderStatus.DELIVERED; // get status from fedex service
        // check if condition for checking order status is delivered or not, if condition is true,
        // put above code for sending mail in if block
        order.setStatus(status); // set status to order
        orderService.save(order, false); // save order to store updated status in DB

        ExtendAddress address = null;
        for (FulfillmentGroup fulfillmentGroup : order.getFulfillmentGroups()) {
          address = (ExtendAddress) fulfillmentGroup.getAddress();
        }
        try {
          emailService.sendFeedback(order, address.getPrimaryEmail());
        } catch (IOException e) {
          e.printStackTrace();
        }
      } catch (PricingException e) {
        e.printStackTrace();
      }
    }
  }
}

package com.beautifulyears.service.email;

import java.io.IOException;

import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.domain.OrderItem;

import com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo;

/**
 * Interface for sending mail
 * 
 * @author Aspire Software Solutions
 *
 */
public interface ExtendEmailService {
  void sendOrderConfirmation(Order order, OrderTrackingInfo orderTrackingInfo, String emailAddress)
      throws IOException;
  
  void sendOrderCancellation(Order order, String string) throws IOException;

  void sendOrderConfirmationAdmin(Order order, OrderTrackingInfo orderTrackingInfo, String string)
      throws IOException;

  void sendOrderCancellationAdmin(Order order, String emailAddress) throws IOException;

  void sendFeedback(Order order, String string) throws IOException;

void sendOrderItemConfirmation(Order order, OrderItem item, String emailAddress)
		throws IOException;
}

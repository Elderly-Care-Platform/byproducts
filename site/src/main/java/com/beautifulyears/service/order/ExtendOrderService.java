package com.beautifulyears.service.order;

import java.util.List;

import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.service.OrderService;
import org.broadleafcommerce.core.order.service.type.OrderStatus;

/**
 * @author Aspire software solutions
 *
 */
public interface ExtendOrderService extends OrderService {

  List<Order> findOrderByStatus(OrderStatus status);

}

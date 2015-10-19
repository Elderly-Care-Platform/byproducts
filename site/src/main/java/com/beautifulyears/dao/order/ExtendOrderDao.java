package com.beautifulyears.dao.order;

import java.util.List;

import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.service.type.OrderStatus;

/**
 * Interface for extend order dao methods
 * 
 * @author Aspire Softeware Solutions
 *
 */
public interface ExtendOrderDao {

  List<Order> findOrderByStatus(OrderStatus status);

}

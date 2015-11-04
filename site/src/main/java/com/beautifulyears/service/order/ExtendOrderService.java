package com.beautifulyears.service.order;

import java.util.List;

import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.service.OrderService;
import org.broadleafcommerce.core.order.service.call.MergeCartResponse;
import org.broadleafcommerce.core.order.service.exception.RemoveFromCartException;
import org.broadleafcommerce.core.order.service.type.OrderStatus;
import org.broadleafcommerce.core.pricing.service.exception.PricingException;
import org.broadleafcommerce.profile.core.domain.Customer;

/**
 * @author Aspire software solutions
 *
 */
public interface ExtendOrderService extends OrderService {

	List<Order> findOrderByStatus(OrderStatus status);

	MergeCartResponse mergeOrder(Customer customer, Long guestOrderId,
			boolean priceOrder) throws PricingException, RemoveFromCartException;

}

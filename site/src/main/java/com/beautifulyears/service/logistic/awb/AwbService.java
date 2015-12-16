/**
 * 
 */
package com.beautifulyears.service.logistic.awb;

import java.util.List;

import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.domain.OrderItem;

/**
 * @author Nitin
 *
 */
public interface AwbService {
	public List<String> generate(int count, String type);
	public boolean placeOrder(Order order, OrderItem item);
	public Object track(List<String> awbList);
}

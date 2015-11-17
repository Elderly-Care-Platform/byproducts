/**
 * 
 */
package com.beautifulyears.dao.logistic.awb;

import java.util.List;

import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.domain.OrderItem;

/**
 * @author Nitin
 *
 */
public interface AwbDao {
	public List<String> generate(int count, String type);
	public boolean placeOrder(Order order, OrderItem item);
}

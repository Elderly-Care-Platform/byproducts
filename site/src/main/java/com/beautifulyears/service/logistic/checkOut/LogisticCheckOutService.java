/**
 * 
 */
package com.beautifulyears.service.logistic.checkOut;

import org.broadleafcommerce.core.order.domain.Order;

/**
 * @author Nitin
 *
 */
public interface LogisticCheckOutService {
	
	public Order checkOut(Order order);
	
}

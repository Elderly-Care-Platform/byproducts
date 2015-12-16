/**
 * 
 */
package com.beautifulyears.service.logistic.checkOut;

import org.broadleafcommerce.core.checkout.service.exception.CheckoutException;
import org.broadleafcommerce.core.checkout.service.workflow.CheckoutResponse;
import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.pricing.service.exception.PricingException;

/**
 * @author Nitin
 *
 */
public interface LogisticCheckOutService {
	
	public CheckoutResponse checkOut(Order order) throws PricingException, CheckoutException;
	
}

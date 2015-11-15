/**
 * 
 */
package com.beautifulyears.sample.order.domain;

import org.broadleafcommerce.core.order.domain.OrderItem;

/**
 * @author Nitin
 *
 */
public interface ExtendOrderItem extends OrderItem {
	public String getAwbNumber();
	public void setAwbNumber(String awbNumber);
}

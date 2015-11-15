/**
 * 
 */
package com.beautifulyears.api.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.domain.OrderItem;
import org.broadleafcommerce.core.web.api.wrapper.APIUnwrapper;
import org.broadleafcommerce.core.web.api.wrapper.OrderItemWrapper;
import org.springframework.context.ApplicationContext;

/**
 * @author Nitin
 *
 */
@XmlRootElement(name = "orderItem")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class ExtendOrderItemWrapper extends OrderItemWrapper implements APIUnwrapper<OrderItem>{
	
	@XmlElement
	  private String awbNumber;

	@Override
	public OrderItem unwrap(HttpServletRequest request,
			ApplicationContext context) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void wrapDetails(OrderItem model, HttpServletRequest request) {
		super.wrapDetails(model, request);
	}
	
	@Override
	  public void wrapSummary(OrderItem model, HttpServletRequest request) {
	    wrapDetails(model, request);
	  }

}

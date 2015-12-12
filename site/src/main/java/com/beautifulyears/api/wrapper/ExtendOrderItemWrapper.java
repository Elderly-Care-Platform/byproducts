package com.beautifulyears.api.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.log4j.Logger;
import org.broadleafcommerce.core.order.domain.OrderItem;
import org.broadleafcommerce.core.order.service.OrderItemService;
import org.broadleafcommerce.core.web.api.wrapper.APIUnwrapper;
import org.broadleafcommerce.core.web.api.wrapper.OrderItemWrapper;
import org.springframework.context.ApplicationContext;

/**
 * This wrapper provides wrap and unwrap method for order
 * 
 * @author Aspire Software Solutions
 *
 */
@XmlRootElement(name = "orderItem")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class ExtendOrderItemWrapper extends OrderItemWrapper implements APIUnwrapper<OrderItem> {

  final static Logger logger = Logger.getLogger(ExtendOrderItemWrapper.class);

  /*
   * Extend wrap details method to add extended entities in existing wrapper
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.OrderWrapper#wrapDetails(org
   * .broadleafcommerce.core .order.domain.Order, javax.servlet.http.HttpServletRequest)
   */
  @Override
  public void wrapDetails(OrderItem model, HttpServletRequest request) {
	  super.wrapDetails(model, request);
  }


  /*
   * Wrap the model
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.OrderWrapper#wrapSummary(org
   * .broadleafcommerce.core .order.domain.Order, javax.servlet.http.HttpServletRequest)
   */
  @Override
  public void wrapSummary(OrderItem model, HttpServletRequest request) {
    this.wrapDetails(model, request);
  }


@Override
public OrderItem unwrap(HttpServletRequest request, ApplicationContext context) {
	OrderItemService orderItemService = (OrderItemService) context.getBean("blOrderItemService");
	OrderItem orderItem = orderItemService.readOrderItemById(this.id);
	return orderItem;
}

}

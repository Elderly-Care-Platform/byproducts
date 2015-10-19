package com.beautifulyears.api.wrapper;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import org.apache.log4j.Logger;
import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.web.api.wrapper.BaseWrapper;

public class OrderHistoryWrapper extends BaseWrapper {

  final static Logger logger = Logger.getLogger(OrderHistoryWrapper.class);

  @XmlElement
  private int totalResult;

  @XmlElement(name = "orders")
  @XmlElementWrapper(name = "orders")
  protected List<ExtendOrderWrapper> orders;

  public void wrapDetails(int filterOrderListLength, List<Order> orderList,
      HttpServletRequest request) {
    orders = new ArrayList<ExtendOrderWrapper>();
    this.totalResult = filterOrderListLength;
    for (Order order : orderList) {
      ExtendOrderWrapper wrapper =
          (ExtendOrderWrapper) context.getBean(ExtendOrderWrapper.class.getName());
      wrapper.wrapSummary(order, request);
      this.orders.add(wrapper);
    }
  }
}

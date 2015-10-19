package com.beautifulyears.service.fedExOrder;

import com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo;

/**
 * This interface is used to declare the methods used in FedExOrderServiceImpl
 * 
 * @author Aspire Software Solutions
 *
 */
public interface FedExOrderService {

  com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo saveOrder(
      com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo order);

  com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo findOrderByOrderId(Long orderId);

  void removeTrackingInfo(OrderTrackingInfo trackInfo);

}

package com.beautifulyears.dao.fedExOrder;

import com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo;

/**
 * This interface is used for FedEx methods of order
 * 
 * @author Aspire Software Solutions
 *
 */
public interface FedExOrderDao {

  com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo save(
      com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo order);

  com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo readOrderByOrderId(Long orderId);

  void removeTrackingInfo(OrderTrackingInfo trackInfo);

}

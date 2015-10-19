package com.beautifulyears.service.fedExOrder;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beautifulyears.dao.fedExOrder.FedExOrderDao;
import com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo;

/**
 * This service used to Save and get the details of FedEx information
 * 
 * @author Aspire Software Solutions
 *
 */
@Service("blFedExOrderService")
/*
 * @ManagedResource(objectName = "org.broadleafcommerce:name=ExtendOrderService", description =
 * "Order Service", currencyTimeLimit = 15)
 */
public class FedExOrderServiceImpl implements FedExOrderService {

  @Resource(name = "blFedexOrderDao")
  protected FedExOrderDao fedExOrderDao;

  /*
   * Save order
   * 
   * (non-Javadoc)
   * 
   * @see
   * com.beautifulyears.service.fedExOrder.FedExOrderService#saveOrder(com.beautifulyears.sample
   * .fedExOrder.domain.OrderTrackingInfo)
   */
  @Override
  public OrderTrackingInfo saveOrder(OrderTrackingInfo order) {
    return fedExOrderDao.save(order);
  }

  /*
   * Find order based on Id
   * 
   * (non-Javadoc)
   * 
   * @see com.beautifulyears.service.fedExOrder.FedExOrderService#findOrderByOrderId(java.lang.Long)
   */
  @Override
  public OrderTrackingInfo findOrderByOrderId(Long orderId) {
    return fedExOrderDao.readOrderByOrderId(orderId);
  }

  /*
   * Remove tracking info
   * 
   * (non-Javadoc)
   * 
   * @see
   * com.beautifulyears.service.fedExOrder.FedExOrderService#removeTrackingInfo(com.beautifulyears
   * .sample.fedExOrder.domain.OrderTrackingInfo)
   */
  @Override
  public void removeTrackingInfo(OrderTrackingInfo trackInfo) {
    fedExOrderDao.removeTrackingInfo(trackInfo);
  }
}

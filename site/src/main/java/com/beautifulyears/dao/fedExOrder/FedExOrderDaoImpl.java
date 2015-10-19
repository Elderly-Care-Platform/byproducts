package com.beautifulyears.dao.fedExOrder;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo;

/**
 * This Dao is used to save and get the FedEx Order Information from database
 * 
 * @author Aspire Software Solutions
 *
 */
@Repository("blFedexOrderDao")
public class FedExOrderDaoImpl implements FedExOrderDao {

  @PersistenceContext(unitName = "blPU")
  protected EntityManager em;

  /*
   * This method is used to save the FedEx information of order (non-Javadoc)
   * 
   * @see
   * com.beautifulyears.dao.fedExOrder.FedExOrderDao#save(com.beautifulyears.sample.fedExOrder.domain
   * .OrderTrackingInfo)
   */
  @Override
  public com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo save(
      com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo order) {
    return em.merge(order);
  }

  /*
   * This method is used to get FedEx information of order (non-Javadoc)
   * 
   * @see com.beautifulyears.dao.fedExOrder.FedExOrderDao#readOrderByOrderId(java.lang.Long)
   */
  @Override
  public com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo readOrderByOrderId(
      final Long orderId) {
    Query query = em.createNamedQuery("@get_tracking_info_by_orderId");
    query.setParameter("orderId", orderId);
    return (OrderTrackingInfo) query.getSingleResult();
  }

  /*
   * Remove tracking info from DB
   * 
   * (non-Javadoc)
   * 
   * @see
   * com.beautifulyears.dao.fedExOrder.FedExOrderDao#removeTrackingInfo(com.beautifulyears.sample
   * .fedExOrder.domain.OrderTrackingInfo)
   */
  @Override
  public void removeTrackingInfo(OrderTrackingInfo trackInfo) {
    em.remove(trackInfo);
  }
}

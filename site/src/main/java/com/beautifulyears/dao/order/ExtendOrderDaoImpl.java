package com.beautifulyears.dao.order;

import java.util.List;

import javax.persistence.Query;

import org.broadleafcommerce.core.order.dao.OrderDaoImpl;
import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.service.type.OrderStatus;
import org.springframework.stereotype.Repository;

/**
 * Extend order dao
 * 
 * @author Aspire Software Solutions
 *
 */
@Repository("blExtendOrderDao")
public class ExtendOrderDaoImpl extends OrderDaoImpl implements ExtendOrderDao {

  /*
   * Find extend order based on orderId
   * 
   * (non-Javadoc)
   * 
   * @see
   * com.beautifulyears.dao.order.ExtendOrderDao#findOrderByStatus(org.broadleafcommerce.core.order
   * .service.type.OrderStatus)
   */
  @SuppressWarnings("unchecked")
  @Override
  public List<Order> findOrderByStatus(OrderStatus status) {
    Query query = em.createNamedQuery("@get_all_orders_by_status");
    query.setParameter("status", status.getType());
    return (List<Order>) query.getResultList();
  }
}

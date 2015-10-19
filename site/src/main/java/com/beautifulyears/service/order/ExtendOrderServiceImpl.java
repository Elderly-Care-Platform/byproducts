package com.beautifulyears.service.order;

import java.util.List;

import javax.annotation.Resource;

import org.broadleafcommerce.core.order.domain.Order;
import org.broadleafcommerce.core.order.service.OrderServiceImpl;
import org.broadleafcommerce.core.order.service.type.OrderStatus;
import org.springframework.stereotype.Service;

import com.beautifulyears.dao.order.ExtendOrderDao;

/**
 * Extedn order service
 * 
 * @author Aspire Software Solutions
 *
 */
@Service("blExtendOrderService")
public class ExtendOrderServiceImpl extends OrderServiceImpl implements ExtendOrderService {

  @Resource(name = "blExtendOrderDao")
  protected ExtendOrderDao extendOrderDao;

  /*
   * FInd order based on status
   * 
   * (non-Javadoc)
   * 
   * @see
   * com.beautifulyears.service.order.ExtendOrderService#findOrderByStatus(org.broadleafcommerce
   * .core.order.service.type.OrderStatus)
   */
  @Override
  public List<Order> findOrderByStatus(OrderStatus status) {
    return extendOrderDao.findOrderByStatus(status);
  }
}

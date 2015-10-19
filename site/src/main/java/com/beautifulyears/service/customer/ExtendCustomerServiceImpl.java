package com.beautifulyears.service.customer;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.broadleafcommerce.common.util.TransactionUtils;
import org.broadleafcommerce.profile.core.domain.Customer;
import org.broadleafcommerce.profile.core.service.CustomerServiceImpl;
import org.springframework.transaction.annotation.Transactional;

import com.beautifulyears.dao.customer.ExtendCustomerDao;
import com.beautifulyears.sample.profile.domain.ExtendCustomer;

/**
 * This service extends method of deleting customer of CustomerServiceImpl
 * 
 * @author Aspire Software Solutions
 *
 */
public class ExtendCustomerServiceImpl extends CustomerServiceImpl implements ExtendCustomerService {

  final static Logger logger = Logger.getLogger(ExtendCustomerServiceImpl.class);
  
  @Resource(name = "blCustomerDao")
  protected ExtendCustomerDao extendCustomerDao;

  /*
   * This method extends the delete method of CustomerServiceImpl to provide transactional session
   * 
   * (non-Javadoc)
   * 
   * @see
   * org.broadleafcommerce.profile.core.service.CustomerServiceImpl#deleteCustomer(org.broadleafcommerce
   * .profile.core.domain.Customer)
   */
  @Override
  @Transactional(TransactionUtils.DEFAULT_TRANSACTION_MANAGER)
  public void deleteCustomer(Customer customer) {
    logger.debug("Executing method : deleteCustomer()");
    extendCustomerDao.delete(customer);
  }

@Override
public ExtendCustomer getByCustomUserId(String customUserId) {
	ExtendCustomer customer = extendCustomerDao.getByCustomUserId(customUserId);
	return customer;
}
  
  
}

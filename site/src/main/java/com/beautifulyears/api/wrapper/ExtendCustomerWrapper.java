package com.beautifulyears.api.wrapper;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.broadleafcommerce.core.web.api.wrapper.APIUnwrapper;
import org.broadleafcommerce.core.web.api.wrapper.CustomerAttributeWrapper;
import org.broadleafcommerce.core.web.api.wrapper.CustomerWrapper;
import org.broadleafcommerce.profile.core.domain.Customer;
import org.broadleafcommerce.profile.core.domain.CustomerAttribute;
import org.broadleafcommerce.profile.core.service.CustomerService;
import org.springframework.context.ApplicationContext;

/**
 * This wrapper extends unwrap method of CustomerWrapper
 * 
 * @author Aspire Software Solutions
 *
 */
public class ExtendCustomerWrapper extends CustomerWrapper implements APIUnwrapper<Customer> {

  final static Logger logger = Logger.getLogger(ExtendOrderWrapper.class);

  /*
   * Extend unwrap method
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.CustomerWrapper#unwrap(javax.servlet.http.
   * HttpServletRequest, org.springframework.context.ApplicationContext)
   */
  @Override
  public Customer unwrap(HttpServletRequest request, ApplicationContext context) {
    logger.debug("Executing method : unwrap()");
    // Get service and create customer
    CustomerService customerService = (CustomerService) context.getBean("blCustomerService");
    Customer customer = customerService.createCustomerFromId(null);
    // Set customer information
    customer.setId(id);
    customer.setFirstName(this.firstName);
    customer.setLastName(this.lastName);
    customer.setEmailAddress(this.emailAddress);
    if (customerAttributes != null) {
      for (CustomerAttributeWrapper customerAttributeWrapper : customerAttributes) {
        CustomerAttribute attribute = customerAttributeWrapper.unwrap(request, context);
        attribute.setCustomer(customer);
        customer.getCustomerAttributes().put(attribute.getName(), attribute);
      }
    }
    return customer;
  }
}

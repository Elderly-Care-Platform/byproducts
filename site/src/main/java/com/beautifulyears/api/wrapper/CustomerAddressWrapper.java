package com.beautifulyears.api.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.log4j.Logger;
import org.broadleafcommerce.core.web.api.wrapper.APIUnwrapper;
import org.broadleafcommerce.core.web.api.wrapper.APIWrapper;
import org.broadleafcommerce.core.web.api.wrapper.AddressWrapper;
import org.broadleafcommerce.core.web.api.wrapper.BaseWrapper;
import org.broadleafcommerce.core.web.api.wrapper.CustomerWrapper;
import org.broadleafcommerce.profile.core.domain.CustomerAddress;
import org.broadleafcommerce.profile.core.service.CustomerAddressService;
import org.springframework.context.ApplicationContext;

/**
 * This wrapper provides wrap and unwrap method for multiple customer addresses
 * 
 * @author Aspire Software Solutions
 *
 */
@XmlRootElement(name = "customerAddress")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class CustomerAddressWrapper extends BaseWrapper implements APIWrapper<CustomerAddress>,
    APIUnwrapper<CustomerAddress> {

  final static Logger logger = Logger.getLogger(CustomerAddressWrapper.class);

  @XmlElement
  protected Long id;

  @XmlElement
  protected String addressName;

  @XmlElement
  protected CustomerWrapper customer;

  @XmlElement
  protected AddressWrapper address;

  /*
   * Unwrap the json of customer address and return object of customer address
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.APIUnwrapper#unwrap(javax.servlet.http.
   * HttpServletRequest, org.springframework.context.ApplicationContext)
   */
  @Override
  public CustomerAddress unwrap(HttpServletRequest request, ApplicationContext context) {
    logger.debug("Executing method : unwrap()");
    CustomerAddressService customerAddressService =
        (CustomerAddressService) context.getBean("blCustomerAddressService");
    CustomerAddress customerAddress = customerAddressService.create();
    customerAddress.setId(this.id);
    return customerAddress;
  }

  /*
   * Wrap the customer address object and return json of customer address
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.APIWrapper#wrapDetails(java.lang.Object,
   * javax.servlet.http.HttpServletRequest)
   */
  @Override
  public void wrapDetails(CustomerAddress model, HttpServletRequest request) {
    logger.debug("Executing method : wrapDetails()");

    if (model.getId() != null) {
      this.id = model.getId();
    }

    if (model.getAddressName() != null) {
      this.addressName = model.getAddressName();
    }

    if (model.getCustomer() != null) {
      CustomerWrapper customerWrapper =
          (CustomerWrapper) context.getBean(CustomerWrapper.class.getName());
      customerWrapper.wrapDetails(model.getCustomer(), request);
      this.customer = customerWrapper;
    }

    if (model.getAddress() != null) {
      AddressWrapper addressWrapper =
          (AddressWrapper) context.getBean(AddressWrapper.class.getName());
      addressWrapper.wrapDetails(model.getAddress(), request);
      this.address = addressWrapper;
    }
  }

  /*
   * This method is used to wrap the details
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.APIWrapper#wrapSummary(java.lang.Object,
   * javax.servlet.http.HttpServletRequest)
   */
  @Override
  public void wrapSummary(CustomerAddress model, HttpServletRequest request) {
    logger.debug("Executing method : wrapSummary()");
    wrapDetails(model, request);
  }

}

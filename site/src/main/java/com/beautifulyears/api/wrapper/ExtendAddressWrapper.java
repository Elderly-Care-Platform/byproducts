package com.beautifulyears.api.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.log4j.Logger;
import org.broadleafcommerce.core.web.api.wrapper.AddressWrapper;
import org.broadleafcommerce.profile.core.domain.Address;
import org.springframework.context.ApplicationContext;

import com.beautifulyears.sample.profile.domain.ExtendAddress;
import com.beautifulyears.sample.profile.domain.ExtendAddressImpl;

/**
 * Extend wrapper to override existing wrapper
 * 
 * @author Aspire Software Solutions
 *
 */
@XmlRootElement(name = "address")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class ExtendAddressWrapper extends AddressWrapper {

  final static Logger logger = Logger.getLogger(ExtendAddressWrapper.class);

  @XmlElement
  protected String primaryEmail;

  @XmlElement
  protected String secondaryEmail;

  /*
   * Extend wrap details method to add extended entities in existing wrapper
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.AddressWrapper#wrapDetails
   * (org.broadleafcommerce.profile.core.domain.Address, javax.servlet.http.HttpServletRequest)
   */
  @Override
  public void wrapDetails(Address model, HttpServletRequest request) {
    super.wrapDetails(model, request);
    this.primaryEmail = ((ExtendAddressImpl) model).getPrimaryEmail();
    this.secondaryEmail = ((ExtendAddressImpl) model).getSecondaryEmail();
    if (model instanceof ExtendAddressWrapper) {
      if (((ExtendAddressImpl) model).getPrimaryEmail() != null) {
        this.primaryEmail = ((ExtendAddressImpl) model).getPrimaryEmail();
      }
      if (((ExtendAddressImpl) model).getSecondaryEmail() != null) {
        this.secondaryEmail = ((ExtendAddressImpl) model).getSecondaryEmail();
      }
    }
  }

  @Override
  public void wrapSummary(Address model, HttpServletRequest request) {
    wrapDetails(model, request);
  }

  /*
   * Extend unwrap method to unwrap json
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.AddressWrapper#unwrap(javax
   * .servlet.http.HttpServletRequest, org.springframework.context.ApplicationContext)
   */
  @Override
  public ExtendAddress unwrap(HttpServletRequest request, ApplicationContext appContext) {

    ExtendAddress address = new ExtendAddressImpl();

    address.setId(this.id);
    address.setFirstName(this.firstName);
    address.setLastName(this.lastName);
    address.setAddressLine1(this.addressLine1);
    address.setAddressLine2(this.addressLine2);
    address.setAddressLine3(this.addressLine3);
    address.setCity(this.city);
    address.setPostalCode(this.postalCode);
    address.setCompanyName(this.companyName);

    if (this.isBusiness != null) {
      address.setBusiness(this.isBusiness);
    }

    if (this.isDefault != null) {
      address.setDefault(this.isDefault);
    }

    if (this.state != null) {
      address.setState(this.state.unwrap(request, appContext));
    }

    if (this.country != null) {
      address.setCountry(this.country.unwrap(request, appContext));
    }

    if (this.phonePrimary != null) {
      address.setPhonePrimary(this.phonePrimary.unwrap(request, appContext));
    }

    if (this.phoneSecondary != null) {
      address.setPhoneSecondary(this.phoneSecondary.unwrap(request, appContext));
    }

    if (this.phoneFax != null) {
      address.setPhoneFax(this.phoneFax.unwrap(request, appContext));
    }

    if (this.primaryEmail != null) {
      address.setPrimaryEmail(this.primaryEmail);
    }

    if (this.secondaryEmail != null) {
      address.setSecondaryEmail(this.secondaryEmail);
    }

    return address;

  }
}

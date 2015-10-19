package com.beautifulyears.api.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.broadleafcommerce.core.web.api.wrapper.APIWrapper;
import org.broadleafcommerce.core.web.api.wrapper.BaseWrapper;

import com.beautifulyears.sample.catalog.domain.ExtendProductCODImpl;

/**
 * This wrapper provides wrap method for wrapping pin code
 * 
 * @author Aspire Software Solution
 *
 */
@XmlRootElement(name = "extendProductCOD")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class ExtendProductCODWrapper extends BaseWrapper implements
    APIWrapper<ExtendProductCODImpl> {

  @XmlElement
  protected Long id;

  @XmlElement
  private long productCashOnDeliveryPincode;

  /*
   * This method wrap id and pin code in json
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.APIWrapper#wrapDetails(java .lang.Object,
   * javax.servlet.http.HttpServletRequest)
   */
  @Override
  public void wrapDetails(ExtendProductCODImpl model, HttpServletRequest request) {
    this.id = ((ExtendProductCODImpl) model).getId();
    this.productCashOnDeliveryPincode =
        ((ExtendProductCODImpl) model).getProductCashOnDeliveryPincode();
  }

  /*
   * This method wrap summary of pin COD object
   * 
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.APIWrapper#wrapSummary(java .lang.Object,
   * javax.servlet.http.HttpServletRequest)
   */
  @Override
  public void wrapSummary(ExtendProductCODImpl model, HttpServletRequest request) {
    wrapDetails(model, request);
  }
}

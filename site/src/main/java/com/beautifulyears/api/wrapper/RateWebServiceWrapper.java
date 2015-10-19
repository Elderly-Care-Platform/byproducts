package com.beautifulyears.api.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.log4j.Logger;
import org.broadleafcommerce.core.web.api.wrapper.APIUnwrapper;
import org.broadleafcommerce.core.web.api.wrapper.APIWrapper;
import org.broadleafcommerce.core.web.api.wrapper.BaseWrapper;
import org.springframework.context.ApplicationContext;

import com.beautifulyears.domain.fedex.RateWebService;

/**
 * This wrapper provides wrap and unwrap method for RateWebService of FedEx.
 * 
 * @author Aspire Software Solutions
 *
 */
@XmlRootElement(name = "customerAddress")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class RateWebServiceWrapper extends BaseWrapper implements APIWrapper<RateWebService>,
    APIUnwrapper<RateWebService> {

  final static Logger logger = Logger.getLogger(RateWebServiceWrapper.class);

  @XmlElement
  protected String deliveryDate;

  @XmlElement
  protected String rateServiceSeverity;

  @XmlElement
  protected String rateServiceMessage;

  /*
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.APIUnwrapper#unwrap(javax.servlet.http.
   * HttpServletRequest, org.springframework.context.ApplicationContext)
   */
  @Override
  public RateWebService unwrap(HttpServletRequest request, ApplicationContext context) {
    return null;
  }

  /*
   * Wrap details method to add extended entities in existing wrapper (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.APIWrapper#wrapDetails(java.lang.Object,
   * javax.servlet.http.HttpServletRequest)
   */
  @Override
  public void wrapDetails(RateWebService model, HttpServletRequest request) {
    logger.debug("Executing method : wrapDetails()");

    if (model.getDeliveryDate() != null) {
      this.deliveryDate = model.getDeliveryDate();
    }

    if (model.getRateServiceSeverity() != null) {
      this.rateServiceSeverity = model.getRateServiceSeverity();
    }

    if (model.getRateServiceMessage() != null) {
      this.rateServiceMessage = model.getRateServiceMessage();
    }

  }

  /*
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.APIWrapper#wrapSummary(java.lang.Object,
   * javax.servlet.http.HttpServletRequest)
   */
  @Override
  public void wrapSummary(RateWebService model, HttpServletRequest request) {
    logger.debug("Executing method : wrapSummary()");
    wrapDetails(model, request);
  }

}

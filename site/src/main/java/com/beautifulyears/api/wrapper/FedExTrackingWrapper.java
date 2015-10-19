package com.beautifulyears.api.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.broadleafcommerce.core.web.api.wrapper.APIUnwrapper;
import org.broadleafcommerce.core.web.api.wrapper.APIWrapper;
import org.broadleafcommerce.core.web.api.wrapper.BaseWrapper;
import org.springframework.context.ApplicationContext;

/**
 * This wrapper provides wrap and unwrap method for FedEx Info.
 * 
 * @author Aspire Software Solutions
 *
 */
@XmlRootElement(name = "trackingInfo")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class FedExTrackingWrapper extends BaseWrapper implements
    APIWrapper<com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo>,
    APIUnwrapper<com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo> {

  @XmlElement
  protected long orderId;

  @XmlElement
  protected String trackingNumber;

  @XmlElement
  protected String shippingSeverity;

  @XmlElement
  protected String shippingMessage;

  @XmlElement
  protected String deliveryDate;

  @XmlElement
  protected String rateServiceSeverity;

  @XmlElement
  protected String rateServiceMessage;

  /*
   * Wrap details method to add extended entities in existing wrapper (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.APIWrapper#wrapDetails(java.lang.Object,
   * javax.servlet.http.HttpServletRequest)
   */
  public void wrapDetails(com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo model,
      HttpServletRequest request) {
    this.orderId = model.getOrderId();
    this.trackingNumber = model.getTrackingNumber();
    this.shippingSeverity = model.getShippingSeverity();
    this.shippingMessage = model.getShippingMessage();
    this.deliveryDate = model.getDeliveryDate();
    this.rateServiceMessage = model.getRateServiceMessage();
    this.rateServiceSeverity = model.getRateServiceSeverity();
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.APIWrapper#wrapSummary(java.lang.Object,
   * javax.servlet.http.HttpServletRequest)
   */
  public void wrapSummary(com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo model,
      HttpServletRequest request) {
    wrapDetails(model, request);
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.APIUnwrapper#unwrap(javax.servlet.http.
   * HttpServletRequest, org.springframework.context.ApplicationContext)
   */
  @Override
  public com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo unwrap(
      HttpServletRequest request, ApplicationContext context) {
    return null;
  }

}

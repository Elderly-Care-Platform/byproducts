package com.beautifulyears.api.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import org.apache.log4j.Logger;
import org.broadleafcommerce.core.web.api.wrapper.APIUnwrapper;
import org.broadleafcommerce.core.web.api.wrapper.APIWrapper;
import org.broadleafcommerce.core.web.api.wrapper.BaseWrapper;
import org.springframework.context.ApplicationContext;

import com.beautifulyears.domain.fedex.CancelPendingShipmentWebService;

@XmlAccessorType(value = XmlAccessType.FIELD)
public class CancelPendingShipmentServiceWrapper extends BaseWrapper implements
    APIWrapper<CancelPendingShipmentWebService>, APIUnwrapper<CancelPendingShipmentWebService> {

  final static Logger logger = Logger.getLogger(CancelPendingShipmentServiceWrapper.class);

  @XmlElement
  protected String cancelPendingShipmentServiceSeverity;

  @XmlElement
  protected String cancelPendingShipmentServiceMessage;

  @Override
  public CancelPendingShipmentWebService unwrap(HttpServletRequest request,
      ApplicationContext context) {
    return null;
  }

  @Override
  public void wrapDetails(CancelPendingShipmentWebService model, HttpServletRequest request) {
    logger.debug("Executing method : wrapDetails()");

    if (model.getCancelPendingShipmentServiceSeverity() != null) {
      this.cancelPendingShipmentServiceSeverity = model.getCancelPendingShipmentServiceSeverity();
    }

    if (model.getCancelPendingShipmentServiceMessage() != null) {
      this.cancelPendingShipmentServiceMessage = model.getCancelPendingShipmentServiceMessage();
    }
  }

  @Override
  public void wrapSummary(CancelPendingShipmentWebService model, HttpServletRequest request) {
    logger.debug("Executing method : wrapSummary()");
    wrapDetails(model, request);
  }

}

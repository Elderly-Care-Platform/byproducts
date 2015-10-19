package com.beautifulyears.api.wrapper;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.broadleafcommerce.core.offer.domain.Adjustment;
import org.broadleafcommerce.core.offer.service.OfferService;
import org.broadleafcommerce.core.web.api.wrapper.AdjustmentWrapper;


@XmlRootElement(name = "adjustment")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class ExtendAdjustmentWrapper extends AdjustmentWrapper {

  @XmlElement
  public String promoCode;

  @Override
  public void wrapDetails(Adjustment model, HttpServletRequest request) {
    super.wrapDetails(model, request);
    OfferService offerService = (OfferService) context.getBean("blOfferService");
    this.promoCode = (offerService.findOfferCodeById(this.offerid)).getOfferCode();
  }

  @Override
  public void wrapSummary(Adjustment model, HttpServletRequest request) {
    wrapDetails(model, request);
  }
}

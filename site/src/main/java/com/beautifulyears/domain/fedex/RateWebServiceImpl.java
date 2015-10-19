package com.beautifulyears.domain.fedex;

import javax.persistence.Entity;

/**
 * This entity Stores the details of Rate web service of FedEx
 * 
 * @author Aspire Software Solutions
 *
 */
@Entity
public class RateWebServiceImpl implements RateWebService {

  private String deliveryDate;
  private String rateServiceSeverity;
  private String rateServiceMessage;

  @Override
  public String getDeliveryDate() {
    return deliveryDate;
  }

  @Override
  public void setDeliveryDate(String deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  @Override
  public String getRateServiceSeverity() {
    return rateServiceSeverity;
  }

  @Override
  public void setRateServiceSeverity(String rateServiceSeverity) {
    this.rateServiceSeverity = rateServiceSeverity;
  }

  @Override
  public String getRateServiceMessage() {
    return rateServiceMessage;
  }

  @Override
  public void setRateServiceMessage(String rateServiceMessage) {
    this.rateServiceMessage = rateServiceMessage;
  }

}

package com.beautifulyears.domain.fedex;


/**
 * This interface is used for RateWebServiceClient methods of FedEx
 * 
 * @author Aspire Software Solutions
 *
 */
public interface RateWebService {

  String getDeliveryDate();

  void setDeliveryDate(String deliveryDate);

  String getRateServiceSeverity();

  void setRateServiceSeverity(String rateServiceSeverity);

  String getRateServiceMessage();

  void setRateServiceMessage(String rateServiceMessage);

}

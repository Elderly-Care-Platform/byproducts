package com.beautifulyears.sample.fedExOrder.domain;

import java.io.Serializable;

/**
 * This interface is used get FedEx information of order
 * 
 * @author Aspire Software Solutions
 *
 */
public interface OrderTrackingInfo extends Serializable {

  Long getId();

  void setId(Long id);

  Long getOrderId();

  void setOrderId(Long orderId);

  String getTrackingNumber();

  void setTrackingNumber(String trackingNumber);

  String getShippingSeverity();

  void setShippingSeverity(String shippingSeverity);

  String getShippingMessage();

  void setShippingMessage(String shippingMessage);

  String getDeliveryDate();

  void setDeliveryDate(String deliveryDate);

  String getRateServiceSeverity();

  void setRateServiceSeverity(String rateServiceSeverity);

  String getRateServiceMessage();

  void setRateServiceMessage(String rateServiceMessage);

}

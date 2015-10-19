package com.beautifulyears.sample.fedExOrder.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.broadleafcommerce.common.presentation.AdminPresentation;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * This entity is used to store FedEx information of order
 * 
 * @author Aspire Software Solutions
 *
 */
@Entity
@Table(name = "FEDEX_ORDER_INFO")
@NamedQueries(value = {@NamedQuery(name = "@get_tracking_info_by_orderId",
    query = "from OrderTrackingInfoImpl where orderId = :orderId")})
public class OrderTrackingInfoImpl implements OrderTrackingInfo {

  /**
   * serialVersionUID
   */
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(generator = "Id")
  @GenericGenerator(name = "Id",
      strategy = "org.broadleafcommerce.common.persistence.IdOverrideTableGenerator",
      parameters = {
          @Parameter(name = "segment_value", value = "OrderTrackingInfoImpl"),
          @Parameter(name = "entity_name",
              value = "com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfoImpl")})
  @Column(name = "ID")
  @AdminPresentation(friendlyName = "Id", order = 1, prominent = true, gridOrder = 1)
  private Long id;

  @Column(name = "ORDER_ID")
  @AdminPresentation(friendlyName = "Order Id", order = 1, prominent = true, gridOrder = 1)
  private Long orderId;

  @Column(name = "TRACKING_NUMBER")
  @AdminPresentation(friendlyName = "Tracking Number", order = 1, prominent = true, gridOrder = 1)
  private String trackingNumber;

  @Column(name = "SHIPPING_SEVERITY")
  @AdminPresentation(friendlyName = "Shipping Severity", order = 1, prominent = true, gridOrder = 1)
  private String shippingSeverity;

  @Column(name = "SHIPPING_MESSAGE")
  @AdminPresentation(friendlyName = "Shipping Message", order = 1, prominent = true, gridOrder = 1)
  private String shippingMessage;

  @Column(name = "DELIVERY_DATE")
  @AdminPresentation(friendlyName = "Delivery Date", order = 1, prominent = true, gridOrder = 1)
  private String deliveryDate;

  @Column(name = "RATE_SERVICE_SEVERITY")
  @AdminPresentation(friendlyName = "Rate Service Severity", order = 1, prominent = true,
      gridOrder = 1)
  private String rateServiceSeverity;

  @Column(name = "RATE_SERVICE_MESSAGE")
  @AdminPresentation(friendlyName = "Rate Service Message", order = 1, prominent = true,
      gridOrder = 1)
  private String rateServiceMessage;

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public Long getOrderId() {
    return orderId;
  }

  @Override
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  @Override
  public String getTrackingNumber() {
    return trackingNumber;
  }

  @Override
  public void setTrackingNumber(String trackingNumber) {
    this.trackingNumber = trackingNumber;
  }

  @Override
  public String getShippingSeverity() {
    return shippingSeverity;
  }

  @Override
  public void setShippingSeverity(String shippingSeverity) {
    this.shippingSeverity = shippingSeverity;
  }

  @Override
  public String getShippingMessage() {
    return shippingMessage;
  }

  @Override
  public void setShippingMessage(String shippingMessage) {
    this.shippingMessage = shippingMessage;
  }

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

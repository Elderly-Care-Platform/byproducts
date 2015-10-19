package com.beautifulyears.domain.fedex;

public class CancelPendingShipmentWebServiceImpl implements CancelPendingShipmentWebService {

  private String cancelPendingShipmentServiceSeverity;
  private String cancelPendingShipmentServiceMessage;

  @Override
  public String getCancelPendingShipmentServiceSeverity() {
    return cancelPendingShipmentServiceSeverity;
  }

  @Override
  public void setCancelPendingShipmentServiceSeverity(String cancelPendingShipmentServiceSeverity) {
    this.cancelPendingShipmentServiceSeverity = cancelPendingShipmentServiceSeverity;
  }

  @Override
  public String getCancelPendingShipmentServiceMessage() {
    return cancelPendingShipmentServiceMessage;
  }

  @Override
  public void setCancelPendingShipmentServiceMessage(String cancelPendingShipmentServiceMessage) {
    this.cancelPendingShipmentServiceMessage = cancelPendingShipmentServiceMessage;
  }

}

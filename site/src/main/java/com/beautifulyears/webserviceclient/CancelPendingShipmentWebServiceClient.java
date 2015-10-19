package com.beautifulyears.webserviceclient;

import com.beautifulyears.domain.fedex.CancelPendingShipmentWebService;
import com.beautifulyears.domain.fedex.CancelPendingShipmentWebServiceImpl;
import com.fedex.openship.stub.ClientDetail;
import com.fedex.openship.stub.DeletePendingShipmentReply;
import com.fedex.openship.stub.DeletePendingShipmentRequest;
import com.fedex.openship.stub.Notification;
import com.fedex.openship.stub.NotificationSeverityType;
import com.fedex.openship.stub.OpenShipPortType;
import com.fedex.openship.stub.OpenShipServiceLocator;
import com.fedex.openship.stub.TrackingId;
import com.fedex.openship.stub.TrackingIdType;
import com.fedex.openship.stub.TransactionDetail;
import com.fedex.openship.stub.VersionId;
import com.fedex.openship.stub.WebAuthenticationCredential;
import com.fedex.openship.stub.WebAuthenticationDetail;

//
/**
 * Sample code to call the FedEx Cancel Email label Web Service
 * <p>
 * com.fedex.ship.stub is generated via WSDL2Java, like this:<br>
 * 
 * <pre>
 * java org.apache.axis.wsdl.WSDL2Java -w -p com.fedex.ship.stub http://www.fedex.com/...../ShipService?wsdl
 * </pre>
 * 
 * This sample code has been tested with JDK 5 and Apache Axis 1.4
 */
public class CancelPendingShipmentWebServiceClient {
  static CancelPendingShipmentWebService cancelPendingShipmentWebService = new CancelPendingShipmentWebServiceImpl();
  //
  public static CancelPendingShipmentWebService cancelPendingShipmentWebService(String trackNumber) {
    System.out.println("cancelPendingShipmentWebService****************Start****************");
    //
    DeletePendingShipmentRequest request = new DeletePendingShipmentRequest();

    request.setClientDetail(createClientDetail());
    request.setWebAuthenticationDetail(createWebAuthenticationDetail());
    //
    VersionId versionId = new VersionId("ship", 7, 0, 0);
    request.setVersion(versionId);
    //
    TransactionDetail transactionDetail = new TransactionDetail();
    transactionDetail.setCustomerTransactionId("java sample - DeletePendingShipmentRequest"); // This
                                                                                              // is
                                                                                              // a
                                                                                              // reference
                                                                                              // field
                                                                                              // for
                                                                                              // the
                                                                                              // customer.
                                                                                              // Any
                                                                                              // value
                                                                                              // can
                                                                                              // be
                                                                                              // used
                                                                                              // and
                                                                                              // will
                                                                                              // be
                                                                                              // provided
                                                                                              // in
                                                                                              // the
                                                                                              // return.
    request.setTransactionDetail(transactionDetail);
    TrackingId trackId = new TrackingId();
    // trackId.setTrackingNumber(getTrackingNumber());
    trackId.setTrackingNumber(trackNumber);
    trackId.setTrackingIdType(TrackingIdType.EXPRESS);
    request.setTrackingIds(new TrackingId[] {trackId});

    //
    try {
      // Initialize the service
      OpenShipServiceLocator service;
      OpenShipPortType port;
      //
      service = new OpenShipServiceLocator();
      updateEndPoint(service);
      port = service.getOpenShipServicePort();
      // This is the call to the web service
      DeletePendingShipmentReply reply = port.deletePendingShipment(request);
      //
      if (isResponseOk(reply.getHighestSeverity())) {
        System.out.println("SUCCESS");
      }

      cancelPendingShipmentWebService = printNotifications(reply.getNotifications());

    } catch (Exception e) {
      System.out.println(e.getMessage());
      cancelPendingShipmentWebService.setCancelPendingShipmentServiceMessage(e.getMessage());
      cancelPendingShipmentWebService.setCancelPendingShipmentServiceSeverity("ERROR");
    }
    System.out.println("cancelPendingShipmentWebService****************Stop****************");
    return cancelPendingShipmentWebService;
  }

  private static boolean isResponseOk(NotificationSeverityType notificationSeverityType) {
    if (notificationSeverityType == null) {
      return false;
    }
    if (notificationSeverityType.equals(NotificationSeverityType.WARNING)
        || notificationSeverityType.equals(NotificationSeverityType.NOTE)
        || notificationSeverityType.equals(NotificationSeverityType.SUCCESS)) {
      return true;
    }
    return false;
  }


  private static ClientDetail createClientDetail() {
    ClientDetail clientDetail = new ClientDetail();
    String accountNumber = System.getProperty("accountNumber");
    String meterNumber = System.getProperty("meterNumber");

    //
    // See if the accountNumber and meterNumber properties are set,
    // if set use those values, otherwise default them to "XXX"
    //
    if (accountNumber == null) {
      accountNumber = "510087801"; // Replace "XXX" with clients account number
    }
    if (meterNumber == null) {
      meterNumber = "118683268"; // Replace "XXX" with clients meter number
    }
    clientDetail.setAccountNumber(accountNumber);
    clientDetail.setMeterNumber(meterNumber);
    return clientDetail;
  }

  private static WebAuthenticationDetail createWebAuthenticationDetail() {
    WebAuthenticationCredential wac = new WebAuthenticationCredential();
    String key = System.getProperty("key");
    String password = System.getProperty("password");

    //
    // See if the key and password properties are set,
    // if set use those values, otherwise default them to "XXX"
    //
    if (key == null) {
      key = "XGXK6YSe1TOEE02g"; // Replace "XXX" with clients key
    }
    if (password == null) {
      password = "B87s8ATZskbfe4FJ1Z2oVSLcL"; // Replace "XXX" with clients password
    }
    wac.setKey(key);
    wac.setPassword(password);
    return new WebAuthenticationDetail(wac);
  }

  private static CancelPendingShipmentWebService printNotifications(Notification[] notifications) {
    System.out.println("Notifications:");
    if (notifications == null || notifications.length == 0) {
      System.out.println("  No notifications returned");
    }
    for (int i = 0; i < notifications.length; i++) {
      Notification n = notifications[i];
      System.out.print("  Notification no. " + i + ": ");
      if (n == null) {
        System.out.println("null");
        continue;
      } else {
        System.out.println("");
      }
      NotificationSeverityType nst = n.getSeverity();

      System.out.println("    Severity: " + (nst == null ? "null" : nst.getValue()));
      System.out.println("    Code: " + n.getCode());
      System.out.println("    Message: " + n.getMessage());
      System.out.println("    Source: " + n.getSource());
      
      cancelPendingShipmentWebService.setCancelPendingShipmentServiceMessage(n.getMessage());
      cancelPendingShipmentWebService.setCancelPendingShipmentServiceSeverity((nst == null ? "null" : nst.getValue()));
    }
    return cancelPendingShipmentWebService;
  }

  private static void updateEndPoint(OpenShipServiceLocator serviceLocator) {
    String endPoint = System.getProperty("endPoint");
    // String endPoint = System.getProperty("https://wsbeta.fedex.com:443/web-services");
    if (endPoint != null) {
      serviceLocator.setOpenShipServicePortEndpointAddress(endPoint);
    }
  }

  private static String getTrackingNumber() {
    // See if a tracking number property is set
    // otherwise default it to empty string
    String trackingNumber = System.getProperty("TrackingNumber");
    if (trackingNumber == null) {
      trackingNumber = "794655261713"; // Replace "XXX" with your tracking number
    }
    return trackingNumber;
  }

}
// Tracking Number: 123456789012, 1152333653, 794649783245, 794655146765, 794655146880,
// 794655147165, 794655150220, 794655150665, 794655278914, 794655132405, 794655133342, 794655142222,
// 794655142461, 794655143928, 794655145324, 794655261713

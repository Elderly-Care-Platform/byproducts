package com.beautifulyears.webserviceclient;

import java.math.BigDecimal;
import java.util.Calendar;

import org.apache.axis.types.NonNegativeInteger;

import com.beautifulyears.domain.fedex.RateWebService;
import com.beautifulyears.domain.fedex.RateWebServiceImpl;
import com.fedex.rate.stub.Address;
import com.fedex.rate.stub.ClientDetail;
import com.fedex.rate.stub.Dimensions;
import com.fedex.rate.stub.DropoffType;
import com.fedex.rate.stub.LinearUnits;
import com.fedex.rate.stub.Money;
import com.fedex.rate.stub.Notification;
import com.fedex.rate.stub.NotificationSeverityType;
import com.fedex.rate.stub.PackageRateDetail;
import com.fedex.rate.stub.PackageSpecialServicesRequested;
import com.fedex.rate.stub.PackagingType;
import com.fedex.rate.stub.Party;
import com.fedex.rate.stub.Payment;
import com.fedex.rate.stub.PaymentType;
import com.fedex.rate.stub.RatePortType;
import com.fedex.rate.stub.RateReply;
import com.fedex.rate.stub.RateReplyDetail;
import com.fedex.rate.stub.RateRequest;
import com.fedex.rate.stub.RateServiceLocator;
import com.fedex.rate.stub.RatedPackageDetail;
import com.fedex.rate.stub.RatedShipmentDetail;
import com.fedex.rate.stub.RequestedPackageLineItem;
import com.fedex.rate.stub.RequestedShipment;
import com.fedex.rate.stub.ServiceType;
import com.fedex.rate.stub.ShipmentRateDetail;
import com.fedex.rate.stub.Surcharge;
import com.fedex.rate.stub.TransactionDetail;
import com.fedex.rate.stub.VersionId;
import com.fedex.rate.stub.WebAuthenticationCredential;
import com.fedex.rate.stub.WebAuthenticationDetail;
import com.fedex.rate.stub.Weight;
import com.fedex.rate.stub.WeightUnits;


/**
 * Sample code to call Rate Web Service with Axis
 * <p>
 * com.fedex.rate.stub is generated via WSDL2Java, like this:<br>
 * 
 * <pre>
 * java org.apache.axis.wsdl.WSDL2Java -w -p com.fedex.rate.stub http://www.fedex.com/...../RateService?wsdl
 * </pre>
 * 
 * This sample code has been tested with JDK 5 and Apache Axis 1.4
 */
public class RateWebServiceClient {
  static RateWebService rateWebService = new RateWebServiceImpl();

  // static ExtendOrder extendOrder = new ExtendOrderImpl();

  //
  public static RateWebService getFedexServiceRates(
  /* org.broadleafcommerce.profile.core.domain.Address address */) {
    // Build a RateRequest request object
    boolean getAllRatesFlag = false; // set to true to get the rates for different service types
    RateRequest request = new RateRequest();
    request.setClientDetail(createClientDetail());
    request.setWebAuthenticationDetail(createWebAuthenticationDetail());
    request.setReturnTransitAndCommit(true);
    //
    TransactionDetail transactionDetail = new TransactionDetail();
    transactionDetail.setCustomerTransactionId("java sample - Rate Request"); // The client will get
                                                                              // the same value back
                                                                              // in the response
    request.setTransactionDetail(transactionDetail);

    //
    VersionId versionId = new VersionId("crs", 16, 0, 0);
    request.setVersion(versionId);

    //
    RequestedShipment requestedShipment = new RequestedShipment();

    requestedShipment.setShipTimestamp(Calendar.getInstance());
    requestedShipment.setDropoffType(DropoffType.REGULAR_PICKUP);
    if (!getAllRatesFlag) {
      requestedShipment.setServiceType(ServiceType.PRIORITY_OVERNIGHT);
      requestedShipment.setPackagingType(PackagingType.YOUR_PACKAGING);
    }


    Party shipper = new Party();
    Address shipperAddress = new Address(); // Origin information

    shipperAddress.setStreetLines(new String[] {"1 Shipper St"});
    shipperAddress.setCity("Memphis");
    shipperAddress.setStateOrProvinceCode("TN");
    shipperAddress.setPostalCode("38115");
    shipperAddress.setCountryCode("US");

    /*
     * shipperAddress.setStreetLines(new String[] {"404 satej apartments"});
     * shipperAddress.setCity("RAJKOT"); shipperAddress.setStateOrProvinceCode("GU");
     * shipperAddress.setPostalCode("380087"); shipperAddress.setCountryCode("IN");
     */

    shipper.setAddress(shipperAddress);
    requestedShipment.setShipper(shipper);

    //
    Party recipient = new Party();
    Address recipientAddress = new Address(); // Destination information

    // Set Address Statically

    recipientAddress.setStreetLines(new String[] {"1 Recipient St"});
    recipientAddress.setCity("COLLIERVILLE");
    recipientAddress.setStateOrProvinceCode("TN");
    recipientAddress.setPostalCode("38017");
    recipientAddress.setCountryCode("US");

    // Set Address Dynamically

    /*
     * recipientAddress.setStreetLines(new String[] {address.getAddressLine1() + " " +
     * address.getAddressLine2() + " " + address.getAddressLine3()});
     * recipientAddress.setCity(address.getCity()); recipientAddress.setStateOrProvinceCode("DL");
     * recipientAddress.setPostalCode(address.getPostalCode());
     * recipientAddress.setCountryCode("IN");
     */

    recipient.setAddress(recipientAddress);
    requestedShipment.setRecipient(recipient);

    //
    Payment shippingChargesPayment = new Payment();
    shippingChargesPayment.setPaymentType(PaymentType.SENDER);
    requestedShipment.setShippingChargesPayment(shippingChargesPayment);

    RequestedPackageLineItem rp = new RequestedPackageLineItem();
    rp.setGroupPackageCount(new NonNegativeInteger("1"));
    rp.setWeight(new Weight(WeightUnits.LB, new BigDecimal(15.0)));
    //
    rp.setInsuredValue(new Money("USD", new BigDecimal("100.00")));
    //
    rp.setDimensions(new Dimensions(new NonNegativeInteger("1"), new NonNegativeInteger("1"),
        new NonNegativeInteger("1"), LinearUnits.IN));
    PackageSpecialServicesRequested pssr = new PackageSpecialServicesRequested();
    rp.setSpecialServicesRequested(pssr);
    requestedShipment.setRequestedPackageLineItems(new RequestedPackageLineItem[] {rp});


    requestedShipment.setPackageCount(new NonNegativeInteger("1"));
    request.setRequestedShipment(requestedShipment);

    //
    try {
      // Initialize the service
      RateServiceLocator service;
      RatePortType port;
      //
      service = new RateServiceLocator();
      updateEndPoint(service);
      port = service.getRateServicePort();
      // This is the call to the web service passing in a RateRequest and returning a RateReply
      RateReply reply = port.getRates(request); // Service call
      if (isResponseOk(reply.getHighestSeverity())) {
        rateWebService = writeServiceOutput(reply);
      }
      rateWebService = printNotifications(reply.getNotifications());

    } catch (Exception e) {
      e.printStackTrace();
      rateWebService.setDeliveryDate("NOT AVAILABLE");
      rateWebService.setRateServiceMessage(e.getMessage());
      rateWebService.setRateServiceSeverity("ERROR");
    }
    return rateWebService;
  }

  public static RateWebService writeServiceOutput(RateReply reply) {
    RateReplyDetail[] rrds = reply.getRateReplyDetails();
    for (int i = 0; i < rrds.length; i++) {
      RateReplyDetail rrd = rrds[i];
      // print("\nService type", rrd.getServiceType());
      print("Packaging type", rrd.getPackagingType());
      // print("Delivery DOW", rrd.getDeliveryDayOfWeek());
      int month = rrd.getDeliveryTimestamp().get(Calendar.MONTH) + 1;
      int date = rrd.getDeliveryTimestamp().get(Calendar.DAY_OF_MONTH);
      int year = rrd.getDeliveryTimestamp().get(Calendar.YEAR);
      String delDate = new String(month + "/" + date + "/" + year);
      print("Delivery date", delDate);
      rateWebService.setDeliveryDate(delDate);
      print("Calendar DOW", rrd.getDeliveryTimestamp().get(Calendar.DAY_OF_WEEK));

      RatedShipmentDetail[] rsds = rrd.getRatedShipmentDetails();
      for (int j = 0; j < rsds.length; j++) {
        print("RatedShipmentDetail " + j, "");
        RatedShipmentDetail rsd = rsds[j];
        ShipmentRateDetail srd = rsd.getShipmentRateDetail();
        print("  Rate type", srd.getRateType());
        printWeight("  Total Billing weight", srd.getTotalBillingWeight());
        printMoney("  Total surcharges", srd.getTotalSurcharges());
        printMoney("  Total net charge", srd.getTotalNetCharge());

        RatedPackageDetail[] rpds = rsd.getRatedPackages();
        if (rpds != null && rpds.length > 0) {
          print("  RatedPackageDetails", "");
          for (int k = 0; k < rpds.length; k++) {
            print("  RatedPackageDetail " + i, "");
            RatedPackageDetail rpd = rpds[k];
            PackageRateDetail prd = rpd.getPackageRateDetail();
            if (prd != null) {
              printWeight("    Billing weight", prd.getBillingWeight());
              printMoney("    Base charge", prd.getBaseCharge());
              Surcharge[] surcharges = prd.getSurcharges();
              if (surcharges != null && surcharges.length > 0) {
                for (int m = 0; m < surcharges.length; m++) {
                  Surcharge surcharge = surcharges[m];
                  printMoney("    " + surcharge.getDescription() + " surcharge",
                      surcharge.getAmount());
                }
              }
            }
          }
        }
      }
      System.out.println("");
    }
    return rateWebService;
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

  private static RateWebService printNotifications(Notification[] notifications) {
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

      rateWebService.setRateServiceSeverity((nst == null ? "null" : nst.getValue()));
      rateWebService.setRateServiceMessage(n.getMessage());
    }
    return rateWebService;
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

  private static void print(String msg, Object obj) {
    if (msg == null || obj == null) {
      return;
    }
    System.out.println(msg + ": " + obj.toString());
  }

  private static void printMoney(String msg, Money money) {
    if (msg == null || money == null) {
      return;
    }
    System.out.println(msg + ": " + money.getAmount() + " " + money.getCurrency());
  }

  private static void printWeight(String msg, Weight weight) {
    if (msg == null || weight == null) {
      return;
    }
    System.out.println(msg + ": " + weight.getValue() + " " + weight.getUnits());
  }

  private static void updateEndPoint(RateServiceLocator serviceLocator) {
    // String endPoint = System.getProperty("endPoint");
    String endPoint = System.getProperty("https://wsbeta.fedex.com:443/web-services");
    if (endPoint != null) {
      serviceLocator.setRateServicePortEndpointAddress(endPoint);
    }
  }

}

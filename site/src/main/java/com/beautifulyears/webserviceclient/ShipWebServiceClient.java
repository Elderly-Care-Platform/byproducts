package com.beautifulyears.webserviceclient;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.Calendar;

import org.apache.axis.types.NonNegativeInteger;
import org.apache.axis.types.PositiveInteger;

import com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo;
import com.fedex.ship.stub.Address;
import com.fedex.ship.stub.AssociatedShipmentDetail;
import com.fedex.ship.stub.ClientDetail;
import com.fedex.ship.stub.CodCollectionType;
import com.fedex.ship.stub.CodDetail;
import com.fedex.ship.stub.CommercialInvoice;
import com.fedex.ship.stub.Commodity;
import com.fedex.ship.stub.CompletedPackageDetail;
import com.fedex.ship.stub.CompletedShipmentDetail;
import com.fedex.ship.stub.Contact;
import com.fedex.ship.stub.ContactAndAddress;
import com.fedex.ship.stub.CustomerReference;
import com.fedex.ship.stub.CustomerReferenceType;
import com.fedex.ship.stub.CustomsClearanceDetail;
import com.fedex.ship.stub.Dimensions;
import com.fedex.ship.stub.DropoffType;
import com.fedex.ship.stub.FreightBaseCharge;
import com.fedex.ship.stub.FreightRateDetail;
import com.fedex.ship.stub.FreightRateNotation;
import com.fedex.ship.stub.InternationalDocumentContentType;
import com.fedex.ship.stub.LabelFormatType;
import com.fedex.ship.stub.LabelSpecification;
import com.fedex.ship.stub.LinearUnits;
import com.fedex.ship.stub.Money;
import com.fedex.ship.stub.Notification;
import com.fedex.ship.stub.NotificationSeverityType;
import com.fedex.ship.stub.PackageOperationalDetail;
import com.fedex.ship.stub.PackageRateDetail;
import com.fedex.ship.stub.PackageRating;
import com.fedex.ship.stub.PackagingType;
import com.fedex.ship.stub.Party;
import com.fedex.ship.stub.Payment;
import com.fedex.ship.stub.PaymentType;
import com.fedex.ship.stub.Payor;
import com.fedex.ship.stub.ProcessShipmentReply;
import com.fedex.ship.stub.ProcessShipmentRequest;
import com.fedex.ship.stub.PurposeOfShipmentType;
import com.fedex.ship.stub.RequestedPackageLineItem;
import com.fedex.ship.stub.RequestedShipment;
import com.fedex.ship.stub.ServiceType;
import com.fedex.ship.stub.ShipPortType;
import com.fedex.ship.stub.ShipServiceLocator;
import com.fedex.ship.stub.ShipmentOperationalDetail;
import com.fedex.ship.stub.ShipmentRateDetail;
import com.fedex.ship.stub.ShipmentRating;
import com.fedex.ship.stub.ShipmentSpecialServiceType;
import com.fedex.ship.stub.ShipmentSpecialServicesRequested;
import com.fedex.ship.stub.ShippingDocument;
import com.fedex.ship.stub.ShippingDocumentImageType;
import com.fedex.ship.stub.ShippingDocumentPart;
import com.fedex.ship.stub.Surcharge;
import com.fedex.ship.stub.TrackingId;
import com.fedex.ship.stub.TransactionDetail;
import com.fedex.ship.stub.VersionId;
import com.fedex.ship.stub.WebAuthenticationCredential;
import com.fedex.ship.stub.WebAuthenticationDetail;
import com.fedex.ship.stub.Weight;
import com.fedex.ship.stub.WeightUnits;

/**
 * Sample code to call the FedEx Ship Service
 * <p>
 * com.fedex.ship.stub is generated via WSDL2Java, like this:<br>
 * 
 * <pre>
 * java org.apache.axis.wsdl.WSDL2Java -w -p com.fedex.ship.stub http://www.fedex.com/...../ShipService?wsdl
 * </pre>
 * 
 * This sample code has been tested with JDK 5 and Apache Axis 1.4
 */
//
// Sample code to call the FedEx Ship Service - GDE Express Domestic India Shipment
//
public class ShipWebServiceClient {
  //
  static com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo orderTrackingInfo =
      new com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfoImpl();

  public static com.beautifulyears.sample.fedExOrder.domain.OrderTrackingInfo getShipWebService(
      org.broadleafcommerce.profile.core.domain.Address address) {

    ProcessShipmentRequest request = buildRequest(address); // Build a request object
    //
    try {
      // Initialize the service
      ShipServiceLocator service;
      ShipPortType port;
      //
      service = new ShipServiceLocator();
      updateEndPoint(service);
      port = service.getShipServicePort();
      //
      ProcessShipmentReply reply = port.processShipment(request); // This is the call to the ship
                                                                  // web service passing in a
                                                                  // request object and returning a
                                                                  // reply object
      //
      if (isResponseOk(reply.getHighestSeverity())) // check if the call was successful
      {
        orderTrackingInfo = writeServiceOutput(reply);
      }

      orderTrackingInfo = printNotifications(reply.getNotifications());

      //
    } catch (Exception e) {
      System.out.println(e.getMessage());
      orderTrackingInfo.setShippingMessage(e.getMessage());
      orderTrackingInfo.setShippingSeverity("ERROR");
    }
    return orderTrackingInfo;
  }

  //
  private static ProcessShipmentRequest buildRequest(
      org.broadleafcommerce.profile.core.domain.Address address) {
    ProcessShipmentRequest request = new ProcessShipmentRequest(); // Build a request object

    request.setClientDetail(createClientDetail());
    request.setWebAuthenticationDetail(createWebAuthenticationDetail());
    //
    TransactionDetail transactionDetail = new TransactionDetail();
    transactionDetail.setCustomerTransactionId("java sample - International Ground Shipment"); // The
                                                                                               // client
                                                                                               // will
                                                                                               // get
                                                                                               // the
                                                                                               // same
                                                                                               // value
                                                                                               // back
                                                                                               // in
                                                                                               // the
                                                                                               // response
    request.setTransactionDetail(transactionDetail);

    //
    VersionId versionId = new VersionId("ship", 15, 0, 0);
    request.setVersion(versionId);

    //
    RequestedShipment requestedShipment = new RequestedShipment();
    requestedShipment.setShipTimestamp(Calendar.getInstance()); // Ship date and time
    requestedShipment.setDropoffType(DropoffType.REGULAR_PICKUP);
    requestedShipment.setServiceType(ServiceType.STANDARD_OVERNIGHT); // Service types are
                                                                      // STANDARD_OVERNIGHT,
                                                                      // PRIORITY_OVERNIGHT,
                                                                      // FEDEX_GROUND ...
    requestedShipment.setPackagingType(PackagingType.YOUR_PACKAGING); // Packaging type FEDEX_BOX,
                                                                      // FEDEX_PAK, FEDEX_TUBE,
                                                                      // YOUR_PACKAGING, ...

    //
    requestedShipment.setShipper(addShipper()); // Sender information
    //
    requestedShipment.setRecipient(addRecipient(address));
    //
    requestedShipment.setShippingChargesPayment(addShippingChargesPayment());
    //
    requestedShipment.setSpecialServicesRequested(addShipmentSpecialServicesRequested());
    //
    requestedShipment.setCustomsClearanceDetail(addCustomsClearanceDetail());
    //
    requestedShipment.setLabelSpecification(addLabelSpecification());
    //
    requestedShipment.setPackageCount(new NonNegativeInteger("1"));
    //
    requestedShipment
        .setRequestedPackageLineItems(new RequestedPackageLineItem[] {addRequestedPackageLineItem()});
    request.setRequestedShipment(requestedShipment);
    //
    return request;
  }

  //
  private static OrderTrackingInfo writeServiceOutput(ProcessShipmentReply reply) throws Exception {
    try {
      System.out.println(reply.getTransactionDetail().getCustomerTransactionId());
      CompletedShipmentDetail csd = reply.getCompletedShipmentDetail();
      String masterTrackingNumber = printMasterTrackingNumber(csd);
      printShipmentOperationalDetails(csd.getOperationalDetail());
      printShipmentRating(csd.getShipmentRating());
      CompletedPackageDetail cpd[] = csd.getCompletedPackageDetails();
      orderTrackingInfo = printPackageDetails(cpd);
      // saveShipmentDocumentsToFile(csd.getShipmentDocuments(), masterTrackingNumber);
      getAssociatedShipmentLabels(csd.getAssociatedShipments());
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      //
    }
    return orderTrackingInfo;
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

  private static OrderTrackingInfo printNotifications(Notification[] notifications) {
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
      orderTrackingInfo.setShippingSeverity((nst == null ? "null" : nst.getValue()));
      // setSeverity
      System.out.println("    Code: " + n.getCode());
      System.out.println("    Message: " + n.getMessage());
      orderTrackingInfo.setShippingMessage(n.getMessage());
      // setMessage
      System.out.println("    Source: " + n.getSource());
    }
    return orderTrackingInfo;
  }

  private static void printMoney(Money money, String description, String space) {
    if (money != null) {
      System.out
          .println(space + description + ": " + money.getAmount() + " " + money.getCurrency());
    }
  }

  private static void printWeight(Weight weight, String description, String space) {
    if (weight != null) {
      System.out.println(space + description + ": " + weight.getValue() + " " + weight.getUnits());
    }
  }

  private static void printString(String value, String description, String space) {
    if (value != null) {
      System.out.println(space + description + ": " + value);
    }
  }

  private static Money addMoney(String currency, Double value) {
    Money money = new Money();
    money.setCurrency(currency);
    money.setAmount(new BigDecimal(value));
    return money;
  }

  private static Weight addPackageWeight(Double packageWeight, WeightUnits weightUnits) {
    Weight weight = new Weight();
    weight.setUnits(weightUnits);
    weight.setValue(new BigDecimal(packageWeight));
    return weight;
  }

  private static Dimensions addPackageDimensions(Integer length, Integer height, Integer width,
      LinearUnits linearUnits) {
    Dimensions dimensions = new Dimensions();
    dimensions.setLength(new NonNegativeInteger(length.toString()));
    dimensions.setHeight(new NonNegativeInteger(height.toString()));
    dimensions.setWidth(new NonNegativeInteger(width.toString()));
    dimensions.setUnits(linearUnits);
    return dimensions;
  }

  // Shipment level reply information
  private static void printShipmentOperationalDetails(
      ShipmentOperationalDetail shipmentOperationalDetail) {
    if (shipmentOperationalDetail != null) {
      System.out.println("Routing Details");
      printString(shipmentOperationalDetail.getUrsaPrefixCode(), "URSA Prefix", "  ");
      if (shipmentOperationalDetail.getCommitDay() != null)
        printString(shipmentOperationalDetail.getCommitDay().getValue(), "Service Commitment", "  ");
      printString(shipmentOperationalDetail.getAirportId(), "Airport Id", "  ");
      if (shipmentOperationalDetail.getDeliveryDay() != null)
        printString(shipmentOperationalDetail.getDeliveryDay().getValue(), "Delivery Day", "  ");
      System.out.println();
    }
  }

  private static void printShipmentRating(ShipmentRating shipmentRating) {
    if (shipmentRating != null) {
      System.out.println("Shipment Rate Details");
      ShipmentRateDetail[] srd = shipmentRating.getShipmentRateDetails();
      for (int j = 0; j < srd.length; j++) {
        System.out.println("  Rate Type: " + srd[j].getRateType().getValue());
        printWeight(srd[j].getTotalBillingWeight(), "Shipment Billing Weight", "    ");
        printMoney(srd[j].getTotalBaseCharge(), "Shipment Base Charge", "    ");
        printMoney(srd[j].getTotalNetCharge(), "Shipment Net Charge", "    ");
        printMoney(srd[j].getTotalSurcharges(), "Shipment Total Surcharge", "    ");
        if (null != srd[j].getSurcharges()) {
          System.out.println("    Surcharge Details");
          Surcharge[] s = srd[j].getSurcharges();
          for (int k = 0; k < s.length; k++) {
            printMoney(s[k].getAmount(), s[k].getSurchargeType().getValue(), "      ");
          }
        }
        printFreightDetail(srd[j].getFreightRateDetail());
        System.out.println();
      }
    }
  }

  // Package level reply information
  private static void printPackageOperationalDetails(
      PackageOperationalDetail packageOperationalDetail) {
    if (packageOperationalDetail != null) {
      System.out.println("  Routing Details");
      printString(packageOperationalDetail.getAstraHandlingText(), "Astra", "    ");
      printString(packageOperationalDetail.getGroundServiceCode(), "Ground Service Code", "    ");
      System.out.println();
    }
  }

  private static OrderTrackingInfo printPackageDetails(CompletedPackageDetail[] cpd)
      throws Exception {
    if (cpd != null) {
      System.out.println("Package Details");
      for (int i = 0; i < cpd.length; i++) { // Package details / Rating information for each
                                             // package
        String trackingNumber = cpd[i].getTrackingIds()[0].getTrackingNumber();
        orderTrackingInfo.setTrackingNumber(trackingNumber);
        printTrackingNumbers(cpd[i]);
        System.out.println();
        //
        printPackageRating(cpd[i].getPackageRating());
        // Write label buffer to file
        ShippingDocument sd = cpd[i].getLabel();
        // saveLabelToFile(sd, trackingNumber);
        printPackageOperationalDetails(cpd[i].getOperationalDetail());
        System.out.println();
      }
    }
    return orderTrackingInfo;
  }

  private static void printPackageRating(PackageRating packageRating) {
    if (packageRating != null) {
      System.out.println("Package Rate Details");
      PackageRateDetail[] prd = packageRating.getPackageRateDetails();
      for (int j = 0; j < prd.length; j++) {
        System.out.println("  Rate Type: " + prd[j].getRateType().getValue());
        printWeight(prd[j].getBillingWeight(), "Billing Weight", "    ");
        printMoney(prd[j].getBaseCharge(), "Base Charge", "    ");
        printMoney(prd[j].getNetCharge(), "Net Charge", "    ");
        printMoney(prd[j].getTotalSurcharges(), "Total Surcharge", "    ");
        if (null != prd[j].getSurcharges()) {
          System.out.println("    Surcharge Details");
          Surcharge[] s = prd[j].getSurcharges();
          for (int k = 0; k < s.length; k++) {
            printMoney(s[k].getAmount(), s[k].getSurchargeType().getValue(), "      ");
          }
        }
        System.out.println();
      }
    }
  }

  private static void printTrackingNumbers(CompletedPackageDetail completedPackageDetail) {
    if (completedPackageDetail.getTrackingIds() != null) {
      TrackingId[] trackingId = completedPackageDetail.getTrackingIds();
      for (int i = 0; i < trackingId.length; i++) {
        String trackNumber = trackingId[i].getTrackingNumber();
        String trackType = trackingId[i].getTrackingIdType().getValue();
        String formId = trackingId[i].getFormId();
        printString(trackNumber, trackType + " tracking number", "  ");
        printString(formId, "Form Id", "  ");
      }
    }
  }

  private static String getPayorAccountNumber() {
    // See if payor account number is set as system property,
    // if not default it to "XXX"
    String payorAccountNumber = System.getProperty("Payor.AccountNumber");
    if (payorAccountNumber == null) {
      payorAccountNumber = "510087801"; // Replace "XXX" with the payor account number
    }
    return payorAccountNumber;
  }

  private static Party addShipper() {
    Party shipperParty = new Party(); // Sender information
    Contact shipperContact = new Contact();
    shipperContact.setPersonName("Jharana Vasavada");
    shipperContact.setCompanyName("Beautiful Years");
    shipperContact.setPhoneNumber("9876543210");
    Address shipperAddress = new Address();
    shipperAddress.setStreetLines(new String[] {"1 SENDER STREET"});
    shipperAddress.setCity("PUNE");
    shipperAddress.setStateOrProvinceCode("MH");
    shipperAddress.setPostalCode("411011");
    shipperAddress.setCountryCode("IN");
    shipperAddress.setCountryName("INDIA");
    shipperParty.setContact(shipperContact);
    shipperParty.setAddress(shipperAddress);
    return shipperParty;
  }

  private static Party addRecipient(org.broadleafcommerce.profile.core.domain.Address address) {
    Party recipient = new Party(); // Recipient information
    Contact contactRecip = new Contact();
    // contactRecip.setPersonName("Recipient Name");
    contactRecip.setPersonName(address.getFirstName() + " " + address.getLastName());
    contactRecip.setCompanyName("Recipient Company Name");
    // contactRecip.setPhoneNumber("9876543210");
    if(null != address.getPhonePrimary() ){
    	contactRecip.setPhoneNumber(address.getPhonePrimary().getPhoneNumber());
    }else{
    	contactRecip.setPhoneNumber("9620200415");
    }
    recipient.setContact(contactRecip);
    //
    Address addressRecip = new Address();
    // addressRecip.setStreetLines(new String[] { "1 RECIPIENT STREET" });
    addressRecip.setStreetLines(new String[] {address.getAddressLine1() + " "
        + address.getAddressLine2() + " " + address.getAddressLine3()});
     addressRecip.setCity("NEWDELHI");
//    addressRecip.setCity(address.getCity());
    addressRecip.setStateOrProvinceCode("DL");
    // addressRecip.setPostalCode("110010");
    addressRecip.setPostalCode(address.getPostalCode());
    addressRecip.setCountryCode("IN");
    addressRecip.setCountryName("INDIA");
    addressRecip.setResidential(new Boolean(false));
    recipient.setAddress(addressRecip);
    return recipient;
  }

  private static ContactAndAddress addFinancialInstitutionParty() {
    ContactAndAddress contactAndAddress = new ContactAndAddress(); // Recipient information
    Contact contactRecip = new Contact();
    contactRecip.setPersonName("Recipient Name");
    contactRecip.setCompanyName("Recipient Company Name");
    contactRecip.setPhoneNumber("1234567890");
    contactAndAddress.setContact(contactRecip);
    //
    Address addressRecip = new Address();
    addressRecip.setStreetLines(new String[] {"1 RECIPIENT STREET"});
    addressRecip.setCity("NEWDELHI");
    addressRecip.setStateOrProvinceCode("DL");
    addressRecip.setPostalCode("110010");
    addressRecip.setCountryCode("IN");
    addressRecip.setCountryName("INDIA");
    addressRecip.setResidential(new Boolean(false));
    contactAndAddress.setAddress(addressRecip);
    return contactAndAddress;
  }

  private static Payment addShippingChargesPayment() {
    Payment payment = new Payment(); // Payment information
    payment.setPaymentType(PaymentType.SENDER);
    Payor payor = new Payor();
    Party responsibleParty = new Party();
    responsibleParty.setAccountNumber(getPayorAccountNumber());
    Address responsiblePartyAddress = new Address();
    responsiblePartyAddress.setCountryCode("IN");
    responsibleParty.setAddress(responsiblePartyAddress);
    responsibleParty.setContact(new Contact());
    payor.setResponsibleParty(responsibleParty);
    payment.setPayor(payor);
    return payment;
  }

  private static ShipmentSpecialServicesRequested addShipmentSpecialServicesRequested() {
    ShipmentSpecialServicesRequested shipmentSpecialServicesRequested =
        new ShipmentSpecialServicesRequested();
    ShipmentSpecialServiceType shipmentSpecialServiceType[] = new ShipmentSpecialServiceType[1];
    shipmentSpecialServiceType[0] = ShipmentSpecialServiceType.COD;
    shipmentSpecialServicesRequested.setSpecialServiceTypes(shipmentSpecialServiceType);
    CodDetail codDetail = new CodDetail();
    codDetail.setCollectionType(CodCollectionType.GUARANTEED_FUNDS);
    Money codMoney = new Money();
    codMoney.setCurrency("INR");
    codMoney.setAmount(new BigDecimal(400));
    codDetail.setCodCollectionAmount(codMoney);
    codDetail.setFinancialInstitutionContactAndAddress(addFinancialInstitutionParty());
    codDetail.setRemitToName("Remitter");
    shipmentSpecialServicesRequested.setCodDetail(codDetail);
    return shipmentSpecialServicesRequested;
  }

  private static Payment addDutiesPayment() {
    Payment payment = new Payment(); // Payment information
    payment.setPaymentType(PaymentType.SENDER);
    Payor payor = new Payor();
    Party responsibleParty = new Party();
    responsibleParty.setAccountNumber(getPayorAccountNumber());
    Address responsiblePartyAddress = new Address();
    responsiblePartyAddress.setCountryCode("IN");
    responsibleParty.setAddress(responsiblePartyAddress);
    responsibleParty.setContact(new Contact());
    payor.setResponsibleParty(responsibleParty);
    payment.setPayor(payor);
    return payment;
  }

  private static RequestedPackageLineItem addRequestedPackageLineItem() {
    RequestedPackageLineItem requestedPackageLineItem = new RequestedPackageLineItem();
    requestedPackageLineItem.setSequenceNumber(new PositiveInteger("1"));
    requestedPackageLineItem.setGroupPackageCount(new PositiveInteger("1"));
    requestedPackageLineItem.setWeight(addPackageWeight(50.5, WeightUnits.LB));
    requestedPackageLineItem.setDimensions(addPackageDimensions(108, 5, 5, LinearUnits.IN));
    requestedPackageLineItem.setCustomerReferences(new CustomerReference[] {
        addCustomerReference(CustomerReferenceType.CUSTOMER_REFERENCE.getValue(), "CR1234"),
        addCustomerReference(CustomerReferenceType.INVOICE_NUMBER.getValue(), "IV1234"),
        addCustomerReference(CustomerReferenceType.P_O_NUMBER.getValue(), "PO1234"),});
    return requestedPackageLineItem;
  }

  private static CustomerReference addCustomerReference(String customerReferenceType,
      String customerReferenceValue) {
    CustomerReference customerReference = new CustomerReference();
    customerReference.setCustomerReferenceType(CustomerReferenceType
        .fromString(customerReferenceType));
    customerReference.setValue(customerReferenceValue);
    return customerReference;
  }

  private static LabelSpecification addLabelSpecification() {
    LabelSpecification labelSpecification = new LabelSpecification(); // Label specification
    labelSpecification.setImageType(ShippingDocumentImageType.PDF);// Image types PDF, PNG, DPL, ...
    labelSpecification.setLabelFormatType(LabelFormatType.COMMON2D); // LABEL_DATA_ONLY, COMMON2D
    // labelSpecification.setLabelStockType(LabelStockType.value2); // STOCK_4X6.75_LEADING_DOC_TAB
    // labelSpecification.setLabelPrintingOrientation(LabelPrintingOrientationType.TOP_EDGE_OF_TEXT_FIRST);
    return labelSpecification;
  }

  private static CustomsClearanceDetail addCustomsClearanceDetail() {
    CustomsClearanceDetail customs = new CustomsClearanceDetail(); // International details
    customs.setDutiesPayment(addDutiesPayment());
    customs.setCustomsValue(addMoney("INR", 400.00));
    customs.setDocumentContent(InternationalDocumentContentType.NON_DOCUMENTS);
    customs.setCommercialInvoice(addCommercialInvoice());
    customs.setCommodities(new Commodity[] {addCommodity()});// Commodity details
    return customs;
  }

  private static CommercialInvoice addCommercialInvoice() {
    CommercialInvoice commercialInvoice = new CommercialInvoice();
    commercialInvoice.setPurpose(PurposeOfShipmentType.SOLD);
    commercialInvoice.setCustomerReferences(new CustomerReference[] {addCustomerReference(
        CustomerReferenceType.CUSTOMER_REFERENCE.getValue(), "1234"),});
    return commercialInvoice;
  }

  private static Commodity addCommodity() {
    Commodity commodity = new Commodity();
    commodity.setNumberOfPieces(new NonNegativeInteger("1"));
    commodity.setDescription("Books");
    commodity.setCountryOfManufacture("IN");
    commodity.setWeight(new Weight());
    commodity.getWeight().setValue(new BigDecimal(1.0));
    commodity.getWeight().setUnits(WeightUnits.LB);
    commodity.setQuantity(new BigDecimal("4.0"));
    commodity.setQuantityUnits("EA");
    commodity.setUnitPrice(new Money());
    commodity.getUnitPrice().setAmount(new java.math.BigDecimal(100.000000));
    commodity.getUnitPrice().setCurrency("INR");
    commodity.setCustomsValue(new Money());
    commodity.getCustomsValue().setAmount(new java.math.BigDecimal(400.000000));
    commodity.getCustomsValue().setCurrency("INR");
    commodity.setCountryOfManufacture("IN");
    commodity.setHarmonizedCode("490199009100");
    return commodity;
  }

  private static void printFreightDetail(FreightRateDetail freightRateDetail) {
    if (freightRateDetail != null) {
      System.out.println("  Freight Details");
      printFreightNotations(freightRateDetail);
      printFreightBaseCharges(freightRateDetail);

    }
  }

  private static void printFreightNotations(FreightRateDetail frd) {
    if (null != frd.getNotations()) {
      System.out.println("    Notations");
      FreightRateNotation notations[] = frd.getNotations();
      for (int n = 0; n < notations.length; n++) {
        printString(notations[n].getCode(), "Code", "      ");
        printString(notations[n].getDescription(), "Notification", "      ");
      }
    }
  }

  private static void printFreightBaseCharges(FreightRateDetail frd) {
    if (null != frd.getBaseCharges()) {
      FreightBaseCharge baseCharges[] = frd.getBaseCharges();
      for (int i = 0; i < baseCharges.length; i++) {
        System.out.println("    Freight Rate Details");
        printString(baseCharges[i].getDescription(), "Description", "      ");
        printString(baseCharges[i].getFreightClass().getValue(), "Freight Class", "      ");
        printString(baseCharges[i].getRatedAsClass().getValue(), "Rated Class", "      ");
        printWeight(baseCharges[i].getWeight(), "Weight", "      ");
        printString(baseCharges[i].getChargeBasis().getValue(), "Charge Basis", "      ");
        printMoney(baseCharges[i].getChargeRate(), "Charge Rate", "      ");
        printMoney(baseCharges[i].getExtendedAmount(), "Extended Amount", "      ");
        printString(baseCharges[i].getNmfcCode(), "NMFC Code", "      ");
      }
    }
  }

  // FEDEX tracking number Package Details
  private static String printMasterTrackingNumber(CompletedShipmentDetail csd) {
    String trackingNumber = "";
    if (null != csd.getMasterTrackingId()) {
      trackingNumber = csd.getMasterTrackingId().getTrackingNumber();
      System.out.println("Master Tracking Number");
      System.out.println("  Type: " + csd.getMasterTrackingId().getTrackingIdType());
      System.out.println("  Tracking Number: " + trackingNumber);
    }
    return trackingNumber;
  }

  // Saving and displaying shipping documents (labels)
  private static void saveLabelToFile(ShippingDocument shippingDocument, String trackingNumber)
      throws Exception {
    ShippingDocumentPart[] sdparts = shippingDocument.getParts();
    for (int a = 0; a < sdparts.length; a++) {
      ShippingDocumentPart sdpart = sdparts[a];
      String labelLocation = System.getProperty("file.label.location");
      if (labelLocation == null) {
        labelLocation = "c:\\";
      }
      String shippingDocumentType = shippingDocument.getType().getValue();
      String labelFileName =
          new String(labelLocation + shippingDocumentType + "." + trackingNumber + "_" + a + ".pdf");
      File labelFile = new File(labelFileName);
      FileOutputStream fos = new FileOutputStream(labelFile);
      fos.write(sdpart.getImage());
      fos.close();
      System.out.println("\nlabel file name " + labelFile.getAbsolutePath());
      // Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " +
      // labelFile.getAbsolutePath());
      Runtime.getRuntime().exec("gnome-open " + labelFile.getAbsolutePath());
    }
  }

  private static void saveShipmentDocumentsToFile(ShippingDocument[] shippingDocument,
      String trackingNumber) throws Exception {
    if (shippingDocument != null) {
      for (int i = 0; i < shippingDocument.length; i++) {
        ShippingDocumentPart[] sdparts = shippingDocument[i].getParts();
        for (int a = 0; a < sdparts.length; a++) {
          ShippingDocumentPart sdpart = sdparts[a];
          String labelLocation = System.getProperty("file.label.location");
          if (labelLocation == null) {
            labelLocation = "c:\\";
          }
          String labelName = shippingDocument[i].getType().getValue();
          String shippingDocumentLabelFileName =
              new String(labelLocation + labelName + "." + trackingNumber + "_" + a + ".pdf");
          File shippingDocumentLabelFile = new File(shippingDocumentLabelFileName);
          FileOutputStream fos = new FileOutputStream(shippingDocumentLabelFile);
          fos.write(sdpart.getImage());
          fos.close();
          System.out.println("\nAssociated shipment label file name "
              + shippingDocumentLabelFile.getAbsolutePath());
          // Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " +
          // shippingDocumentLabelFile.getAbsolutePath());
          Runtime.getRuntime().exec("gnome-open " + shippingDocumentLabelFile.getAbsolutePath());
        }
      }
    }
  }

  private static void getAssociatedShipmentLabels(
      AssociatedShipmentDetail[] associatedShipmentDetail) throws Exception {
    if (associatedShipmentDetail != null) {
      for (int j = 0; j < associatedShipmentDetail.length; j++) {
        if (associatedShipmentDetail[j].getLabel() != null
            && associatedShipmentDetail[j].getType() != null) {
          String trackingNumber = associatedShipmentDetail[j].getTrackingId().getTrackingNumber();
          String associatedShipmentType = associatedShipmentDetail[j].getType().getValue();
          ShippingDocument associatedShipmentLabel = associatedShipmentDetail[j].getLabel();
          // saveAssociatedShipmentLabelToFile(associatedShipmentLabel, trackingNumber,
          // associatedShipmentType);
        }
      }
    }
  }

  private static void saveAssociatedShipmentLabelToFile(ShippingDocument shippingDocument,
      String trackingNumber, String labelName) throws Exception {
    ShippingDocumentPart[] sdparts = shippingDocument.getParts();
    for (int a = 0; a < sdparts.length; a++) {
      ShippingDocumentPart sdpart = sdparts[a];
      String labelLocation = System.getProperty("file.label.location");
      if (labelLocation == null) {
        labelLocation = "c:\\";
      }
      String associatedShipmentLabelFileName =
          new String(labelLocation + labelName + "." + trackingNumber + "_" + a + ".pdf");
      File associatedShipmentLabelFile = new File(associatedShipmentLabelFileName);
      FileOutputStream fos = new FileOutputStream(associatedShipmentLabelFile);
      fos.write(sdpart.getImage());
      fos.close();
      System.out.println("\nAssociated shipment label file name "
          + associatedShipmentLabelFile.getAbsolutePath());
      // Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " +
      // associatedShipmentLabelFile.getAbsolutePath());
      Runtime.getRuntime().exec("gnome-open " + associatedShipmentLabelFile.getAbsolutePath());
    }
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

  private static void updateEndPoint(ShipServiceLocator serviceLocator) {
    // String endPoint = System.getProperty("endPoint");
    String endPoint = System.getProperty("https://wsbeta.fedex.com:443/web-services");
    if (endPoint != null) {
      serviceLocator.setShipServicePortEndpointAddress(endPoint);
    }
  }
}

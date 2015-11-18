package com.beautifulyears.sample.catalog.domain;

import java.util.List;

/**
 * This interface will be used to extend Product property
 * 
 * @author Aspire Software Solutions
 *
 */
public interface ExtendProduct {

  String getProductWarranty();

  void setProductWarranty(String productWarranty);

  String getProductDetails();

  void setProductDetails(String productDetails);

  String getProductType();

  void setProductType(String productType);

  Integer getProductDeliveryCharges();

  void setProductDeliveryCharges(Integer productDeliveryCharges);

  List<ExtendProductCODImpl> getProductCashOnDeliveryPincode();

  void setProductCashOnDeliveryPincode(List<ExtendProductCODImpl> productCashOnDeliveryPincode);

  String getProductDescription();

  void setProductDescription(String productDescription);

  String getProductReview();

  void setProductReview(String productReview);

  String getProductComment();

  void setProductComment(String productComment);

  Boolean getCashOnDelivery();

  void setCashOnDelivery(Boolean cashOnDelivery);

String getPickupAddressCode();

void setPickupAddressCode(String pickupAddressCode);

}

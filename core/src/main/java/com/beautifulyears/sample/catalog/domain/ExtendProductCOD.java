package com.beautifulyears.sample.catalog.domain;

import java.io.Serializable;

/**
 * This interface is used for COD methods of product
 * 
 * @author Aspire Software Solutions
 *
 */
public interface ExtendProductCOD extends Serializable {

  long getProductCashOnDeliveryPincode();

  void setProductCashOnDeliveryPincode(long productCashOnDeliveryPincode);

  Long getId();

  void setId(Long id);

}

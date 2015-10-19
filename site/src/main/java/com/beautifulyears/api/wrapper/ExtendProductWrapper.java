package com.beautifulyears.api.wrapper;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.log4j.Logger;
import org.broadleafcommerce.core.catalog.domain.Product;
import org.broadleafcommerce.core.web.api.wrapper.ProductWrapper;

import com.beautifulyears.sample.catalog.domain.ExtendProductCODImpl;
import com.beautifulyears.sample.catalog.domain.ExtendProductImpl;

/**
 * This wrapper provides wrap and unwrap method for pruduct
 * 
 * @author Aspire Software Solutions
 *
 */
@XmlRootElement(name = "extendProduct")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class ExtendProductWrapper extends ProductWrapper {

  final static Logger logger = Logger.getLogger(ExtendProductWrapper.class);

  @XmlElement
  private String productWarranty;

  @XmlElement
  private String productType;

  @XmlElement
  private String productDetails;

  @XmlElement
  private String productDescription;

  @XmlElement
  private String productReview;

  @XmlElement
  private String productComment;

  @XmlElement
  private Boolean isFeaturedProduct;

  @XmlElement
  private Long categoryId;

  @XmlElement
  private String categoryName;

  @XmlElement
  private int productDeliveryCharges;

  @XmlElement
  private Boolean cashOnDelivery;

  @XmlElement
  private List<ExtendProductCODWrapper> productCashOnDeliveryPincode =
      new ArrayList<ExtendProductCODWrapper>();

  /*
   * Extend wrap details method to add extended entities in existing wrapper (non-Javadoc)
   * 
   * @see org.broadleafcommerce.core.web.api.wrapper.ProductWrapper#wrapDetails
   * (org.broadleafcommerce.core.catalog.domain.Product, javax.servlet.http.HttpServletRequest)
   */
  @Override
  public void wrapDetails(Product model, HttpServletRequest request) {
    logger.debug("Executing method : wrapDetails()");
    // First, call the super method to get the default behavior
    super.wrapDetails(model, request);
    // Next, cast the product passed in to Extended Product and use it
    // to set the Extended Entities

    this.categoryId = model.getDefaultCategory().getId();
    this.categoryName = model.getDefaultCategory().getName();
    this.isFeaturedProduct = model.isFeaturedProduct();
    if (model instanceof ExtendProductImpl) {
      if (((ExtendProductImpl) model).getProductWarranty() != null) {
        this.productWarranty = ((ExtendProductImpl) model).getProductWarranty();
      }

      if (((ExtendProductImpl) model).getProductType() != null) {
        this.productType = ((ExtendProductImpl) model).getProductType();
      }

      if (((ExtendProductImpl) model).getProductDetails() != null) {
        this.productDetails = ((ExtendProductImpl) model).getProductDetails();
      }

      if (((ExtendProductImpl) model).getProductDescription() != null) {
        this.productDescription = ((ExtendProductImpl) model).getProductDescription();
      }

      if (((ExtendProductImpl) model).getProductReview() != null) {
        this.productReview = ((ExtendProductImpl) model).getProductReview();
      }

      if (((ExtendProductImpl) model).getProductComment() != null) {
        this.productComment = ((ExtendProductImpl) model).getProductComment();
      }

      if (((ExtendProductImpl) model).getProductDeliveryCharges() != null) {
        this.productDeliveryCharges = ((ExtendProductImpl) model).getProductDeliveryCharges();
      }

      this.cashOnDelivery = ((ExtendProductImpl) model).getCashOnDelivery();

      // Get list of product cod pin code
      List<ExtendProductCODImpl> codPinCode =
          ((ExtendProductImpl) model).getProductCashOnDeliveryPincode();

      // Add pin codes in wrapper
      for (ExtendProductCODImpl pinCode : codPinCode) {
        ExtendProductCODWrapper codWrapper =
            (ExtendProductCODWrapper) context.getBean(ExtendProductCODWrapper.class.getName());
        codWrapper.wrapSummary(pinCode, request);
        this.productCashOnDeliveryPincode.add(codWrapper);
      }
    }
  }

  @Override
  public void wrapSummary(Product model, HttpServletRequest request) {
    super.wrapSummary(model, request);
    wrapDetails(model, request);
  }
}

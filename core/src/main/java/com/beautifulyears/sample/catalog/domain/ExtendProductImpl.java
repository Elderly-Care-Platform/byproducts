package com.beautifulyears.sample.catalog.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.broadleafcommerce.common.extensibility.jpa.clone.ClonePolicyCollection;
import org.broadleafcommerce.common.presentation.AdminPresentation;
import org.broadleafcommerce.common.presentation.AdminPresentationClass;
import org.broadleafcommerce.common.presentation.AdminPresentationCollection;
import org.broadleafcommerce.common.presentation.AdminPresentationToOneLookup;
import org.broadleafcommerce.common.presentation.PopulateToOneFieldsEnum;
import org.broadleafcommerce.common.presentation.RequiredOverride;
import org.broadleafcommerce.common.presentation.client.SupportedFieldType;
import org.broadleafcommerce.common.presentation.override.AdminPresentationMergeEntry;
import org.broadleafcommerce.common.presentation.override.AdminPresentationMergeOverride;
import org.broadleafcommerce.common.presentation.override.PropertyType;
import org.broadleafcommerce.core.catalog.domain.Category;
import org.broadleafcommerce.core.catalog.domain.CategoryImpl;
import org.broadleafcommerce.core.catalog.domain.ProductImpl;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Index;

/**
 * This entity extends product entity and also represents "EXTEND_PRODUCT" table
 * 
 * @author Aspire Software Solutions
 *
 */
@Entity
@Table(name = "EXTEND_PRODUCT")
@Inheritance(strategy = InheritanceType.JOINED)
@Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE,
    region = "blStandardElements")
@NamedQueries(value = {@NamedQuery(name = "@get_all_orders_by_status",
    query = "from OrderImpl where status = :status")})
@AdminPresentationClass(populateToOneFields = PopulateToOneFieldsEnum.TRUE,
    friendlyName = "Product",
    ceilingDisplayEntity = "com.beautifulyears.sample.catalog.domain.ExtendProductImpl")
@AdminPresentationMergeOverride(name = "url", mergeEntries = {@AdminPresentationMergeEntry(
    propertyType = PropertyType.AdminPresentation.EXCLUDED, booleanOverrideValue = true)})
public class ExtendProductImpl extends ProductImpl implements ExtendProduct {

  private static final long serialVersionUID = 1L;

  @Column(name = "PRODUCT_WARRANTY")
  @AdminPresentation(friendlyName = "Product Warranty")
  private String productWarranty;

  @Column(name = "PRODUCT_DETAILS", length = Integer.MAX_VALUE - 1)
  @AdminPresentation(friendlyName = "Product Details", largeEntry = true, translatable = true,
      fieldType = SupportedFieldType.HTML_BASIC)
  private String productDetails;

  @Column(name = "PRODUCT_TYPE")
  @AdminPresentation(friendlyName = "Product Type")
  private String productType;

  @Column(name = "PRODUCT_DESCRIPTION", length = Integer.MAX_VALUE - 1)
  @AdminPresentation(friendlyName = "Product Long Description", largeEntry = true,
      translatable = true, fieldType = SupportedFieldType.HTML_BASIC)
  private String productDescription;

  @Column(name = "PRODUCT_REVIEW", length = Integer.MAX_VALUE - 1)
  @AdminPresentation(friendlyName = "Product Review", largeEntry = true, translatable = true,
      fieldType = SupportedFieldType.HTML_BASIC)
  private String productReview;

  @Column(name = "PRODUCT_COMMENT", length = Integer.MAX_VALUE - 1)
  @AdminPresentation(friendlyName = "Product Comment", largeEntry = true, translatable = true,
      fieldType = SupportedFieldType.HTML_BASIC)
  private String productComment;

  @Column(name = "CASH_ON_DELIVERY")
  @AdminPresentation(friendlyName = "Cash On Delivery", tab = "COD", tabOrder = 8000, group = "COD")
  private Boolean cashOnDelivery = false;

  @Column(name = "PRODUCT_DELIVERY_CHARGES")
  @AdminPresentation(friendlyName = "Product Delivery Charges", tab = "COD", tabOrder = 8000,
      group = "COD", requiredOverride = RequiredOverride.NOT_REQUIRED)
  private Integer productDeliveryCharges = 0;

  @OneToMany(fetch = FetchType.LAZY, targetEntity = ExtendProductCODImpl.class,
      mappedBy = "product", cascade = {CascadeType.ALL})
  @Cascade(value = {org.hibernate.annotations.CascadeType.ALL,
      org.hibernate.annotations.CascadeType.DELETE_ORPHAN})
  @Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE,
      region = "blProducts")
  @BatchSize(size = 50)
  @AdminPresentationCollection(friendlyName = "Product Cash On Delivery Pincode", tab = "COD",
      tabOrder = 8000)
  @ClonePolicyCollection
  private List<ExtendProductCODImpl> productCashOnDeliveryPincode =
      new ArrayList<ExtendProductCODImpl>();

  @Override
  public String getProductWarranty() {
    return productWarranty;
  }

  @Override
  public void setProductWarranty(String productWarranty) {
    this.productWarranty = productWarranty;
  }

  @Override
  public String getProductDetails() {
    return productDetails;
  }

  @Override
  public void setProductDetails(String productDetails) {
    this.productDetails = productDetails;
  }

  @Override
  public String getProductType() {
    return productType;
  }

  @Override
  public void setProductType(String productType) {
    this.productType = productType;
  }

  @Override
  public Integer getProductDeliveryCharges() {
    return productDeliveryCharges;
  }

  @Override
  public void setProductDeliveryCharges(Integer productDeliveryCharges) {
    this.productDeliveryCharges = productDeliveryCharges;
  }

  @Override
  public List<ExtendProductCODImpl> getProductCashOnDeliveryPincode() {
    return productCashOnDeliveryPincode;
  }

  @Override
  public void setProductCashOnDeliveryPincode(
      List<ExtendProductCODImpl> productCashOnDeliveryPincode) {
    this.productCashOnDeliveryPincode = productCashOnDeliveryPincode;
  }

  @Override
  public String getProductDescription() {
    return productDescription;
  }

  @Override
  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  @Override
  public String getProductReview() {
    return productReview;
  }

  @Override
  public void setProductReview(String productReview) {
    this.productReview = productReview;
  }

  @Override
  public String getProductComment() {
    return productComment;
  }

  @Override
  public void setProductComment(String productComment) {
    this.productComment = productComment;
  }

  @Override
  public Boolean getCashOnDelivery() {
    return cashOnDelivery;
  }

  @Override
  public void setCashOnDelivery(Boolean cashOnDelivery) {
    this.cashOnDelivery = cashOnDelivery;
  }
}

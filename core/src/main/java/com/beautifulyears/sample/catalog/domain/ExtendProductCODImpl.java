package com.beautifulyears.sample.catalog.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.broadleafcommerce.common.extensibility.jpa.copy.DirectCopyTransform;
import org.broadleafcommerce.common.extensibility.jpa.copy.DirectCopyTransformMember;
import org.broadleafcommerce.common.extensibility.jpa.copy.DirectCopyTransformTypes;
import org.broadleafcommerce.common.presentation.AdminPresentation;
import org.broadleafcommerce.common.presentation.AdminPresentationClass;
import org.broadleafcommerce.common.presentation.client.VisibilityEnum;
import org.broadleafcommerce.core.catalog.domain.Product;
import org.broadleafcommerce.core.catalog.domain.ProductImpl;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "EXTEND_PRODUCT_COD")
@AdminPresentationClass(friendlyName = "ProductCOD")
@DirectCopyTransform({
    @DirectCopyTransformMember(templateTokens = DirectCopyTransformTypes.SANDBOX,
        skipOverlaps = true),
    @DirectCopyTransformMember(templateTokens = DirectCopyTransformTypes.MULTITENANT_CATALOG)})
public class ExtendProductCODImpl implements ExtendProductCOD {

  /**
   * serialVersionUID
   */
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(generator = "codId")
  @GenericGenerator(name = "codId",
      strategy = "org.broadleafcommerce.common.persistence.IdOverrideTableGenerator",
      parameters = {
          @Parameter(name = "segment_value", value = "ExtendProductCODImpl"),
          @Parameter(name = "entity_name",
              value = "com.beautifulyears.sample.catalog.domain.ExtendProductCODImpl")})
  @Column(name = "COD_ID")
  @AdminPresentation(friendlyName = "codImpl_COD_ID", visibility = VisibilityEnum.HIDDEN_ALL)
  protected Long id;

  @Column(name = "PRODUCT_CASH_ON_DELIVERY_PINCODE")
  @AdminPresentation(friendlyName = "Product Cash On Delivery Pincode", order = 1, prominent = true)
  private long productCashOnDeliveryPincode;

  @ManyToOne(optional = true, targetEntity = ProductImpl.class)
  @JoinTable(name = "EXTEND_PRODUCT_COD_XREF", joinColumns = @JoinColumn(name = "COD_ID",
      referencedColumnName = "COD_ID"), inverseJoinColumns = @JoinColumn(name = "PRODUCT_ID",
      referencedColumnName = "PRODUCT_ID"))
  @Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "blProducts")
  protected Product product;

  @Override
  public Long getId() {
    return id;
  }

  @Override
  public void setId(Long id) {
    this.id = id;
  }

  @Override
  public long getProductCashOnDeliveryPincode() {
    return productCashOnDeliveryPincode;
  }

  @Override
  public void setProductCashOnDeliveryPincode(long productCashOnDeliveryPincode) {
    this.productCashOnDeliveryPincode = productCashOnDeliveryPincode;
  }

}

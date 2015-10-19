package com.beautifulyears.sample.profile.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.broadleafcommerce.common.presentation.AdminPresentation;
import org.broadleafcommerce.common.presentation.AdminPresentationClass;
import org.broadleafcommerce.common.presentation.PopulateToOneFieldsEnum;
import org.broadleafcommerce.profile.core.domain.AddressImpl;
import org.hibernate.annotations.Cache;

@Entity
@Table(name = "EXTEND_ADDRESS")
@Inheritance(strategy = InheritanceType.JOINED)
@Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE,
    region = "blStandardElements")
@AdminPresentationClass(populateToOneFields = PopulateToOneFieldsEnum.TRUE,
    friendlyName = "Address")
public class ExtendAddressImpl extends AddressImpl implements ExtendAddress {

  /**
   * serialVersionUID
   */
  private static final long serialVersionUID = 1L;

  @Column(name = "PRIMARY_EMAIL")
  @AdminPresentation(friendlyName = "Primary Email", order = 1000, group = "CustomerImpl_Customer",
      prominent = true, gridOrder = 1000)
  protected String primaryEmail;

  @Column(name = "SECONDARY_EMAIL")
  @AdminPresentation(friendlyName = "Secondary Email", order = 1000,
      group = "CustomerImpl_Customer", prominent = true, gridOrder = 1000)
  protected String secondaryEmail;

  @Override
  public String getPrimaryEmail() {
    return primaryEmail;
  }

  @Override
  public void setPrimaryEmail(String primaryEmail) {
    this.primaryEmail = primaryEmail;
  }

  @Override
  public String getSecondaryEmail() {
    return secondaryEmail;
  }

  @Override
  public void setSecondaryEmail(String secondaryEmail) {
    this.secondaryEmail = secondaryEmail;
  }

}

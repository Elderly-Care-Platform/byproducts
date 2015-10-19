package com.beautifulyears.sample.profile.domain;

import org.broadleafcommerce.profile.core.domain.Address;

public interface ExtendAddress extends Address {

  String getPrimaryEmail();

  void setPrimaryEmail(String primaryEmail);

  String getSecondaryEmail();

  void setSecondaryEmail(String secondaryEmail);

}

package com.beautifulyears.sample.profile.domain;

import org.broadleafcommerce.profile.core.domain.Customer;

public interface ExtendCustomer extends Customer{

	String getCustomUserId();

	void setCustomUserId(String customUserId);
	
}

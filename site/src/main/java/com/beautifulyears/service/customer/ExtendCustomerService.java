package com.beautifulyears.service.customer;

import org.broadleafcommerce.profile.core.service.CustomerService;

import com.beautifulyears.sample.profile.domain.ExtendCustomer;

public interface ExtendCustomerService extends CustomerService {

	
	public ExtendCustomer getByCustomUserId(String customUserId);
}

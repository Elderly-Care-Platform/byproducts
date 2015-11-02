package com.beautifulyears.dao.customer;

import org.broadleafcommerce.profile.core.dao.CustomerDao;

import com.beautifulyears.sample.profile.domain.ExtendCustomer;

public interface ExtendCustomerDao extends CustomerDao{

	public ExtendCustomer getByCustomUserId(String customUserId);
}

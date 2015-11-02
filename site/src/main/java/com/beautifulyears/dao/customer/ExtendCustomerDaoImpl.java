package com.beautifulyears.dao.customer;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.broadleafcommerce.profile.core.dao.CustomerDaoImpl;

import com.beautifulyears.sample.profile.domain.ExtendCustomer;

public class ExtendCustomerDaoImpl extends CustomerDaoImpl implements ExtendCustomerDao {

	@SuppressWarnings("unchecked")
	@Override
	public ExtendCustomer getByCustomUserId(String customUserId) {
		 Query query = em.createNamedQuery("@get_customer_by_custom_user_id");
	    query.setParameter("customUserId", customUserId);
	    ExtendCustomer ret = null;
	    List<ExtendCustomer> customer = null;
	    try{
	    	 customer =  (List<ExtendCustomer>) query.getResultList();
	    }
	    catch(NoResultException e){
	    	System.out.println("no records found, returning null");
	    }
	    if(customer.size() > 0){
	    	ret = customer.get(0);
	    }

	    return ret;
	    
	}

}

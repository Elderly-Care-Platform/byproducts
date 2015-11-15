/**
 * 
 */
package com.beautifulyears.dao.logistic.pincode;

import java.util.List;

import com.beautifulyears.sample.logistic.domain.PincodeImpl;

/**
 * @author Nitin
 *
 */
public interface PincodeDao {
	public PincodeImpl save(PincodeImpl pincode);
	public PincodeImpl find(Long pincode);
	public void update(List<PincodeImpl> pincodeList);
	
}

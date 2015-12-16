package com.beautifulyears.service.logistic.pincode;

import java.util.List;

import com.beautifulyears.sample.logistic.domain.PincodeImpl;

/**
 * @author Nitin
 *
 */
public interface PincodeService {
	public boolean save(PincodeImpl pincode);
	public PincodeImpl find(Long pincode);
	public void update(List<PincodeImpl> pincodeList);
}

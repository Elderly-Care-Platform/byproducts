/**
 * 
 */
package com.beautifulyears.service.logistic.pincode;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.beautifulyears.dao.logistic.pincode.PincodeDao;
import com.beautifulyears.sample.logistic.domain.PincodeImpl;

/**
 * @author Nitin
 *
 */
@Service("blPincodeService")
public class PincodeServiceImpl implements PincodeService {

	@Resource(name = "blPincodeDao")
	protected PincodeDao pincodeDao;

	@Override
	public boolean save(PincodeImpl pincode) {
		System.out.println("inside save method of pinCodeService");
		pincodeDao.save(pincode);
		return false;
	}

	@Override
	public void update(List<PincodeImpl> pincodeList) {
		pincodeDao.update(pincodeList);
		
	}

	@Override
	public PincodeImpl find(Long pincode) {
		return pincodeDao.find(pincode);
	}

}

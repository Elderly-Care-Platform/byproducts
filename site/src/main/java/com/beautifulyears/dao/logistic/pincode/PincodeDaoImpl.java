/**
 * 
 */
package com.beautifulyears.dao.logistic.pincode;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beautifulyears.sample.logistic.domain.PincodeImpl;

/**
 * @author Nitin
 *
 */
@Repository("blPincodeDao")
@Transactional(value = "blTransactionManager")
public class PincodeDaoImpl implements PincodeDao {

	@PersistenceContext(unitName = "blPU")
	protected EntityManager em;

	@Override
	@Transactional(value = "blTransactionManager")
	public PincodeImpl save(PincodeImpl pincode) {
		em.merge(pincode);
		return null;
	}

	@Override
	public void update(List<PincodeImpl> pincodeList) {

		System.out.println("truncating previous pincode");
		truncate();
		System.out.println("updating pincode list with new "
				+ pincodeList.size() + " number of pincodes.");
		for (PincodeImpl pincodeImpl : pincodeList) {
			this.save(pincodeImpl);
		}
	}

	@Transactional(value = "blTransactionManager")
	private void truncate() {
		try {
			em.createNativeQuery("truncate table EXTEND_PINCODE")
					.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public PincodeImpl find(Long pincode) {
		Query query = em.createNamedQuery("@find_pincode");
		query.setParameter("pincode", pincode);

		List<PincodeImpl> pincodeList = null;
		PincodeImpl ret = null;
		try {
			pincodeList = (List<PincodeImpl>) query.getResultList();
		} catch (NoResultException e) {
			System.out.println("no pincode found, returning null");
		}
		if (pincodeList.size() > 0) {
			ret = pincodeList.get(0);
		}

		return ret;
	}

}

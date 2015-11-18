package com.beautifulyears.sample.profile.domain;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.broadleafcommerce.common.presentation.AdminPresentation;
import org.broadleafcommerce.common.presentation.AdminPresentationClass;
import org.broadleafcommerce.common.presentation.PopulateToOneFieldsEnum;
import org.broadleafcommerce.profile.core.domain.AddressImpl;
import org.broadleafcommerce.profile.core.domain.CountryImpl;
import org.broadleafcommerce.profile.core.domain.PhoneImpl;
import org.broadleafcommerce.profile.core.domain.StateImpl;
import org.hibernate.annotations.Cache;

@Entity
@Table(name = "EXTEND_ADDRESS")
@Inheritance(strategy = InheritanceType.JOINED)
@Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE, region = "blStandardElements")
@AdminPresentationClass(populateToOneFields = PopulateToOneFieldsEnum.TRUE, friendlyName = "Address")
public class ExtendAddressImpl extends AddressImpl implements ExtendAddress {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "PRIMARY_EMAIL")
	@AdminPresentation(friendlyName = "Primary Email", order = 1000, group = "CustomerImpl_Customer", prominent = true, gridOrder = 1000)
	protected String primaryEmail;

	@Column(name = "SECONDARY_EMAIL")
	@AdminPresentation(friendlyName = "Secondary Email", order = 1000, group = "CustomerImpl_Customer", prominent = true, gridOrder = 1000)
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

	@Override
	public Map<String, String> getAddressMap() {
		Map<String, String> addressMap = new HashMap<String, String>();
		addressMap.put("firstName", this.getFirstName());
		addressMap.put("lastName", this.getLastName());
		addressMap.put("AddressLine1", this.getAddressLine1());
		addressMap.put("AddressLine2", this.getAddressLine2());
		addressMap.put("City", this.getCity());
		// addressMap.put("Country", this.getCounty());
		addressMap.put("Email", this.getPrimaryEmail());
		if (null != this.getPhonePrimary()) {
			addressMap.put("Phone", this.getPhonePrimary().getPhoneNumber());
		}
		return addressMap;
	}

	public ExtendAddressImpl() {
		super();
	}

	public ExtendAddressImpl(String addressLine1, String addressLine2,
			String addressLine3, String city, String state, String country,String pinCode,
			String emailAddress, String firstName, String lastName,
			String phoneNumber, String primaryEmail, String secondaryEmail) {
		this.primaryEmail = primaryEmail;
		this.secondaryEmail = secondaryEmail;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.city = city;
		this.state = new StateImpl();
		this.state.setName(state);
		this.county = country;
		this.postalCode = pinCode;

		this.country = new CountryImpl();
		this.country.setName(country);

		this.emailAddress = emailAddress;
		this.firstName = firstName;
		this.lastName = lastName;

		this.phonePrimary = new PhoneImpl();
		this.phonePrimary.setPhoneNumber(phoneNumber);
	}

}

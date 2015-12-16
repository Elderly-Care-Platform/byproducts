/**
 * 
 */
package com.beautifulyears.sample.config;

import java.util.LinkedHashMap;

import org.broadleafcommerce.common.BroadleafEnumerationType;

import com.beautifulyears.sample.profile.domain.ExtendAddressImpl;

/**
 * @author Nitin
 *
 */
public class PickUpAddressConfig implements BroadleafEnumerationType {

	public static final LinkedHashMap<String, ExtendAddressImpl> PICKUP_ADDRESS_MAP = new LinkedHashMap<String, ExtendAddressImpl>();

	// public ExtendAddressImpl(String addressLine1, String addressLine2,
	// String addressLine3, String city, String state, String country,
	// String emailAddress, String firstName, String lastName,
	// String phoneNumber, String primaryEmail, String secondaryEmail)

	public static final PickUpAddressConfig SELF = new PickUpAddressConfig(
			"SELF", new ExtendAddressImpl(
					"No.48, 2nd Main",// addressLiine1
					"Koramanagala 1st block",// addressLine2
					"",// addressLine3
					"Bengaluru",// city
					"Karnataka ",// state
					"India",// country
					"560034",// pin code
					"contact@beautifulyears.com",// email
					"Beautifulyears.com",// firstName
					"",// lastName
					"08069400333",// phne
					"contact@beautifulyears.com",// primaryEmail
					"amarnath.m@beautifulyears.com"// secondaryEmail
			));
	
	public static final PickUpAddressConfig PRAJWAL_SURGICALS = new PickUpAddressConfig(
			"Prajwal surgicals", new ExtendAddressImpl(
					"Shop No. 1033, 19th E Main Road",// addressLiine1
					" 1st N Block, Rajaji Nagar,19th Main Rd, Nagapura,",// addressLine2
					"",// addressLine3
					"Bengaluru",// city
					"Karnataka ",// state
					"India",// country
					"560010",// pin code
					"Salesenquiry@prajwalsurgicals.com",// email
					"Prajwal surgicals & scientifics",// firstName
					"",// lastName
					"9953361115",// phne
					"Salesenquiry@prajwalsurgicals.com",// primaryEmail
					"contact@prajwalsurgicals.com"// secondaryEmail
			));
	
	public static final PickUpAddressConfig AAPSONS_ORTHOTICS = new PickUpAddressConfig(
			"Aapsons orthotics", new ExtendAddressImpl(
					"Second floor, Vittal arcade,",// addressLiine1
					"V.S. Marg",// addressLine2
					"",// addressLine3
					"Udupi",// city
					"Karnataka ",// state
					"India",// country
					"576101",// pin code
					"aapson@rediffmail.com",// email
					"Apson Orthotics Private Limited",// firstName
					"",// lastName
					"9448155240",// phne
					"aapson@rediffmail.com",// primaryEmail
					""// secondaryEmail
			));
	
	public static final PickUpAddressConfig OSTRICH_MOBILITY = new PickUpAddressConfig(
			"Ostrich Mobility", new ExtendAddressImpl(
					"#235-J/1, 3rd Phase, ",// addressLiine1
					"Bommasandra Industrial Area,Hosur Road",// addressLine2
					"",// addressLine3
					"Bengaluru",// city
					"Karnataka ",// state
					"India",// country
					"560099",// pin code
					"sales@ostrichmobility.com",// email
					"Ostrich Mobility Instruments Pvt. Ltd.",// firstName
					"",// lastName
					"7847033033",// phne
					" info@ostrichmobility.com",// primaryEmail
					" ostrichmobility@gmail.com"// secondaryEmail
			));
	
	public static final PickUpAddressConfig THIRDLE_MOBILITY = new PickUpAddressConfig(
			"Thirdle mobility", new ExtendAddressImpl(
					"8/7 Manolaya Apartments,",// addressLiine1
					"First Cross St,Seethammal Colony,Alwarpet,,",// addressLine2
					"",// addressLine3
					"Chennai",// city
					"Tamil Nadu ",// state
					"India",// country
					"600018",// pin code
					"thirdlegmobility@gmail.com",// email
					"Thirdleg Mobility Aids Pvt Ltd",// firstName
					"",// lastName
					"8056223234 ",// phne
					"thirdlegmobility@gmail.com",// primaryEmail
					"vksthirdleg@gmail.com"// secondaryEmail
			));
	
	public static final PickUpAddressConfig ADL_NEUROTECH = new PickUpAddressConfig(
			"Adl Neurotech", new ExtendAddressImpl(
					"D5, Ceebros garden,",// addressLiine1
					"Old no.76/New no.14,Kamaraj salai, RA puram,",// addressLine2
					"",// addressLine3
					"Chennai",// city
					"Tamil Nadu ",// state
					"India",// country
					"600028",// pin code
					"enquiry@adlneurotech.co.in",// email
					"ADL Neurotech",// firstName
					"",// lastName
					"04424939640 , +91 94440 49390",// phne
					"enquiry@adlneurotech.co.in",// primaryEmail
					"ramesh@adlneurotech.co.in"// secondaryEmail
			));

	private String type;
	private String friendlyType;

	@Override
	public String getType() {
		return type;
	}

	@Override
	public String getFriendlyType() {
		return friendlyType;
	}

	public PickUpAddressConfig(final String type,
			final ExtendAddressImpl address) {
		this.friendlyType = type;
		this.type = type;
		setAddress(type, address);
	}

	private void setAddress(String type, ExtendAddressImpl address) {
		if (!PICKUP_ADDRESS_MAP.containsKey(type)) {
			PICKUP_ADDRESS_MAP.put(type, address);
		}
	}

}

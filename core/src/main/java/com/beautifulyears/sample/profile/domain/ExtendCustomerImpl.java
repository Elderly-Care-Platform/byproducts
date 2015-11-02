package com.beautifulyears.sample.profile.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.broadleafcommerce.common.presentation.AdminPresentation;
import org.broadleafcommerce.common.presentation.AdminPresentationClass;
import org.broadleafcommerce.common.presentation.PopulateToOneFieldsEnum;
import org.broadleafcommerce.profile.core.domain.CustomerImpl;

@Entity
@Table(name = "EXTEND_CUSTOMER")
@NamedQueries(value = { @NamedQuery(name = "@get_customer_by_custom_user_id", query = "from ExtendCustomerImpl where customUserId = :customUserId") })
@Inheritance(strategy = InheritanceType.JOINED)
@AdminPresentationClass(populateToOneFields = PopulateToOneFieldsEnum.TRUE, friendlyName = "CustomUserId", ceilingDisplayEntity = "com.beautifulyears.sample.profile.domain.ExtendCustomerImpl")
public class ExtendCustomerImpl extends CustomerImpl implements ExtendCustomer {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "CUSTOM_USER_ID")
	@AdminPresentation(friendlyName = "Customer UserId")
	public String customUserId;

	@Override
	public String getCustomUserId() {
		return customUserId;
	}

	@Override
	public void setCustomUserId(String customUserId) {
		this.customUserId = customUserId;
	}

}

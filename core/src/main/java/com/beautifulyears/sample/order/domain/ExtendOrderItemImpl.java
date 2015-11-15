/**
 * 
 */
package com.beautifulyears.sample.order.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.broadleafcommerce.common.presentation.AdminPresentation;
import org.broadleafcommerce.common.presentation.AdminPresentationClass;
import org.broadleafcommerce.common.presentation.PopulateToOneFieldsEnum;
import org.broadleafcommerce.core.order.domain.OrderItemImpl;

/**
 * @author Nitin
 *
 */

@Entity
@Table(name = "EXTEND_ORDER_ITEM")
@Inheritance(strategy = InheritanceType.JOINED)
@AdminPresentationClass(populateToOneFields = PopulateToOneFieldsEnum.TRUE, friendlyName = "awb", ceilingDisplayEntity = "com.beautifulyears.sample.order.domain.ExtendOrderItemImpl")
public class ExtendOrderItemImpl extends OrderItemImpl implements
		ExtendOrderItem {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "AWB_NUMBER")
	@AdminPresentation(friendlyName = "AWB Number",readOnly = true)
	private String awbNumber;

	@Override
	public String getAwbNumber() {
		return awbNumber;
	}

	@Override
	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}

}

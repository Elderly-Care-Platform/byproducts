/**
 * 
 */
package com.beautifulyears.dao.logistic.awb.status;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Nitin
 *
 */
@XmlRootElement(name = "object")
public class AwsStatus {

	private AwsStatusField[] field;

	@XmlElement
	public AwsStatusField[] getField() {
		return field;
	}

	public void setField(AwsStatusField[] field) {
		this.field = field;
	}

}

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
@XmlRootElement(name = "ecomexpress-objects")
public class EcomexpressObjects {

	private AwsStatus[] object;

	@XmlElement(name="object")
	public AwsStatus[] getObject() {
		return object;
	}

	public void setObject(AwsStatus[] object) {
		this.object = object;
	}

}

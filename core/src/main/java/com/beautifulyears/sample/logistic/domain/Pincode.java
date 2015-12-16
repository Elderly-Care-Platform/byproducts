/**
 * 
 */
package com.beautifulyears.sample.logistic.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Nitin
 *
 */
public interface Pincode  extends Serializable {

	public Long getId();
	public void setId(Long id);
	public String getCity();
	public void setCity(String city);
	public String getState();
	public void setState(String state);
	public String getRoute();
	public void setRoute(String route);
	public Date getDate_of_discontinuance();
	public void setDate_of_discontinuance(Date date_of_discontinuance);
	public String getState_code();
	public void setState_code(String state_code);
	public Long getPincode();
	public void setPincode(Long pincode);
	public String getCity_code();
	public void setCity_code(String city_code);
	public String getDccode();
	public void setDccode(String dccode);
}

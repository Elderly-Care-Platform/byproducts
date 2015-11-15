/**
 * 
 */
package com.beautifulyears.sample.logistic.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @author Nitin
 *
 */
@Entity
@Table(name = "EXTEND_PINCODE")
@NamedQueries(value = { @NamedQuery(name = "@find_pincode", query = "from PincodeImpl where pincode = :pincode") })
public class PincodeImpl implements Pincode{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "Id")
	@GenericGenerator(name = "Id",
    strategy = "org.broadleafcommerce.common.persistence.IdOverrideTableGenerator",
    parameters = {
        @Parameter(name = "segment_value", value = "PincodeImpl"),
        @Parameter(name = "entity_name",
            value = "com.beautifulyears.sample.profile.domain.PincodeImpl")})
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "CITY")
	private String city;
	@Column(name = "STATE")
	private String state;
	@Column(name = "ROUTE")
	private String route;
	@Column(name = "DATE_OF_DISCONTINUANCE")
	private Date date_of_discontinuance;
	@Column(name = "STATE_CODE")
	private String state_code;
	
	@Column(name = "PINCODE",unique = true)
	private Long pincode;
	@Column(name = "CITY_CODE")
	private String city_code;
	@Column(name = "DCCODE")
	private String dccode;
	
	@Override
	public Long getId() {
		return id;
	}
	@Override
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String getCity() {
		return city;
	}
	@Override
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String getState() {
		return state;
	}
	@Override
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String getRoute() {
		return route;
	}
	@Override
	public void setRoute(String route) {
		this.route = route;
	}
	@Override
	public Date getDate_of_discontinuance() {
		return date_of_discontinuance;
	}
	@Override
	public void setDate_of_discontinuance(Date date_of_discontinuance) {
		this.date_of_discontinuance = date_of_discontinuance;
	}
	@Override
	public String getState_code() {
		return state_code;
	}
	@Override
	public void setState_code(String state_code) {
		this.state_code = state_code;
	}
	@Override
	public Long getPincode() {
		return pincode;
	}
	@Override
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String getCity_code() {
		return city_code;
	}
	@Override
	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}
	@Override
	public String getDccode() {
		return dccode;
	}
	@Override
	public void setDccode(String dccode) {
		this.dccode = dccode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	

}

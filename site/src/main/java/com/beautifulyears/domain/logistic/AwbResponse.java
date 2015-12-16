package com.beautifulyears.domain.logistic;

import java.util.List;

public class AwbResponse {
	String reference_id;
	String success;
	List<String> awb;

	public String getReference_id() {
		return reference_id;
	}

	public void setReference_id(String reference_id) {
		this.reference_id = reference_id;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<String> getAwb() {
		return awb;
	}

	public void setAwb(List<String> awb) {
		this.awb = awb;
	}

}

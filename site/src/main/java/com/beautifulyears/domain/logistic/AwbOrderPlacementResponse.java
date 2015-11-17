package com.beautifulyears.domain.logistic;


public class AwbOrderPlacementResponse {
	String reason;
	String awb;
	String order_number;
	boolean success;

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getAwb() {
		return awb;
	}

	public void setAwb(String awb) {
		this.awb = awb;
	}

	public String getOrder_number() {
		return order_number;
	}

	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}

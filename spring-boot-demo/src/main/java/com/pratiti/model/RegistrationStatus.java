package com.pratiti.model;

public class RegistrationStatus {
	private boolean status;
	private String message;
	private int registeredCustId;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getRegisteredCustId() {
		return registeredCustId;
	}
	public void setRegisteredCustId(int registeredCustId) {
		this.registeredCustId = registeredCustId;
	}
	
	

}

package com.jspiders.demobankingapp.entity;

public class User {

	private String userName;
	private String email;
	private long mobileNumber;
	private int securityPin;
	private AadharCard aadharCard;

	public User() {
		super();
	}

	public User(String userName, String email, long mobileNumber, int securityPin, AadharCard aadharCard) {
		super();
		this.userName = userName;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.securityPin = securityPin;
		this.aadharCard = aadharCard;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getSecurityPin() {
		return securityPin;
	}

	public void setSecurityPin(int securityPin) {
		this.securityPin = securityPin;
	}

	public AadharCard getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(AadharCard aadharCard) {
		this.aadharCard = aadharCard;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", mobileNumber=" + mobileNumber + "]";
	}

}

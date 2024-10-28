package com.jspiders.demobankingapp.entity;

import com.jspiders.demobankingapp.enums.Gender;

public class AadharCard {

	private long aadharNumber;
	private String address;
	private String dob;
	private Gender gender;

	public AadharCard() {
		super();
	}

	public AadharCard(long aadharNumber, String address, String dob, Gender gender) {
		super();
		this.aadharNumber = aadharNumber;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
	}

	public long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "AadharCard [aadharNumber=" + aadharNumber + ", address=" + address + ", dob=" + dob + ", gender="
				+ gender + "]";
	}

}

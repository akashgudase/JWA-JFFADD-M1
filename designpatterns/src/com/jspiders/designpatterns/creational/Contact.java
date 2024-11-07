package com.jspiders.designpatterns.creational;

public class Contact {

	private String firstName;
	private String lastName;
	private String email;
	private long mobile;
	private long home;
	private long work;
	private int landline;
	private String dob;
	private String gender;
	private Address address;
	private Website website;

	public Contact(String firstName, String lastName, String email, long mobile, long home, long work, int landline,
			String dob, String gender, Address address, Website website) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.home = home;
		this.work = work;
		this.landline = landline;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.website = website;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", mobile=" + mobile
				+ ", home=" + home + ", work=" + work + ", landline=" + landline + ", dob=" + dob + ", gender=" + gender
				+ ", address=" + address + ", website=" + website + "]";
	}

}

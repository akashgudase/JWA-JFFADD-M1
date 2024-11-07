package com.jspiders.designpatterns.creational;

public class ContactBuilder {

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

	public ContactBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public ContactBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public ContactBuilder setEmail(String email) {
		this.email = email;
		return this;
	}

	public ContactBuilder setMobile(long mobile) {
		this.mobile = mobile;
		return this;
	}

	public ContactBuilder setHome(long home) {
		this.home = home;
		return this;
	}

	public ContactBuilder setWork(long work) {
		this.work = work;
		return this;
	}

	public ContactBuilder setLandline(int landline) {
		this.landline = landline;
		return this;
	}

	public ContactBuilder setDob(String dob) {
		this.dob = dob;
		return this;
	}

	public ContactBuilder setGender(String gender) {
		this.gender = gender;
		return this;
	}

	public ContactBuilder setAddress(Address address) {
		this.address = address;
		return this;
	}

	public ContactBuilder setWebsite(Website website) {
		this.website = website;
		return this;
	}

	public Contact build() {
		return new Contact(this.firstName, this.lastName, this.email, this.mobile, this.home, this.work, this.landline,
				this.dob, this.gender, this.address, this.website);
	}

}

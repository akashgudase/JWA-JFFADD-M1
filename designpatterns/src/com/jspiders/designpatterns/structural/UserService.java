package com.jspiders.designpatterns.structural;

public class UserService extends User implements feature {

	@Override
	public void signUp() {
		System.out.println("User is trying to sign up");
		this.setUserName("Ramesh");
		this.setEmail("ramesh@gmail.com");
		this.setMobile(9876543210l);
		this.setPassword("Ramesh@1234");
	}

	@Override
	public void logIn() {
		System.out.println("User is trying to login with username : " + this.getUserName() + " and password : "
				+ this.getPassword());
	}

}

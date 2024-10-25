package com.jspiders.serializationanddeserialization;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	private String username;
	private String email;
	private long mobile;
	private String password;

	public User() {
		super();
	}

	public User(String username, String email, long mobile, String password) {
		super();
		this.username = username;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", mobile=" + mobile + ", password=" + password
				+ "]";
	}

}

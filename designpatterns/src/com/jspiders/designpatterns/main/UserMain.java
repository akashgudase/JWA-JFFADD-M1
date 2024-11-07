package com.jspiders.designpatterns.main;

import com.jspiders.designpatterns.structural.UserService;

public class UserMain {

	public static void main(String[] args) {

		UserService userService = new UserService();
		userService.signUp();
		userService.logIn();

	}

}

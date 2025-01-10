package com.jspiders.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.springboot.entity.User;
import com.jspiders.springboot.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(path = "/users")
	protected User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	@PostMapping(path = "/users/auth")
	protected String findUserByEmailAndPassword(@RequestParam String email, @RequestParam String password) {
		User authenticatedUser = userService.findUserByEmailAndPassword(email, password);
		if (authenticatedUser != null)
			return "User is authenticated";
		else
			return "Invalid email or password";
	}

}

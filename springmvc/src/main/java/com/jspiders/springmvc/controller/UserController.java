package com.jspiders.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspiders.springmvc.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(path = "/home")
	protected String getHomePage() {
		return "home";
	}

	@RequestMapping(path = "/sign-up-page")
	protected String getSignUpPage() {
		return "sign_up";
	}

	@RequestMapping(path = "/add-user", method = RequestMethod.POST)
	protected String addUser(@RequestParam(name = "username") String name, @RequestParam(name = "email") String email,
			@RequestParam(name = "mobile") long mobile, @RequestParam(name = "password") String password,
			ModelMap modelMap) {
		boolean userAdded = userService.addUser(name, email, mobile, password);
		if (userAdded) {
			modelMap.addAttribute("message", "User added");
			return "login";
		} else {
			modelMap.addAttribute("message", "Something went wrong");
			return "sign_up";
		}
	}

	@RequestMapping(path = "/login-page")
	protected String getLoginPage() {
		return "login";
	}

	@RequestMapping(path = "/auth-user")
	protected String authUser(@RequestParam(name = "email") String email,
			@RequestParam(name = "password") String password, ModelMap modelMap) {
		boolean authenticatedUser = userService.authUser(email, password);
		if (authenticatedUser)
			return "home";
		else {
			modelMap.addAttribute("message", "Invalid email or password");
			return "login";
		}
	}

}

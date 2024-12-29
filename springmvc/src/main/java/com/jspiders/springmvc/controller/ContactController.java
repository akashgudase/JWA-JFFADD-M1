package com.jspiders.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspiders.springmvc.service.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;

	@RequestMapping(path = "/add-contact-page")
	protected String getAddContactPage() {
		return "add_contact";
	}

	@RequestMapping(path = "/add-contact", method = RequestMethod.POST)
	protected String addContact(@RequestParam(name = "first_name") String firstName,
			@RequestParam(name = "last_name") String lastName, @RequestParam(name = "email") String email,
			@RequestParam(name = "mobile") long mobile, @RequestParam(name = "work") long work,
			@RequestParam(name = "gender") String gender, @RequestParam(name = "dob") String dob,
			@RequestParam(name = "address") String address, @RequestParam(name = "website") String website,
			ModelMap modelMap) {
		boolean contactAdded = contactService.addContact(firstName, lastName, email, mobile, work, gender, dob, address,
				website);
		if (contactAdded)
			modelMap.addAttribute("message", "Contact added");
		else
			modelMap.addAttribute("message", "Something went wrong");
		return "contacts";
	}

}

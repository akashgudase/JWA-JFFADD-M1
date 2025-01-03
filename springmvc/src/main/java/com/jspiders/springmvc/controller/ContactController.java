package com.jspiders.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspiders.springmvc.dto.ContactDTO;
import com.jspiders.springmvc.dto.UserDTO;
import com.jspiders.springmvc.service.ContactService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;

	@RequestMapping(path = "/add-contact-page")
	protected String getAddContactPage(HttpSession httpSession) {
		UserDTO authenticatedUser = (UserDTO) httpSession.getAttribute("authenticatedUser");
		if (authenticatedUser != null)
			return "add_contact";
		else
			return "login";
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
		if (contactAdded) {
			modelMap.addAttribute("message", "Contact added");
			List<ContactDTO> contacts = contactService.findAllContacts();
			modelMap.addAttribute("contacts", contacts);
		} else
			modelMap.addAttribute("message", "Something went wrong");
		return "contacts";
	}

	@RequestMapping(path = "/contacts")
	protected String findAllContacts(ModelMap modelMap, HttpSession httpSession) {
		UserDTO authenticatedUser = (UserDTO) httpSession.getAttribute("authenticatedUser");
		if (authenticatedUser != null) {
			List<ContactDTO> contacts = contactService.findAllContacts();
			if (contacts != null)
				modelMap.addAttribute("contacts", contacts);
			else
				modelMap.addAttribute("message", "Contacts not found");
			return "contacts";
		} else
			return "login";
	}

	@RequestMapping(path = "/delete-contact")
	protected String deleteContactById(@RequestParam(name = "id") int id, ModelMap modelMap) {
		boolean contactDeleted = contactService.deleteContactById(id);
		if (contactDeleted) {
			modelMap.addAttribute("message", "Contact deleted");
			List<ContactDTO> contacts = contactService.findAllContacts();
			if (contacts != null)
				modelMap.addAttribute("contacts", contacts);
			else
				modelMap.addAttribute("message", "Contacts not found");
		} else
			modelMap.addAttribute("message", "Something went wrong");
		return "contacts";
	}

	@RequestMapping(path = "/edit-contact")
	protected String editContact(@RequestParam(name = "id") int id, ModelMap modelMap) {
		ContactDTO contact = contactService.findContactById(id);
		modelMap.addAttribute("contact", contact);
		return "edit_contact";
	}

	@RequestMapping(path = "/update-contact", method = RequestMethod.POST)
	protected String updateContact(@RequestParam(name = "id") int id,
			@RequestParam(name = "first_name") String firstName, @RequestParam(name = "last_name") String lastName,
			@RequestParam(name = "email") String email, @RequestParam(name = "mobile") long mobile,
			@RequestParam(name = "work") long work, @RequestParam(name = "gender") String gender,
			@RequestParam(name = "dob") String dob, @RequestParam(name = "address") String address,
			@RequestParam(name = "website") String website, ModelMap modelMap) {
		boolean contactUpdated = contactService.updateContact(id, firstName, lastName, email, mobile, work, gender, dob,
				address, website);
		if (contactUpdated) {
			modelMap.addAttribute("message", "Contact updated");
			List<ContactDTO> contacts = contactService.findAllContacts();
			modelMap.addAttribute("contacts", contacts);
		} else
			modelMap.addAttribute("message", "Something went wrong");
		return "contacts";
	}

}

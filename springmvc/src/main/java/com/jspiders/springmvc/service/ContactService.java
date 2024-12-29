package com.jspiders.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jspiders.springmvc.dao.ContactDAO;
import com.jspiders.springmvc.dto.ContactDTO;

@Component
public class ContactService {

	@Autowired
	private ContactDAO contactDAO;

	public boolean addContact(String firstName, String lastName, String email, long mobile, long work, String gender,
			String dob, String address, String website) {
		ContactDTO contactDTO = new ContactDTO();
		contactDTO.setFirstName(firstName);
		contactDTO.setLastName(lastName);
		contactDTO.setEmail(email);
		contactDTO.setMobile(mobile);
		contactDTO.setWork(work);
		contactDTO.setGender(gender);
		contactDTO.setDob(dob);
		contactDTO.setAddress(address);
		contactDTO.setWebsite(website);
		try {
			contactDAO.addContact(contactDTO);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}

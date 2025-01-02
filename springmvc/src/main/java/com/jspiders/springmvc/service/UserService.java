package com.jspiders.springmvc.service;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jspiders.springmvc.dao.UserDAO;
import com.jspiders.springmvc.dto.UserDTO;

@Component
public class UserService {

	@Autowired
	private UserDAO userDAO;

	public boolean addUser(String name, String email, long mobile, String password) {
		UserDTO userDTO = new UserDTO();
		userDTO.setName(name);
		userDTO.setEmail(email);
		userDTO.setMobile(mobile);
		userDTO.setPassword(password);
		try {
			userDAO.addUser(userDTO);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean authUser(String email, String password) {
		try {
			userDAO.authUser(email, password);
			return true;
		} catch (NoResultException e) {
			return false;
		}
	}

}

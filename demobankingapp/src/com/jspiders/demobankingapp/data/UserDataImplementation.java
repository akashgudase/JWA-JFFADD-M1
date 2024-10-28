package com.jspiders.demobankingapp.data;

import java.util.ArrayList;
import java.util.List;

import com.jspiders.demobankingapp.entity.User;

public class UserDataImplementation implements UserData {

	private List<User> users = new ArrayList<User>();

	@Override
	public void addUser(User user) {
		users.add(user);
		System.out.println("Account is created");
	}

	@Override
	public void deleteUser(int securityPin) {

	}

	@Override
	public void updateUser(int securityPin) {

	}

	@Override
	public void findUser(int securityPin) {
		User user = null;
		for (User u : users) {
			if (u.getSecurityPin() == securityPin) {
				user = u;
				break;
			}
		}
		if (user != null)
			System.out.println(user);
		else
			System.out.println("Invalid security pin");

	}

}

package com.jspiders.demobankingapp.data;

import com.jspiders.demobankingapp.entity.User;

public interface UserData {

	void addUser(User user);

	void deleteUser(int securityPin);

	void updateUser(int securityPin);

	void findUser(int securityPin);

}

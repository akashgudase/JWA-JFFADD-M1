package com.jspiders.demobankingapp.business;

import java.util.Scanner;

import com.jspiders.demobankingapp.data.UserData;
import com.jspiders.demobankingapp.data.UserDataImplementation;
import com.jspiders.demobankingapp.entity.AadharCard;
import com.jspiders.demobankingapp.entity.User;
import com.jspiders.demobankingapp.enums.Gender;

public class UserBusinessImplementation implements UserBusiness {

	private UserData userData = new UserDataImplementation();

	private Scanner scanner = new Scanner(System.in);

	@Override
	public void createAccount() {
		System.out.println("Enter username : ");
		String userName = scanner.next();
		System.out.println("Enter email address : ");
		String email = scanner.next();
		System.out.println("Enter mobile number : ");
		long mobileNumber = scanner.nextLong();
		System.out.println("Enter aadhar number : ");
		long aadharNumber = scanner.nextLong();
		scanner.nextLine();
		System.out.println("Enter address : ");
		String address = scanner.nextLine();
		System.out.println("Enter date of birth : ");
		String dob = scanner.next();
		Gender gender = null;
		boolean flag = true;
		while (flag) {
			System.out.println("Choose your gender : ");
			System.out.println("Enter 1 for MALE");
			System.out.println("Enter 2 for FEMALE");
			System.out.println("Enter 3 for OTHERS");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				gender = Gender.MALE;
				flag = false;
				break;
			case 2:
				gender = Gender.FEMALE;
				flag = false;
				break;
			case 3:
				gender = Gender.OTHERS;
				flag = false;
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
		System.out.println("Enter security pin : ");
		int securityPin = scanner.nextInt();
		AadharCard aadharCard = new AadharCard(aadharNumber, address, dob, gender);
		User user = new User(userName, email, mobileNumber, securityPin, aadharCard);
		userData.addUser(user);
	}

	@Override
	public void deleteAccount() {

	}

	@Override
	public void updateAccount() {

	}

	@Override
	public void logIn() {
		System.out.println("Enter security pin : ");
		int securityPin = scanner.nextInt();
		userData.findUser(securityPin);
	}

}

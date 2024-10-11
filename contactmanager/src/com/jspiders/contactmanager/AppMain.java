package com.jspiders.contactmanager;

import java.util.Scanner;

import com.jspiders.contactmanager.business.Business;
import com.jspiders.contactmanager.business.BusinessImplementation;

public class AppMain {
	
	private static Business business = new BusinessImplementation();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean run = true;

		while (run) {
			System.out.println("Enter 1 to add contact");
			System.out.println("Enter 2 to delete contact");
			System.out.println("Enter 3 to update contact");
			System.out.println("Enter 4 to find contact by first name");
			System.out.println("Enter 5 to find contact by last name");
			System.out.println("Enter 6 to exit");
			System.out.println("Enter your choice");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				business.addContact();
				break;
			case 2:
				business.deleteContact();
				break;
			case 3:
				business.updateContact();
				break;
			case 4:
				business.findContactByFirstName();
				break;
			case 5:
				business.findContactByLastName();
				break;
			case 6:
				System.out.println("See you soon");
				run = false;
				break;
			default:
				System.out.println("Invalid choice");
			}
		}

	}

}

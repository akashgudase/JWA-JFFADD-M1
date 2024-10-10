package com.jspiders.contactmanager.business;

import java.util.Scanner;

import com.jspiders.contactmanager.data.Data;
import com.jspiders.contactmanager.data.DataImplementation;
import com.jspiders.contactmanager.entity.Contact;

public class BusinessImplementation implements Business {

	private Scanner scanner = new Scanner(System.in);

	private int id;

	private Data data = new DataImplementation();

	@Override
	public void addContact() {
		System.out.println("Enter first name");
		String firstName = scanner.next();
		System.out.println("Enter last name");
		String lastName = scanner.next();
		System.out.println("Enter mobile number");
		long mobile = scanner.nextLong();
		System.out.println("Enter work number");
		long work = scanner.nextLong();
		System.out.println("Enter email");
		String email = scanner.next();

		Contact contact = new Contact(id(), firstName, lastName, mobile, work, email);

		data.addContact(contact);

		Contact[] contacts = data.findAllContacts();

		for (int i = 0; i < contacts.length; i++) {
			System.out.println(contacts[i]);
		}
	}

	@Override
	public void deleteContact() {
		System.out.println("Enter contact id");
		int id = scanner.nextInt();
		data.deleteContact(id);
		
		Contact[] contacts = data.findAllContacts();

		for (int i = 0; i < contacts.length; i++) {
			System.out.println(contacts[i]);
		}
	}

	@Override
	public void updateContact() {

	}

	@Override
	public void findContactByFirstName() {

	}

	@Override
	public void findContactByLastName() {

	}

	private int id() {
		return ++id;
	}

}

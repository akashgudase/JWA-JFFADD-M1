package com.jspiders.designpatterns.main;

import com.jspiders.designpatterns.creational.Contact;
import com.jspiders.designpatterns.creational.ContactBuilder;

public class ContactMain {

	public static void main(String[] args) {

		Contact contact = new ContactBuilder().setFirstName("Ramesh").setMobile(9876543210l).setWork(9988776655l)
				.build();
		System.out.println(contact);

	}

}

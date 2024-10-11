package com.jspiders.contactmanager.business;

public interface Business {
	
	void addContact();
	
	void deleteContact();
	
	void updateContact();
	
	void findContactByFirstName();
	
	void findContactByLastName();

	void findAllContacts();

}

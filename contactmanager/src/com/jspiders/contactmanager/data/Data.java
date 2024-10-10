package com.jspiders.contactmanager.data;

import com.jspiders.contactmanager.entity.Contact;

public interface Data {

	void addContact(Contact contact);

	void deleteContact(int id);

	Contact[] findAllContacts();

}

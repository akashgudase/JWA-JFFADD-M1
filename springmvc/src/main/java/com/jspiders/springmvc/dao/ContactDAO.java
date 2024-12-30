package com.jspiders.springmvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.jspiders.springmvc.dto.ContactDTO;

@Component
public class ContactDAO {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private EntityTransaction entityTransaction;

	public void addContact(ContactDTO contactDTO) {
		openConnection();
		entityTransaction.begin();
		entityManager.persist(contactDTO);
		entityTransaction.commit();
		closeConnection();
	}

	private void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("contact_manager");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}

	private void closeConnection() {
		if (entityManagerFactory != null)
			entityManagerFactory.close();
		if (entityManager != null)
			entityManager.close();
		if (entityTransaction != null) {
			if (entityTransaction.isActive())
				entityTransaction.rollback();
		}
	}

	@SuppressWarnings("unchecked")
	public List<ContactDTO> findAllContacts() {
		openConnection();
		Query query = entityManager.createQuery("SELECT contacts FROM ContactDTO contacts");
		List<ContactDTO> contacts = query.getResultList();
		closeConnection();
		return contacts;
	}

	public void deleteContactById(int id) {
		openConnection();
		entityTransaction.begin();
		ContactDTO contact = entityManager.find(ContactDTO.class, id);
		entityManager.remove(contact);
		entityTransaction.commit();
		closeConnection();
	}

}

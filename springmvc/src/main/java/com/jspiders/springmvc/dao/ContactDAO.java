package com.jspiders.springmvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

import com.jspiders.springmvc.dto.ContactDTO;

@Component
public class ContactDAO {

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

}

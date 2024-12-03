package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.AadharCard;
import com.jspiders.hibernate.dto.Person;

public class PersonDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	public static void main(String[] args) {

		AadharCard aadharCard = new AadharCard();
		aadharCard.setAadharNumber(112233445577l);
		aadharCard.setAddress("Pune");

		Person person = new Person();
		person.setName("Suresh");
		person.setMobileNumber(9876543211l);
		person.setAadharCard(aadharCard);

		openConnection();
		entityTransaction.begin();
		entityManager.persist(aadharCard);
		entityTransaction.commit();
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		closeConnection();
	}

	private static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}

	private static void closeConnection() {
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

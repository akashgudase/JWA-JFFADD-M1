package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.AadharCard;
import com.jspiders.hibernate.dto.Person;

public class PersonDAO2 {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;

	public static void main(String[] args) {

		openConnection();
		Person person = entityManager.find(Person.class, 1);
		if (person != null)
			System.out.println(person);
		else
			System.out.println("Person not found");
		AadharCard aadharCard = entityManager.find(AadharCard.class, 1);
		if (aadharCard != null)
			System.out.println(aadharCard);
		else
			System.out.println("Aadhar card not found");
		closeConnection();
	}

	private static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");
		entityManager = entityManagerFactory.createEntityManager();
	}

	private static void closeConnection() {
		if (entityManagerFactory != null)
			entityManagerFactory.close();
		if (entityManager != null)
			entityManager.close();
	}

}

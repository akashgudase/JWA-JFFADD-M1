package com.jspiders.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.Country;
import com.jspiders.hibernate.dto.State;

public class CountryDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	public static void main(String[] args) {

		Country country = new Country();
		country.setName("India");

		State state1 = new State();
		state1.setName("Maharashtra");
		state1.setCountry(country);

		State state2 = new State();
		state2.setName("Bihar");
		state2.setCountry(country);

		List<State> states = new ArrayList<State>();
		states.add(state1);
		states.add(state2);

		country.setStates(states);

		openConnection();
		entityTransaction.begin();
		entityManager.persist(country);
		entityTransaction.commit();
		entityTransaction.begin();
		entityManager.persist(state1);
		entityTransaction.commit();
		entityTransaction.begin();
		entityManager.persist(state2);
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

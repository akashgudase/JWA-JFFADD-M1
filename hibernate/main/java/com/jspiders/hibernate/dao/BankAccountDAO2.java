package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.BankAccount;
import com.jspiders.hibernate.dto.BankAccountHolder;

public class BankAccountDAO2 {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;

	public static void main(String[] args) {
		openConnection();
		BankAccount bankAccount = entityManager.find(BankAccount.class, 1);
		if (bankAccount != null) {
			System.out.println(bankAccount);
			BankAccountHolder bankAccountHolder = bankAccount.getBankAccountHolder();
			System.out.println(bankAccountHolder);
		} else
			System.out.println("Bank account does not exist");
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

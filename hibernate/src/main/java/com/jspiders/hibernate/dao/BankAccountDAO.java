package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.BankAccount;
import com.jspiders.hibernate.dto.BankAccountHolder;

public class BankAccountDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	public static void main(String[] args) {
		BankAccountHolder bankAccountHolder = new BankAccountHolder();
		bankAccountHolder.setName("Ramesh");
		bankAccountHolder.setMobile(9876543210l);

		BankAccount bankAccount1 = new BankAccount();
		bankAccount1.setAccountNumber(112233445566l);
		bankAccount1.setBankName("ICICI");
		bankAccount1.setBankAccountHolder(bankAccountHolder);

		BankAccount bankAccount2 = new BankAccount();
		bankAccount2.setAccountNumber(112233445577l);
		bankAccount2.setBankName("HDFC");
		bankAccount2.setBankAccountHolder(bankAccountHolder);

		openConnection();
		entityTransaction.begin();
		entityManager.persist(bankAccountHolder);
		entityTransaction.commit();
		entityTransaction.begin();
		entityManager.persist(bankAccount1);
		entityTransaction.commit();
		entityTransaction.begin();
		entityManager.persist(bankAccount2);
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

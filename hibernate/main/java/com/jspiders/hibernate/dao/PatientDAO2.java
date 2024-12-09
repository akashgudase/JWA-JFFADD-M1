package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.DNAReport;
import com.jspiders.hibernate.dto.Patient;

public class PatientDAO2 {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	public static void main(String[] args) {
		openConnection();
		Patient patient = entityManager.find(Patient.class, 1);
		if (patient != null) {
			entityTransaction.begin();
			entityManager.remove(patient);
			entityTransaction.commit();
			DNAReport dnaReport = patient.getDnaReport();
			entityTransaction.begin();
			entityManager.remove(dnaReport);
			entityTransaction.commit();
		} else
			System.out.println("Patient not found");
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

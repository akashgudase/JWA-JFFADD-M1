package com.jspiders.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.Student;
import com.jspiders.hibernate.dto.Subject;

public class StudentDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	public static void main(String[] args) {
		Subject subject1 = new Subject();
		subject1.setName("SQL");
		subject1.setFees(10000.00);

		Subject subject2 = new Subject();
		subject2.setName("CORE JAVA");
		subject2.setFees(20000.00);

		List<Subject> subjects = new ArrayList<Subject>();
		subjects.add(subject1);
		subjects.add(subject2);

		Student student1 = new Student();
		student1.setName("Ramesh");
		student1.setEmail("ramesh@gmail.com");
		student1.setMobile(9876543210l);
		student1.setSubjects(subjects);

		Student student2 = new Student();
		student2.setName("Suresh");
		student2.setEmail("suresh@gmail.com");
		student2.setMobile(9876543211l);
		student2.setSubjects(subjects);

		openConnection();
		entityTransaction.begin();
		entityManager.persist(subject1);
		entityTransaction.commit();
		entityTransaction.begin();
		entityManager.persist(subject2);
		entityTransaction.commit();
		entityTransaction.begin();
		entityManager.persist(student1);
		entityTransaction.commit();
		entityTransaction.begin();
		entityManager.persist(student2);
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

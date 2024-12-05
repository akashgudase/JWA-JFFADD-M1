package com.jspiders.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.Company;
import com.jspiders.hibernate.dto.Employee;

public class CompanyDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setName("Ramesh");
		employee1.setEmail("ramesh@gmail.com");
		employee1.setMobile(9876543210l);
		employee1.setSalary(450000.50);

		Employee employee2 = new Employee();
		employee2.setName("Suresh");
		employee2.setEmail("suesh@gmail.com");
		employee2.setMobile(9876543211l);
		employee2.setSalary(450000.50);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);

		Company company = new Company();
		company.setName("TCS");
		company.setLocation("Pune");
		company.setEmployees(employees);

		openConnection();
		entityTransaction.begin();
		entityManager.persist(employee1);
		entityTransaction.commit();
		entityTransaction.begin();
		entityManager.persist(employee2);
		entityTransaction.commit();
		entityTransaction.begin();
		entityManager.persist(company);
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

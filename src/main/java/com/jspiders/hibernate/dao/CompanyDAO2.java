package com.jspiders.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.Company;
import com.jspiders.hibernate.dto.Employee;

public class CompanyDAO2 {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;

	public static void main(String[] args) {
		openConnection();
		Company company = entityManager.find(Company.class, 1);
		if (company != null) {
			System.out.println(company);
			List<Employee> employees = company.getEmployees();
			for (Employee employee : employees) {
				System.out.println(employee);
			}
		} else
			System.out.println("Company not found");
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

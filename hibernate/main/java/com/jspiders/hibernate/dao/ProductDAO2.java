package com.jspiders.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.Product;

public class ProductDAO2 {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hibernate");

		EntityManager entityManager1 = entityManagerFactory.createEntityManager();

		// Product will be fetched from the database
		System.out.println(entityManager1.find(Product.class, 1));

		// Product will be fetched from the cache
		System.out.println(entityManager1.find(Product.class, 1));

		EntityManager entityManager2 = entityManagerFactory.createEntityManager();

		// Product will be fetched from the database
		System.out.println(entityManager2.find(Product.class, 1));

		// Product will be fetched from the cache
		System.out.println(entityManager2.find(Product.class, 1));

	}

}

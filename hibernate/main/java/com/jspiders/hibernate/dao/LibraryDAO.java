package com.jspiders.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.hibernate.dto.Book;
import com.jspiders.hibernate.dto.Library;

public class LibraryDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	public static void main(String[] args) {

		Book book1 = new Book();
		book1.setName("abc");
		book1.setAuthor("xyz");

		Book book2 = new Book();
		book2.setName("pqr");
		book2.setAuthor("lmn");

		List<Book> books = new ArrayList<Book>();
		books.add(book1);
		books.add(book2);

		Library library1 = new Library();
		library1.setName("abc");
		library1.setLocation("Wakad");
		library1.setBooks(books);

		Library library2 = new Library();
		library2.setName("abc");
		library2.setLocation("Wakad");
		library2.setBooks(books);

		List<Library> libraries = new ArrayList<Library>();
		libraries.add(library1);
		libraries.add(library2);

		book1.setLibraries(libraries);
		book2.setLibraries(libraries);

		openConnection();
		entityTransaction.begin();
		entityManager.persist(book1);
		entityTransaction.commit();
		entityTransaction.begin();
		entityManager.persist(book2);
		entityTransaction.commit();
		entityTransaction.begin();
		entityManager.persist(library1);
		entityTransaction.commit();
		entityTransaction.begin();
		entityManager.persist(library2);
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

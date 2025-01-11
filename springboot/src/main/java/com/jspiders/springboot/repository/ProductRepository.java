package com.jspiders.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jspiders.springboot.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByCategory(String category);

	@Query(value = "SELECT products FROM Product products WHERE products.title LIKE %:query% OR products.description LIKE %:query% OR products.category LIKE %:query%")
	List<Product> findByQuery(String query);

}

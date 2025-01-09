package com.jspiders.springboot.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springboot.entity.Product;
import com.jspiders.springboot.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	public List<Product> findAllProducts() {
		return productRepository.findAll();
	}

	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}

	public Product deleteProduct(int id) {
		Optional<Product> product = productRepository.findById(id);
		if (product.isPresent()) {
			productRepository.delete(product.get());
			return product.get();
		}
		return null;

	}

	public List<Product> findProductsByCategory(String category) {
		return productRepository.findByCategory(category);
	}

	public List<Product> sortProductsByCategory(int sortBy) {
		List<Product> products = productRepository.findAll();
		Collections.sort(products);
		if (sortBy == 1)
			Collections.reverse(products);
		return products;
	}

}

package com.jspiders.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.springboot.entity.Product;
import com.jspiders.springboot.entity.User;
import com.jspiders.springboot.service.ProductService;
import com.jspiders.springboot.service.UserService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@Autowired
	private UserService userService;

	@PostMapping(path = "/products")
	protected ResponseEntity<Object> addProduct(@RequestBody Product product, @RequestParam int userId) {
		User user = userService.findUserById(userId);
		if (user.getRole().equals("SELLER")) {
			Product addedProduct = productService.addProduct(product, userId);
			return new ResponseEntity<Object>(addedProduct, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Object>("Access denied", HttpStatus.UNAUTHORIZED);
		}
	}

	@GetMapping(path = "/products")
	protected List<Product> findAllProducts() {
		return productService.findAllProducts();
	}

	@PutMapping(path = "/products")
	protected Object updateProduct(@RequestBody Product product, @RequestParam int userId) {
		User user = userService.findUserById(userId);
		if (user.getRole().equals("SELLER"))
			return productService.updateProduct(product);
		else
			return "Access denied";
	}

	@DeleteMapping(path = "/products")
	protected String deleteProduct(@RequestParam int id) {
		Product deletedProduct = productService.deleteProduct(id);
		if (deletedProduct != null)
			return "Product is deleted";
		else
			return "Invalid product id";
	}

	@GetMapping(path = "/products/{category}")
	protected List<Product> findProductsByCategory(@PathVariable String category) {
		return productService.findProductsByCategory(category);
	}

	@GetMapping(path = "/products/sort/{sortBy}")
	protected List<Product> sortProductsByRating(@PathVariable int sortBy) {
		return productService.sortProductsByCategory(sortBy);
	}

	@GetMapping(path = "/products/query/{query}")
	protected ResponseEntity<Object> findProductsByQuery(@PathVariable String query) {
		List<Product> products = productService.findProductsByQuery(query);
		if (products.size() > 0) {
			return new ResponseEntity<Object>(products, HttpStatus.FOUND);
		} else {
			return new ResponseEntity<Object>("No products available", HttpStatus.NOT_FOUND);
		}
	}

}

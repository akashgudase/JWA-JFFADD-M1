package com.jspiders.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.springboot.entity.Product;
import com.jspiders.springboot.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping(path = "/products")
	protected Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

	@GetMapping(path = "/products")
	protected List<Product> findAllProducts() {
		return productService.findAllProducts();
	}

	@PutMapping(path = "/products")
	protected Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}

	@DeleteMapping(path = "/products")
	protected String deleteProduct(@RequestParam int id) {
		Product deletedProduct = productService.deleteProduct(id);
		if (deletedProduct != null)
			return "Product is deleted";
		else
			return "Invalid product id";
	}

}

package com.jspiders.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Comparable<Product> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String description;
	private double price;
	private int rating;
	private String category;

	@Override
	public int compareTo(Product o) {
		if (this.rating > o.rating)
			return 1;
		else if (this.rating < o.rating)
			return -1;
		else
			return 0;
	}

}

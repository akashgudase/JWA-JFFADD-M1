package com.jspiders.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long mobileNumber;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "aadhar_id", referencedColumnName = "id")
	private AadharCard aadharCard;

}

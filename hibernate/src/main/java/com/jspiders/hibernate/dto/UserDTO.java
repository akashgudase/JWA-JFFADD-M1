package com.jspiders.hibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class UserDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "user_name", nullable = false, unique = false)
	private String name;
	@Column(name = "user_email", nullable = false, unique = true)
	private String email;
	@Column(name = "user_mobile", nullable = false, unique = true)
	private long mobile;
	@Column(name = "user_password", nullable = false, unique = false)
	private String password;

}

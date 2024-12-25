package com.jspiders.springcore.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DatabaseConnection {

	private String url;
	private String username;
	private String password;

	{
		System.out.println("Bean is created for DatabaseConnection");
	}

}

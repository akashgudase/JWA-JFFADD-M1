package com.jspiders.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.jspiders.springcore.bean.DatabaseConnection;

public class ApplicationConfiguration {

	@Bean
	@Scope(value = "prototype")// By default the scope is "singleton"
	protected DatabaseConnection getDatabaseConnection() {
		DatabaseConnection databaseConnection = new DatabaseConnection();
		databaseConnection.setUrl("jdbc:mysql://localhost:3306");
		databaseConnection.setUsername("root");
		databaseConnection.setPassword("root");
		return databaseConnection;
	}

}

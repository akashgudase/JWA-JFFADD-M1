package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcore.bean.DatabaseConnection;
import com.jspiders.springcore.configuration.ApplicationConfiguration;

public class DatabaseConnectionMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		DatabaseConnection bean1 = applicationContext.getBean(DatabaseConnection.class);
		System.out.println(bean1);
		DatabaseConnection bean2 = applicationContext.getBean(DatabaseConnection.class);
		System.out.println(bean2);
		((AnnotationConfigApplicationContext) applicationContext).close();

	}

}

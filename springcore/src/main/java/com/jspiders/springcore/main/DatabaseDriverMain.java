package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcore.bean.DatabaseDriver;

public class DatabaseDriverMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.jspiders.springcore.bean");
		DatabaseDriver bean = applicationContext.getBean(DatabaseDriver.class);
		System.out.println(bean);
		((AnnotationConfigApplicationContext) applicationContext).close();

	}

}

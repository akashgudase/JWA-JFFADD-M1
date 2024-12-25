package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcore.bean.DatabaseOperation;

public class DatabaseOperationMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.jspiders.springcore.bean");
		DatabaseOperation bean = applicationContext.getBean(DatabaseOperation.class);
		System.out.println(bean);
		((AnnotationConfigApplicationContext) applicationContext).close();

	}

}

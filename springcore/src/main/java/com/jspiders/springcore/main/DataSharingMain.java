package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcore.bean.DataSharing;

public class DataSharingMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.jspiders.springcore.bean");
		DataSharing bean = applicationContext.getBean(DataSharing.class);
		System.out.println(bean);
		((AnnotationConfigApplicationContext) applicationContext).close();

	}

}

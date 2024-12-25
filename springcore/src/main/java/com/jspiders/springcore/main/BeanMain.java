package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.springcore.bean.BeanManager;
import com.jspiders.springcore.bean.BeanOperation;
import com.jspiders.springcore.configuration.BeanConfiguration;

public class BeanMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		BeanManager bean = (BeanManager) applicationContext.getBean("manager");
		System.out.println(bean);
		BeanOperation bean2 = (BeanOperation) applicationContext.getBean("operation");
		System.out.println(bean2);
		((AnnotationConfigApplicationContext) applicationContext).close();

	}

}

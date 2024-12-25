package com.jspiders.springcore.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "operation")
public class BeanOperation {

	@Autowired
	private BeanManager beanManager;

	{
		System.out.println("BeanOperation is created");
	}

	@Override
	public String toString() {
		return "BeanOperation [beanManager=" + beanManager + "]";
	}

}

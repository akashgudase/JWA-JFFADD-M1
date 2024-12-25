package com.jspiders.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.jspiders.springcore.bean.BeanManager;

@ComponentScan(basePackages = "com.jspiders.springcore.bean")
public class BeanConfiguration {

	@Bean(name = "manager")
	protected BeanManager getBeanManager() {
		return new BeanManager();
	}

}

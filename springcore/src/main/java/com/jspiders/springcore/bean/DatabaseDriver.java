package com.jspiders.springcore.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class DatabaseDriver {

	// @Value("com.mysql.cj.jdbc.Driver")
	private String name;

	/*
	 * public DatabaseDriver(@Value("com.mysql.cj.jdbc.Driver") String name) {
	 * super(); this.name = name; }
	 */

	@Value("com.mysql.cj.jdbc.Driver")
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DatabaseDriver [name=" + name + "]";
	}

}

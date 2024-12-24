package com.jspiders.springcore.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class DatabaseOperation {

	// @Autowired
	private DatabaseDriver databaseDriver;

	/*
	 * public DatabaseOperation(@Autowired DatabaseDriver databaseDriver) { super();
	 * this.databaseDriver = databaseDriver; }
	 */

	@Autowired
	public void setDatabaseDriver(DatabaseDriver databaseDriver) {
		this.databaseDriver = databaseDriver;
	}

	@Override
	public String toString() {
		return "DatabaseOperation [databaseDriver=" + databaseDriver + "]";
	}

}

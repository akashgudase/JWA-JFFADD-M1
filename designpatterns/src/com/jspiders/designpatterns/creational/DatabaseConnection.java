package com.jspiders.designpatterns.creational;

public class DatabaseConnection {

	private static DatabaseConnection connection = new DatabaseConnection();

	private DatabaseConnection() {
		super();
	}

//	public static DatabaseConnection getConnection() {
//		if (connection == null) {
//			connection = new DatabaseConnection();
//		}
//		return connection;
//	}

	public static DatabaseConnection getConnection() {
		return connection;
	}

}

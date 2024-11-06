package com.jspiders.designpatterns.main;

import com.jspiders.designpatterns.creational.DatabaseConnection;

public class DatabaseMain {

	public static void main(String[] args) {

		DatabaseConnection connection1 = DatabaseConnection.getConnection();
		DatabaseConnection connection2 = DatabaseConnection.getConnection();
		DatabaseConnection connection3 = DatabaseConnection.getConnection();
		DatabaseConnection connection4 = DatabaseConnection.getConnection();

		System.out.println(connection1);
		System.out.println(connection2);
		System.out.println(connection3);
		System.out.println(connection4);

	}

}

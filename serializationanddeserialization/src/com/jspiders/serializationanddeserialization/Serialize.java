package com.jspiders.serializationanddeserialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {

	public static void main(String[] args) {

		User user = new User("Ramesh", "ramesh@gmail.com", 9876543210l, "Ramesh@1234");

		File file = new File("D:\\File\\demo.txt");

		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;

		try {
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(user);
			System.out.println("Object has been serialized");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Something went wrong");
		} finally {
			try {
				objectOutputStream.close();
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

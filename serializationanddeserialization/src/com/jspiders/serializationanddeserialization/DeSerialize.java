package com.jspiders.serializationanddeserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialize {

	public static void main(String[] args) {

		File file = new File("D:\\File\\demo.txt");

		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;

		try {
			fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			User user = (User) objectInputStream.readObject();
			System.out.println(user);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Something went wrong");
		} finally {
			try {
				objectInputStream.close();
				fileInputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

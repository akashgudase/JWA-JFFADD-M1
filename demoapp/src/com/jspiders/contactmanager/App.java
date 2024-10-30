package com.jspiders.contactmanager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		File contacts = new File("D:\\File\\contacts.txt");
		File temp = new File("D:\\File\\temp.txt");

		FileReader fileReader = new FileReader(contacts);
		FileWriter fileWriter = new FileWriter(temp);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		String contact = null;
		while ((contact = bufferedReader.readLine()) != null) {
			bufferedWriter.write(contact);
			bufferedWriter.newLine();
		}
		
		bufferedWriter.write("Ramesh, 9876543211");
		bufferedWriter.newLine();
		bufferedWriter.write("Suresh, 9876543212");
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close();
		fileReader.close();
		fileWriter.close();

		contacts.delete();
		temp.renameTo(contacts);

	}

}

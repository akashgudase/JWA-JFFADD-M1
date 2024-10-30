package com.jspiders.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWrite {

	public static void main(String[] args) {

		File file = new File("D:\\File\\demo.txt");

		if (!(file.exists())) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		FileWriter fileWriter = null;

		try {
			fileWriter = new FileWriter(file);
			fileWriter.write("Java is a programming language");
			System.out.println("Data is written to a file");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Something went wrong");
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}

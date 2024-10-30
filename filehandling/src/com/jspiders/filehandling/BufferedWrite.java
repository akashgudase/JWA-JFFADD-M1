package com.jspiders.filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWrite {

	private static File file;
	private static FileWriter fileWriter;
	private static BufferedWriter bufferedWriter;

	public static void main(String[] args) throws IOException {

		file = new File("D:\\File\\demo.txt");
		fileWriter = new FileWriter(file);
		bufferedWriter = new BufferedWriter(fileWriter);

		print("Hello World!");
		print("Java is a programming language");

		bufferedWriter.close();
		fileWriter.close();

	}

	private static void print(String message) throws IOException {
		bufferedWriter.write(message);
		bufferedWriter.newLine();
	}

}

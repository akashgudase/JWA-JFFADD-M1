package com.jspiders.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedRead {

	private static File file;
	private static FileReader fileReader;
	private static BufferedReader bufferedReader;

	public static void main(String[] args) throws IOException {

		file = new File("D:\\File\\demo.txt");
		fileReader = new FileReader(file);
		bufferedReader = new BufferedReader(fileReader);
		fetch();
		bufferedReader.close();
		fileReader.close();

	}

	private static void fetch() throws IOException {
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
	}

}

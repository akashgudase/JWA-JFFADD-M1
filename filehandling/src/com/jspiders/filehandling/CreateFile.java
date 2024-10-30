package com.jspiders.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\File\\demo.txt");
		boolean created = file.createNewFile();
		if (created)
			System.out.println("File is created");
		else
			System.out.println("File already exists");
	}

}

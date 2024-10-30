package com.jspiders.filehandling;

import java.io.File;

public class FileProperties {

	public static void main(String[] args) {

		File file = new File("D:\\File\\demo.txt");

		if (file.exists()) {
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());
			System.out.println(file.length());
			if (file.canExecute())
				System.out.println("File is executable");
			else
				System.out.println("File is not executable");
			if (file.canWrite())
				System.out.println("File is writable");
			else
				System.out.println("File is not writable");
			if (file.canRead())
				System.out.println("File is readable");
			else
				System.out.println("File is not readable");
		} else
			System.out.println("File does not exist");

	}

}

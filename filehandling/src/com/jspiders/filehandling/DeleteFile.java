package com.jspiders.filehandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {

		File file = new File("D:\\File\\demo.txt");
		if (file.exists()) {
			boolean deleted = file.delete();
			if (deleted)
				System.out.println("File is deleted");
			else
				System.out.println("Something went wrong");
		} else
			System.out.println("File does not exist");

	}

}

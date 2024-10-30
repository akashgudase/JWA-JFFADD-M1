package com.jspiders.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CharStreamScan {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("D:\\File\\demo.txt");

		if (file.exists()) {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		} else
			System.out.println("File does not exist");

	}

}

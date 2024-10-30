package com.jspiders.filehandling;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamRead {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\File\\demo.txt");

		if (file.exists()) {
			FileInputStream fileInputStream = new FileInputStream(file);
			DataInputStream dataInputStream = new DataInputStream(fileInputStream);
			int res = dataInputStream.readInt();
			System.out.println(res);
			dataInputStream.close();
			fileInputStream.close();
		} else
			System.out.println("File does not exist");
	}
}

package com.jspiders.filehandling;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {

	public static void main(String[] args) {

		File file = new File("D:\\File\\demo.txt");

		if (!(file.exists())) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		FileOutputStream fileOutputStream = null;
		DataOutputStream dataOutputStream = null;

		try {
			fileOutputStream = new FileOutputStream(file);
			dataOutputStream = new DataOutputStream(fileOutputStream);
			dataOutputStream.writeInt(1000);
			System.out.println("Data is written to a file");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Something went wrong");
		} finally {
			try {
				dataOutputStream.close();
				fileOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

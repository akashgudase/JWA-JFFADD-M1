package com.jspiders.multithreading;

public class App4 {

	public static void main(String[] args) throws InterruptedException {

		String message = "Java is a programming language";
		for (int i = 0; i < message.length(); i++) {
			System.out.print(message.charAt(i));
			Thread.sleep(500);
		}

	}

}

package com.jspiders.serializationanddeserialization;

import java.io.IOException;

public class MessangerMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Messanger messanger = new Messanger();

		messanger.send("Hi, How are you?");

		System.out.println(messanger.receive());

	}

}

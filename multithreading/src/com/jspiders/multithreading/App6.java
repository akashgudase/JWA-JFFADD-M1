package com.jspiders.multithreading;

import com.jspiders.multithreading.resource.Product;
import com.jspiders.multithreading.thread.Consumer;
import com.jspiders.multithreading.thread.Producer;

public class App6 {

	public static void main(String[] args) {

		Product product = new Product();

		Consumer consumer = new Consumer(product);
		Producer producer = new Producer(product);

		consumer.start();
		producer.start();

	}

}

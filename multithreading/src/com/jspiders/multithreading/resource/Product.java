package com.jspiders.multithreading.resource;

public class Product {

	private boolean available;

	synchronized public void order() throws InterruptedException {
		if (this.available) {
			System.out.println("Product is available for the order");
			System.out.println("Order is placed by the consumer");
		} else {
			System.out.println("Product is currently unavailable for the order");
			System.out.println("Producer will notify you once the product is available for the order");
			wait();
			if (this.available) {
				System.out.println("Received notification from the producer");
				System.out.println("Product is available now for the order");
				System.out.println("Order is placed by the consumer");
			}
		}
	}

	synchronized public void manufacture() {
		this.available = true;
		System.out.println("Producer made the product availabel for the order");
		System.out.println("Sending notification to the consumer");
		notify();
	}

}

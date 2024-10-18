package com.jspiders.multithreading.resource;

public class Counter {

	private int count;

	synchronized public void increment() {
		this.count++;
	}

	public int getCount() {
		return this.count;
	}

}

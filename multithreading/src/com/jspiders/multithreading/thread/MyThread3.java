package com.jspiders.multithreading.thread;

public class MyThread3 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("A thread with id " + this.getId() + " and name " + this.getName() + " with priority "
					+ this.getPriority() + " is running");
		}
	}

}

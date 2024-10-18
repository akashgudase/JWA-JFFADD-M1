package com.jspiders.multithreading;

import com.jspiders.multithreading.thread.MyThread3;

public class App2 {

	public static void main(String[] args) {

		MyThread3 thread1 = new MyThread3();
		thread1.setName("Thread-1");
		thread1.setPriority(1);

		MyThread3 thread2 = new MyThread3();
		thread2.setName("Thread-2");
		thread2.setPriority(10);

		thread1.start();
		thread2.start();

	}

}

package com.stmt4;

class Counter2 {
	int count;

	public void increment() {
		count++;
	}
}

public class ThreadingDemo9 {
	public static void main(String[] args) throws InterruptedException {
		Counter2 c = new Counter2();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.increment();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.increment();
				}
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Count: " + c.count);

	}
}

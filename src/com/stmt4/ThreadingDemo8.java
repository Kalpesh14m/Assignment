package com.stmt4;

class Counter1 {
	int count;

	public void increment() {
		count++;
	}
}

public class ThreadingDemo8 {
	public static void main(String[] args) throws InterruptedException {
		Counter1 c = new Counter1();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.increment();
				}
			}
		});

		t1.start();

		t1.join();

		System.out.println("Count: " + c.count);

	}
}

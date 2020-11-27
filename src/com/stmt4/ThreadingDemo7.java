package com.stmt4;

class Counter {
	int count;

	public void increment() {
		count++;
	}
}

public class ThreadingDemo7 {
	public static void main(String[] args) {
		Counter c = new Counter();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.increment();
				}
			}
		});

		t1.start();

		System.out.println("Count: " + c.count);
	}
}

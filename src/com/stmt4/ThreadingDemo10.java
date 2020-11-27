package com.stmt4;

class Counter3 {
	int count;

	public synchronized void increment() {
		count++;
	}
}

public class ThreadingDemo10 {
	public static void main(String[] args) throws InterruptedException {
		Counter3 c = new Counter3();

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				c.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				c.increment();
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Count: " + c.count);

	}
}

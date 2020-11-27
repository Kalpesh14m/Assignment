package com.stmt4;

public class ThreadingDemo6 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("HI");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
		});

		t1.start();
		Thread.sleep(1000);
		t2.start();

		t1.join();
		t2.join();

		System.out.println("Bye");
	}
}

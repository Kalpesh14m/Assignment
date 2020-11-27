package com.stmt4;

public class ThreadingDemo5 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("Hello");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println("Hi");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}

			}
		});

		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		t2.start();

		System.out.println("Bye");
	}
}

package com.stmt4;

class Hi4 implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hello4 implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadingDemo4 {
	public static void main(String[] args) {
		Runnable o1 = new Hi4();
		Runnable o2 = new Hello4();

		Thread t1 = new Thread(o1);
		Thread t2 = new Thread(o2);

		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		t2.start();

	}
}

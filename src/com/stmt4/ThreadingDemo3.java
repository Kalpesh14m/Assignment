package com.stmt4;

class Hi3 extends Thread {
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

class Hello3 extends Thread {
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

public class ThreadingDemo3 {
	public static void main(String[] args) {
		Hi3 o1 = new Hi3();
		Hello3 o2 = new Hello3();

		o1.start();
		try {Thread.sleep(1000);} catch (InterruptedException e) {}
		o2.start();

	}
}

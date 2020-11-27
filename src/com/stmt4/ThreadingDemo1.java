package com.stmt4;

class Hi1 extends Thread {
	public void show() {
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

class Hello1 extends Thread {
	public void show() {
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

public class ThreadingDemo1 {
	public static void main(String[] args) {
		Hi1 o1 = new Hi1();
		Hello1 o2 = new Hello1();

		o1.show();
		o2.show();
	}
}

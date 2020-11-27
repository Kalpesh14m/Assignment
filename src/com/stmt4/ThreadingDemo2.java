package com.stmt4;

class Hi2 extends Thread {
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

class Hello2 extends Thread {
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

public class ThreadingDemo2 {
	public static void main(String[] args)  {
		Hi2 o1 = new Hi2();
		Hello2 o2 = new Hello2();

		o1.start();
		o2.start();

		o1.show();
		o2.show();
	}
}

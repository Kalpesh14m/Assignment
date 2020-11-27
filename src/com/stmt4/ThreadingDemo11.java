package com.stmt4;

public class ThreadingDemo11 {
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread();

		System.out.println("Before: Thread Name: " + t1.getName());
		System.out.println("Before: Thread Alive: " + t1.isAlive());
		System.out.println("Before: Thread Priority: " + t1.getPriority());

		t1.setName("MyThread");
		t1.start();
		t1.setPriority(1);// 1 is low (1-10)

		System.out.println("After: Thread Name: " + t1.getName());
		System.out.println("After: Thread Alive: " + t1.isAlive());
		System.out.println("After: Thread Priority: " + t1.getPriority());

		t1.setPriority(Thread.MAX_PRIORITY);// 1 is low (1-10)
		System.out.println("After: Thread MIN_Priority: " + t1.getPriority());

	}
}

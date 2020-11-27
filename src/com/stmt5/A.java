package com.stmt5;

class Parent {
	public void walk() {
		System.out.println("Parent - Walking");
	}

	public void run() {
		System.out.println("Parent - Running");
		walk();
	}
}

class Child extends Parent {
	@Override
	public void walk() {
		System.out.println("Child - walk calling super walk()");
		super.walk();
	}

	@Override
	public void run() {
		System.out.println("Child - run calling super run()");
		super.run();
	}

}

public class A {
	public static void main(String[] args) {
		Parent p = new Child();
		p.run();
	}

}
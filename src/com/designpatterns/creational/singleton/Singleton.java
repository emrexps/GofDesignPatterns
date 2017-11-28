package com.designpatterns.creational.singleton;

public class Singleton {
	
	private static Singleton instance=new Singleton();

	private Singleton () {}
	
	public static Singleton getInstance() {
		return instance;
	}
	
	public void doSomething() {
		System.out.println("Singleton object method");
	}
}

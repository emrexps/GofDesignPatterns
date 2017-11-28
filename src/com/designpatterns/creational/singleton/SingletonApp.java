package com.designpatterns.creational.singleton;


/*
Requirements need one,and only one instance of an object.
Singleton pattern is used for logging,drivers objects,caching and thread pool etc.
*/

public class SingletonApp {

	public static void main(String[] args) {
		
        Singleton object=Singleton.getInstance();
        object.doSomething();
	}

}


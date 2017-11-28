package com.designpatterns.structural.facade;

public class DocManager implements File {

	@Override
	public void write() {
		 System.out.println("Write doc...");

	}

	@Override
	public void read() {
		 System.out.println("Read doc...");

	}

}

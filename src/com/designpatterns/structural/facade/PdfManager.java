package com.designpatterns.structural.facade;

public class PdfManager implements File {

	@Override
	public void write() {
	   System.out.println("Write pdf...");

	}

	@Override
	public void read() {
		 System.out.println("Read pdf...");

	}

}

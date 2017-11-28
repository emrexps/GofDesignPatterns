package com.designpatterns.structural.adapter;

public class TextWriter implements Writer{
	
	@Override
	public void write(String text) {
		System.out.println("New Writer::"+text);
	}
}

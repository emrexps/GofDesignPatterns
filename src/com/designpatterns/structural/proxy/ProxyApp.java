package com.designpatterns.structural.proxy;

public class ProxyApp {

	public static void main(String[] args) {
		
		Text text1=new ProxyText("header1", "content1");
		text1.save();

		System.out.println("----");
		text1.save();
		
	}

}

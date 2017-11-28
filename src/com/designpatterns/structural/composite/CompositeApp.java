package com.designpatterns.structural.composite;

public class CompositeApp {

	public static void main(String[] args) {
	
		Folder home=new Folder("home");
		home.add(new File("sys.c"));
		home.add(new File("app.java"));
		
		Folder pictures=new Folder("pictures");
		pictures.add(new File("holiday.jpg"));
		pictures.add(new File("me.png"));

		home.add(pictures);
		
		
		
		

	}

}

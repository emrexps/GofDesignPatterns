package com.designpatterns.structural.proxy;

public class RealText implements Text{

	private String title;
	private String content;
	
	@Override
	public void setTitle(String title) {
		this.title=title;
		
	}

	@Override
	public void setContent(String content) {
	   this.content=content;
		
	}

	@Override
	public void save() {
	  System.out.println("Real content saved...");
		
	}

}

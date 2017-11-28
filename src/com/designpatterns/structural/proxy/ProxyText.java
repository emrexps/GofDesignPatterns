package com.designpatterns.structural.proxy;

public class ProxyText implements Text{

	private String title;
	private String content;
	private RealText realText;
	
	public ProxyText(String title,String content) {
		this.title=title;
		this.content=content;
		this.realText=new RealText();
		this.realText.setTitle(this.title);
		this.realText.setContent(this.content);
		this.realText.save();
	}
	
	@Override
	public void setTitle(String title) {
		this.title=title;
		this.realText.setTitle(this.title);
		
	}

	@Override
	public void setContent(String content) {
		this.content=content;
		this.realText.setContent(this.content);
		
	}

	@Override
	public void save() {
		System.out.println("Proxy content saved..");
		
	}

}

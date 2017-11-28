package com.designpatterns.structural.composite;

public class File implements Directory {

  private String name;
	  
	  public File(String name) {
		 this.name=name;
	  }
	  
	  public String getName() {
			return name;
		}
	  
	@Override
	public void ls() {
		System.out.println(this.getName());
	}

}

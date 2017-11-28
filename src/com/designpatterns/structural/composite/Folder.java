package com.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

class Folder implements Directory{

	private List <Directory> files=new ArrayList<Directory>();
    String name;
    
    
    public Folder(String name) {
    	this.name=name;
    }
	
    public String getName() {
    	return this.name;
    }
	
	@Override
	public void ls() {
	  
	 System.out.println(this.getName());
		
	  for(Directory dir:files )
	  {
		  dir.ls();
	  }
	}
	
	public void add(Directory file) {
		this.files.add(file);
	}
	
	public void remove(Directory dir) {
		files.remove(dir);
	}
	
}
package com.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Students implements Cloneable{
	
	private List<String> students;
	

	public Students() {
		students=new ArrayList<String>();
	}

	public Students(List<String> list) {
		this.students=list;
	}
	
	public void loadData() {
		students.add("Emre");
		students.add("Cemre");
	}
	
	public List<String> getStudents() {
		return getStudents();
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		List<String> temp=new ArrayList<String>();
		
		for(String student : this.getStudents()) {
			temp.add(student);
		}
		
		return new Students(temp);
	}
}

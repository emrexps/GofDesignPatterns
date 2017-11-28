package com.designpatterns.creational.prototype;

import java.util.List;

/*Prototype pattern is used when object creation is costly affair and you have already similar objects 
 
 */


public class PrototypeApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		Students students=new Students();
		students.loadData();
		
		Students newbies=(Students) students.clone();
		List<String> list=newbies.getStudents();
		list.add("Okan");
		
		System.out.println(newbies.getStudents());
		
		
		
	}

}

package com.designpatterns.creational.factory;

/*
This pattern is used when we hava a super class with multiple sub-classes and based on input,we need to return one of the sub-class

java.util.Calendar,ResourceBundle and NumberFormat getInstance() methods uses factory pattern.
valueOf method in wrapper classes like Boolean,Integer etc.
 
 
 */


public class FactoryApp {

	public static void main(String[] args) {
		
		CarFactory carFactory=new CarFactory();
		
		Car car1=carFactory.produceCar("Sedan");
		car1.getModel();
		
		Car car2=carFactory.produceCar("Hatchback");
		car2.getModel();
		

	}

}

package com.designpatterns.creational.factory;

public class CarFactory {
	
	
	public Car produceCar(String name)
	{
		if(name.equalsIgnoreCase("Sedan"))
			return new Sedan();
		if(name.equalsIgnoreCase("Hatchback"));
			return new Hatchback();
		
	}
	

}

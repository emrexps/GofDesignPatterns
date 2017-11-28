package com.designpatterns.structural.decorator;

public class SportCar extends CarDecorator {

	public SportCar(Car c){
		super(c);
	}
    
	@Override
	public void assemble(){
		car.assemble();
		System.out.println("Adding features of Sport Car.");
	}
	
}
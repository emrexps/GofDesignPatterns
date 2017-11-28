package com.designpatterns.structural.decorator;

public class DecoratorApp {

	public static void main(String[] args) {
		Car sportCar=new SportCar(new BasicCar());
		sportCar.assemble();
		System.out.println("********************");
		
		Car luxruyCar=new LuxuryCar(new BasicCar());
		luxruyCar.assemble();

	}

}

package com.designpatterns.creational.builder;


/*
 Samples 
 Java.lang.StringBuilder append()
 Java.lang.StringBuffer append()
 */
public class BuilderApp {

	public static void main(String[] args) {
	
		Coffee coffee=new Coffee.CoffeeMaker(CoffeeMenu.ESPRESSO,CoffeeSize.GRANDE).build(); 
		System.out.println("Coffe Name:"+coffee.getCoffee());
		System.out.println("Coffe Size:"+coffee.getDrinkSize());
		
			
	

	}

}

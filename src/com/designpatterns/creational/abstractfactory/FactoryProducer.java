package com.designpatterns.creational.abstractfactory;

public class FactoryProducer {
	 public static AbstractFactory getFactory(String choice){
		   
	      if(choice.equalsIgnoreCase("TRUCK")){
	         return new TruckFactory();
	         
	      }else if(choice.equalsIgnoreCase("CAR")){
	         return new CarFactory();
	      }
	      
	      return null;
	   }
}

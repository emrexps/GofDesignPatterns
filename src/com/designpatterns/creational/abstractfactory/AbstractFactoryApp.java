package com.designpatterns.creational.abstractfactory;

/*
 Similar to Factory Pattern except the fact that is more like factory of factories
 
 Abstract factory pattern used in some of 
 Javax.xml.parser
 Javax.xml.transform
 javax.xml.xpath
 
 methods
 
 */

public class AbstractFactoryApp {

	public static void main(String[] args) {
		
		AbstractFactory carFactory=FactoryProducer.getFactory("CAR");
		Car model1=carFactory.produceCar("Sedan");
		model1.getModel();
		
		AbstractFactory truckFactory=FactoryProducer.getFactory("TRUCK");
		Truck model2=truckFactory.produceTruck("HeavyTruck");
		model2.getEnginePower();

	}

}

package com.designpatterns.creational.abstractfactory;

public class TruckFactory extends AbstractFactory{

	@Override
	Car produceCar(String model) {
	 return null;
	}

	@Override
	Truck produceTruck(String model) {
		if (model.equalsIgnoreCase("LightTruck"))
			return new LightTruck();
		if (model.equalsIgnoreCase("HeavyTruck"))
			return new HeavyTruck();
		return null;
	
	}

}

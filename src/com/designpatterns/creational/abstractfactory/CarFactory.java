package com.designpatterns.creational.abstractfactory;

public class CarFactory extends AbstractFactory {

	@Override
	public Car produceCar(String model) {
		if (model.equalsIgnoreCase("Sedan"))
			return new Sedan();
		if (model.equalsIgnoreCase("Hatchback"))
			return new Hatchback();
		return null;

	}

	@Override
	Truck produceTruck(String model) {
		return null;
	}

}

package com.designpatterns.creational.abstractfactory;

public abstract class AbstractFactory {
	abstract Car produceCar(String model);
	abstract Truck produceTruck(String model);

}

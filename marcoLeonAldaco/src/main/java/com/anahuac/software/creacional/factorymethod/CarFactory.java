package com.anahuac.software.creacional.factorymethod;

public abstract class CarFactory {
	
	public abstract Car createCar(String model);
	
	public void assembleCar(String model) {
		Car car = createCar(model);
		car.assemble();
	}
}
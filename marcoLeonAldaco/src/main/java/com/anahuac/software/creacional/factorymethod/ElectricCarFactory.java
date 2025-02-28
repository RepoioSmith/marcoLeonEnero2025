package com.anahuac.software.creacional.factorymethod;

public class ElectricCarFactory extends CarFactory {

	@Override
	public Car createCar(String model) {
		// TODO Auto-generated method stub
		return new ElectricCar(model);
	}

}
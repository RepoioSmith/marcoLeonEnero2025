package com.anahuac.software.creacional.factorymethod;

public class SedanCarFactory extends CarFactory {

	@Override
	public Car createCar(String model) {
		// TODO Auto-generated method stub
		return new SedanCar(model);
	}

}
package com.anahuac.software.creacional.factorymethod;

public class PickupCarFactory extends CarFactory {

	@Override
	public Car createCar(String model) {
		// TODO Auto-generated method stub
		return new PickupCar(model);
	}

}
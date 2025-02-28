package com.anahuac.software.creacional.factorymethod;

public class PickupCar extends Car {

	public PickupCar(String model) {
		super(model);
	}
	
	@Override
	public void addBody() {
		// TODO Auto-generated method stub
		System.out.println("Agregando la carroceria del Pickup " + model);
	}

	@Override
	public void addDoors() {
		// TODO Auto-generated method stub
		System.out.println("Agregando las puertas del Pickup " + model);
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println("Agregando el pintura del Pickup " + model);
	}

}
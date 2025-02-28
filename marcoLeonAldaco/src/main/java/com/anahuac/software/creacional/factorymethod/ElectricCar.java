package com.anahuac.software.creacional.factorymethod;

public class ElectricCar extends Car {
	
	public ElectricCar(String model) {
		super(model);
	}

	@Override
	public void addBody() {
		// TODO Auto-generated method stub
		System.out.println("Agregando la carroceria del Vehículo electrico " + model);
	}

	@Override
	public void addDoors() {
		// TODO Auto-generated method stub
		System.out.println("Agregando las puertas del Vehículo electrico " + model);
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println("Agregando el pintura del Vehículo electrico " + model);
	}

}
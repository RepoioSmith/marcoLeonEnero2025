package com.anahuac.software.creacional.factorymethod;

public class SedanCar extends Car {

	public SedanCar(String model) {
		super(model);
	}
	
	@Override
	public void addBody() {
		// TODO Auto-generated method stub
		System.out.println("Agregando la carroceria del Sedán " + model);
	}

	@Override
	public void addDoors() {
		// TODO Auto-generated method stub
		System.out.println("Agregando las puertas del Sedán " + model);
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println("Agregando el pintura del Sedán " + model);
	}

}
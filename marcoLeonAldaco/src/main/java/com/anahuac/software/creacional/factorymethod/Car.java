package com.anahuac.software.creacional.factorymethod;

public abstract class Car {
	protected String model;
	
	public Car(String model) {
		this.model = model;
	}
	
	public abstract void addBody();
	public abstract void addDoors();
	public abstract void paint();
	
	public void assemble() {
		System.out.println("Ensamblando vehículo tipo " + model + ": ");
		addBody();
		addDoors();
		paint();
		System.out.println("Se ha completado el ensamblaje\n");
		
	}
}
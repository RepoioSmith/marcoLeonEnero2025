package com.anahuac.software.creacional.factorymethod;

public class Driver {
    public static void main(String[] args) {
        CarFactory sedanFactory = new SedanCarFactory();
        sedanFactory.assembleCar("Basic Sedan");
        sedanFactory.assembleCar("Medium Sedan");
        sedanFactory.assembleCar("High Sedan");

        CarFactory electricFactory = new ElectricCarFactory();
        electricFactory.assembleCar("Basic Electric");
        electricFactory.assembleCar("Medium Electric");
        electricFactory.assembleCar("High Electric");

        CarFactory pickupFactory = new PickupCarFactory();
        pickupFactory.assembleCar("Basic Pickup");
        pickupFactory.assembleCar("Medium Pickup");
        pickupFactory.assembleCar("High Pickup");
    }
}
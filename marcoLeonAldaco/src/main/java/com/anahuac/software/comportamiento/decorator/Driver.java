package com.anahuac.software.comportamiento.decorator;

public class Driver {
    public static void main(String[] args) {
        Servicio telefono= new Telefono();
        System.out.println(telefono.getDescripcion() + telefono.costo());

        telefono = new Internet(telefono);
        System.out.println(telefono.getDescripcion() + telefono.costo());

        telefono = new Netflix(telefono);
        System.out.println(telefono.getDescripcion() + telefono.costo());

        telefono = new Disney(telefono);
        System.out.println(telefono.getDescripcion() + telefono.costo());

        telefono = new HBO(telefono);
        System.out.println(telefono.getDescripcion() + telefono.costo());

        telefono = new Prime(telefono);
        System.out.println(telefono.getDescripcion() + telefono.costo());
    }
}

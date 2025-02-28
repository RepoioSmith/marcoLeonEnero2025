package com.anahuac.software.comportamiento.decorator;

public class Prime extends Decorator {

    public Prime(Servicio servicio) {
        super(servicio); 
    }

    public String getDescripcion() {
        return servicio.getDescripcion() + "+ Prime ";
    }

    public double costo() {
        return servicio.costo() + 50;
    }

}

package com.anahuac.software.comportamiento.decorator;

public class Internet extends Decorator {

    public Internet(Servicio servicio) {
        super(servicio); 
    }

    public String getDescripcion() {
        return servicio.getDescripcion() + "+ Internet ";
    }

    public double costo() {
        return servicio.costo() + 150;
    }
}

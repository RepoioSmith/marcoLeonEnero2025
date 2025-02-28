package com.anahuac.software.comportamiento.decorator;

public class HBO extends Decorator {
    public HBO(Servicio servicio) {
        super(servicio); 
    }

    public String getDescripcion() {
        return servicio.getDescripcion() + "+ Netflix ";
    }

    public double costo() {
        return servicio.costo() + 100;
    }
}

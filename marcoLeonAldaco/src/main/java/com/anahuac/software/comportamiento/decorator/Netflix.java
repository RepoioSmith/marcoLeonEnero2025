package com.anahuac.software.comportamiento.decorator;

public class Netflix extends Decorator {
    
    public Netflix(Servicio servicio) {
        super(servicio); 
    }

    public String getDescripcion() {
        return servicio.getDescripcion() + "+ Netflix ";
    }

    public double costo() {
        return servicio.costo() + 50;
    }
}

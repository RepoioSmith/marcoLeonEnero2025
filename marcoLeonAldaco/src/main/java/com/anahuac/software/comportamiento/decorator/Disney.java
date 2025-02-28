package com.anahuac.software.comportamiento.decorator;

public class Disney extends Decorator {
    
    public Disney(Servicio servicio) {
        super(servicio); 
    }

    public String getDescripcion() {
        return servicio.getDescripcion() + "+ Disney ";
    }

    public double costo() {
        return servicio.costo() + 100;
    }

}

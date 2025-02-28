package com.anahuac.software.comportamiento.decorator;

public class Decorator implements Servicio{
    protected Servicio servicio;
    
    public Decorator(Servicio servicio){
        this.servicio = servicio;
    }

    public String getDescripcion(){
        return servicio.getDescripcion();
    }
    public double costo(){
        return servicio.costo();
    }
}
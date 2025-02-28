package com.anahuac.software.comportamiento.decorator;

public class Telefono implements Servicio {

    public String getDescripcion(){
        return "Telefono ";
    }

    public double costo() {
        return 200;
    }
}

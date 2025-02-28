package com.anahuac.software.parcial1.problema2.decorator;

public class PrecioBase {
    private double precio;
    
    public PrecioBase(double precio) {
        this.precio = precio;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public String getDescripcion() {
        return "Precio base";
    }
}
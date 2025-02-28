package com.anahuac.software.parcial1.problema2.decorator;

public class Descuento extends PrecioBase {
    private PrecioBase base;
    private double descuento;
    
    public Descuento(PrecioBase base, double descuento) {
        super(base.getPrecio());
        this.base = base;
        this.descuento = descuento;
    }
    
    @Override
    public double getPrecio() {
        return base.getPrecio() - descuento;
    }
    
    @Override
    public String getDescripcion() {
        return base.getDescripcion() + " con descuento " + descuento + "%,";
    }
}

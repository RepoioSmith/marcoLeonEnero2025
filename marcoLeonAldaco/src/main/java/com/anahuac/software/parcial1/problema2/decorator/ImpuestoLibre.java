package com.anahuac.software.parcial1.problema2.decorator;

public class ImpuestoLibre extends Decorator {
    public ImpuestoLibre(PrecioBase base) {
        super(base);
    }
    
    @Override
    public double getPrecio() {
        return base.getPrecio();
    }
    
    @Override
    public double getImpuesto() {
        return 0;
    }
    
    @Override
    public String getDescripcion() {
        return base.getDescripcion() + " sin impuestos";
    }
}
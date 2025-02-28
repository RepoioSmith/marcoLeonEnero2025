package com.anahuac.software.parcial1.problema2.decorator;

public class ImpuestoMerida extends Decorator {
    public ImpuestoMerida(PrecioBase base) {
        super(base);
    }
    
    @Override
    public double getPrecio() {
        return base.getPrecio() * 1.16;
    }
    
    @Override
    public double getImpuesto() {
        return base.getPrecio() * 0.16;
    }
    
    @Override
    public String getDescripcion() {
        return base.getDescripcion() + " con impuesto Mérida";
    }
}
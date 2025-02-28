package com.anahuac.software.parcial1.problema2.decorator;

public class ImpuestoChetumal extends Decorator {
    public ImpuestoChetumal(PrecioBase base) {
        super(base);
    }
    
    @Override
    public double getPrecio() {
        return base.getPrecio() * 1.08 + base.getPrecio() * 0.02;
    }
    
    @Override
    public double getImpuesto() {
        return base.getPrecio() * 0.08 + base.getPrecio() * 0.02;
    }
    
    @Override
    public String getDescripcion() {
        return base.getDescripcion() + " con impuesto Chetumal";
    }
}

package com.anahuac.software.parcial1.problema2.decorator;

public abstract class Decorator extends PrecioBase {
    protected PrecioBase base;
    
    public Decorator(PrecioBase base) {
        super(base.getPrecio());
        this.base = base;
    }
    
    public abstract double getImpuesto();
}

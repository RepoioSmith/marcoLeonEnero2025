package com.anahuac.software.parcial1.problema2.decorator;

public class Driver {
    public static void main(String[] args) {
        PrecioBase precio1 = new PrecioBase(100);
        PrecioBase precio2 = new PrecioBase(100);
        PrecioBase precio3 = new PrecioBase(100);

        Descuento descuento1 = new Descuento(precio1, 0);
        Descuento descuento2 = new Descuento(precio2, 10);

        Decorator impuestoChetumal = new ImpuestoChetumal(descuento1);
        Decorator impuestoMerida = new ImpuestoMerida(descuento1);
        Decorator impuestoLibre = new ImpuestoLibre(descuento1);

        Decorator impuestoChetumal2 = new ImpuestoChetumal(descuento2);
        Decorator impuestoMerida2 = new ImpuestoMerida(descuento2);
        Decorator impuestoLibre2 = new ImpuestoLibre(descuento2);

        System.out.println(impuestoChetumal.getDescripcion() + ": $" + impuestoChetumal.getPrecio());
        System.out.println(impuestoMerida.getDescripcion() + ": $" + impuestoMerida.getPrecio());
        System.out.println(impuestoLibre.getDescripcion() + ": $" + impuestoLibre.getPrecio() + "\n");

        System.out.println(impuestoChetumal2.getDescripcion() + ": $" + impuestoChetumal2.getPrecio());
        System.out.println(impuestoMerida2.getDescripcion() + ": $" + impuestoMerida2.getPrecio());
        System.out.println(impuestoLibre2.getDescripcion() + ": $" + impuestoLibre2.getPrecio() + "\n");
    }
}

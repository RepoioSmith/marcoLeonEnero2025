package com.anahuac.software.estructural.adapter;

public class Empleado implements IntEmpleado {
    private String nombre;
    private String edad;

    public Empleado(String nombre, String edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String getEdad() {
        return edad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}

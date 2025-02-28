package com.anahuac.software.estructural.adapter;

public class EmLegacy {
    private String nombre;
    private String apellido;
    private String fechaNacimiento; 

    public EmLegacy(String nombre, String apellido, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
}

package com.anahuac.software.estructural.adapter;

public class AdapterLegacy implements IntEmpleado {
    private EmLegacy empleadoLegacy;

    public AdapterLegacy(EmLegacy empleadoLegacy) {
        this.empleadoLegacy = empleadoLegacy;
    }

    @Override
    public String getEdad() {
        return "Edad simulada";
    }

    @Override
    public String getNombre() {
        return empleadoLegacy.getNombre() + " " + empleadoLegacy.getApellido();
    }
}

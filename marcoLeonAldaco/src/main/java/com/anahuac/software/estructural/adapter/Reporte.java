package com.anahuac.software.estructural.adapter;

import java.util.List;

public class Reporte {
    public static void printIntEmpleado(List<IntEmpleado> empleados) {
        for (IntEmpleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre() + ", Edad: " + empleado.getEdad());
        }
    }
}

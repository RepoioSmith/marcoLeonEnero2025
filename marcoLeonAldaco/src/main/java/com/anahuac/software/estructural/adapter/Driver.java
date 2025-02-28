package com.anahuac.software.estructural.adapter;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        // Crear empleados nuevos
        Empleado empleado1 = new Empleado("Juan Pérez", "30");
        Empleado empleado2 = new Empleado("Ana Gómez", "25");

       
        EmLegacy empleadoLegacy = new EmLegacy("Carlos", "Ramírez", "1985-07-20");
        AdapterLegacy adaptado = new AdapterLegacy(empleadoLegacy);

        List<IntEmpleado> empleados = new ArrayList<>();
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(adaptado); 

        Reporte.printIntEmpleado(empleados);
    }
}

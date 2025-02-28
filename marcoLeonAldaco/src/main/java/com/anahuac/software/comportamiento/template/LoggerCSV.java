package com.anahuac.software.comportamiento.template;

public class LoggerCSV  extends Logger{

    @Override
    public void log(String fecha, String hora, String tipo, String mensaje) {
        System.out.println("CSV: " + fecha + ", " + hora + ", " + tipo + ", " + mensaje);
    }
    
}

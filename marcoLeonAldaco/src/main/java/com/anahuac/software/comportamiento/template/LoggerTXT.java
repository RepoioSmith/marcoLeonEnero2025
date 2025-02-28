package com.anahuac.software.comportamiento.template;

public class LoggerTXT extends Logger {
    @Override
    public void log(String fecha, String hora, String tipo, String mensaje) {
        System.out.println(fecha + "    " + hora + "    " + tipo + " : \"" + mensaje + "\""+"\n");
    }
}

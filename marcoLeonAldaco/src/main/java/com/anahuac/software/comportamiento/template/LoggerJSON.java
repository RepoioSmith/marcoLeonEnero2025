package com.anahuac.software.comportamiento.template;

public class LoggerJSON extends Logger {
    @Override
    public void log(String fecha, String hora, String tipo, String mensaje) {
        System.out.println("[\n  {\n    \"fecha\": \"" + fecha + "\",\n    \"hora\": \"" + hora + "\",\n    \"tipo\": \"" + tipo + "\",\n    \"mensaje\": \"" + mensaje + "\"\n  }\n]"+"\n");
    }
}

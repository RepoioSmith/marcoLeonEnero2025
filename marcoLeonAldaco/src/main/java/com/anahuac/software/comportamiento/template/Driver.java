    package com.anahuac.software.comportamiento.template;

    public class Driver {

        public static void main(String[] args) {
            LoggerCSV loggerCSV = new LoggerCSV();
            LoggerJSON loggerJSON = new LoggerJSON();
            LoggerTXT loggerTXT = new LoggerTXT();

            String fecha = "2021-09-01";
            String hora = "12:00:00";
            String tipo = "INFO";
            String mensaje = "mi mensaje";

            loggerCSV.log(fecha, hora, tipo, mensaje);
            System.out.println();
            loggerJSON.log(fecha, hora, tipo, mensaje); 
            System.out.println();
            loggerTXT.log(fecha, hora, tipo, mensaje);
            System.out.println();

        }
    }


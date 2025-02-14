package com.anahuac.software.creacional.singleton;
import java.util.HashMap;
import java.util.Map;

public class Driver {

    public static void main(String[] args) {
        HashMap<String, String> alumnos = new HashMap<>();
        alumnos.put("Marco", "presente");
        alumnos.put("Ocariz", "ausente");
        alumnos.put("Julio", "justificado");   
        alumnos.put("Luis", "ausente");
        alumnos.put("Pipo", "presente");
        Logger logger = Logger.getInstance();

        for( Map.Entry<String, String> alumno : alumnos.entrySet() ){
            if (alumno.getValue()=="presente"){
                System.out.println(logger.message("Info ", alumno.getKey() + " esta presente"));
            }
            else if (alumno.getValue()=="ausente"){
                System.out.println(logger.message("Error ", alumno.getKey() + " esta ausente"));
            }
            else if (alumno.getValue()=="justificado"){
                System.out.println(logger.message("Warning ", alumno.getKey() + " esta justificado"));
            }
        }
    }
}



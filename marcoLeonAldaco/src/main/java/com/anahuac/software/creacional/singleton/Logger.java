package com.anahuac.software.creacional.singleton;

public class Logger {
    private final static Logger instance = new Logger();

    private Logger(){
    }
    public static Logger getInstance(){  
        return instance;  
    }
    public String message(String info, String message){
        return (info +  message );
    }
}

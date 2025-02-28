package com.anahuac.software.comportamiento.observer;

public class Driver {
    public static void main(String[] args) {
    //:)
        Article articulo = new Article(500);
        System.out.println("Artículo creado con precio inicial: $" + articulo.getPrice());

        
        ObserverEmail emailObserver = new ObserverEmail(articulo, 100);
        System.out.println("Observador de correo electrónico creado. Precio objetivo: $100");

        
        System.out.println("\nCambiando el precio del artículo a $150...");
        articulo.setPrice(150);

        
        System.out.println("\nCambiando el precio del artículo a $90...");
        articulo.setPrice(90);

      
        System.out.println("\nDesactivando la alerta de correo electrónico...");
        emailObserver.setOn(false);
        System.out.println("Cambiando el precio del artículo a $80...");
        articulo.setPrice(80);

    
        System.out.println("\nActivando la alerta de correo electrónico...");
        emailObserver.setOn(true);
        System.out.println("Cambiando el precio del artículo a $70...");
        articulo.setPrice(70);

   
        ObserverWhatsapp whatsappObserver = new ObserverWhatsapp(articulo, 50);
        System.out.println("\nObservador de WhatsApp creado. Precio objetivo: $50");

       
        System.out.println("\nCambiando el precio del artículo a $40...");
        articulo.setPrice(40);
    }
}
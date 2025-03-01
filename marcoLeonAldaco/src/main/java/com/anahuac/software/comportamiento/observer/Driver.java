package com.anahuac.software.comportamiento.observer;

public class Driver {
    public static void main(String[] args) {
        Article articulo = new Article(500);
        System.out.println("Artículo creado con precio inicial: $" + articulo.getPrice());

        ObserverEmail emailObserver = new ObserverEmail(articulo, 100);
        ObserverWhatsapp whatsappObserver = new ObserverWhatsapp(articulo, 50);
        ObserverBrowser browserObserver = new ObserverBrowser(articulo, 75);

        System.out.println("\nCambiando el precio del artículo a $74...");
        articulo.setPrice(74);

        System.out.println("\nDesactivando las alertas...");
        browserObserver.setOn(false);
        emailObserver.setOn(false);
        whatsappObserver.setOn(false);

        System.out.println("Cambiando el precio del artículo a $70...");
        articulo.setPrice(70);
    }
}
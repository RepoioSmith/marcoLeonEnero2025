package com.anahuac.software.comportamiento.observer;

public class ObserverBrowser implements Observer {
    private boolean isOn;
    private Article article;
    private double targetPrice;

    public ObserverBrowser(Article a, double targetPrice) {
        this.article = a;
        this.targetPrice = targetPrice;
        this.article.addObserver(this);
        this.isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    @Override
    public void update(double price) {
        if (isOn && price <= targetPrice) {
            System.out.println("Notificacion de navegador: el precio del articulo ha bajado a $" + price);
        }
    }
}

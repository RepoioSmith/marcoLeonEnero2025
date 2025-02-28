
package com.anahuac.software.comportamiento.observer;

import java.util.ArrayList;

public class Article implements Subject {
    private ArrayList<Observer> observers;
    private double price;

    public Article(double price) {
        this.price = price;
        observers = new ArrayList<>();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}

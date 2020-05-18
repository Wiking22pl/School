package com.company.devices;

import com.company.creatures.Human;

public abstract class Car extends Device {
    public final String color;
    public final Double price;

    public Car(String producer, String model, Double price, Integer yearOfProduction, String color) {
        super(producer, model, yearOfProduction);
        this.price = price;
        this.color = color;
    }

    @Override
    public void turnOn() {
        System.out.println("Wrum wrum");
    }

    public String toString() {
        return super.toString() + " " + color + " " + price;
    }

    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if (seller.getCar() == this) {
            try {
                super.sell(buyer, seller, price);

                buyer.setCar(this);
                seller.setCar(null);
            } catch (Exception e) {
                System.out.println("Transakcja nie powiodła sie");
            }

        } else {
            System.out.println("Sprzedawca nie jest posiadaczem tego telefonu");
        }

    }

    public abstract void refuel();
}

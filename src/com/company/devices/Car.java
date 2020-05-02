package com.company.devices;

import com.company.creatures.Human;

public class Car extends Device {
    public final String color;
    public final Double price;  //

    public Car(String producer, String model, Double price, Integer yearOfProduction, String color) {
        super(producer, model, yearOfProduction);
        this.price = price;
        this.color = color;
    }


    public String toString() {
        return producer + " " + model + " " + yearOfProduction;
    }

    @Override
    void turnOn() {
        System.out.println("Wrum wrum");
    }

}

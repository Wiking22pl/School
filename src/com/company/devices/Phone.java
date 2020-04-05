package com.company.devices;

public class Phone extends Device {
    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    void turnOn() {
        System.out.println("Pstryk");
    }

    @Override
    public void sell() {
        System.out.println("Sprzedano telefon");
    }
}


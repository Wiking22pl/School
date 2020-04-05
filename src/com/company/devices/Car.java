package com.company.devices;

public class Car extends Device {
    public final String kolor;
    public final Double cena;

    public Car(String producent, String model, Double cena, Integer yearOfProduction, String kolor) {
        super(producent, model, yearOfProduction);
        this.cena=cena;
        this.kolor = kolor;
    }


    public String toString(){
        return producent+ " "+model+" "+yearOfProduction;
    }

    @Override
    void turnOn() {
        System.out.println("Wrum wrum");
    }

    @Override
    public void sell() {
        System.out.println("Sprzedano samochód za "+cena);
    }
}

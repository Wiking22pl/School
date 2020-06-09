package com.company.devices;

import com.company.creatures.Human;

public abstract class Car extends Device implements Comparable<Car> {
    public final String color;

    public Car(String producer, String model, Double value, Integer yearOfProduction, String color) {
        super(producer, model, yearOfProduction);
        this.value = value;
        this.color = color;
    }

    @Override
    public void turnOn() {
        System.out.println("Wrum wrum");
    }

    public String toString() {
        return super.toString() + " " + color + " " + value;
    }

    public void sell(Human buyer, Human seller, Double price) throws Exception {
        try {
            boolean seller_owns_this_car = false;
            boolean buyer_has_a_parking_place = false;
            int i, j;

            for (i = 0; i < seller.garage.length; i++) {
                if (seller.garage[i] == this) {
                    seller_owns_this_car = true;
                    break;
                }
            }
            for (j = 0; j < buyer.garage.length; j++) {
                if (buyer.garage[i] == null) {
                    buyer_has_a_parking_place = true;
                    break;
                }
            }

            if (seller_owns_this_car) {
                if (buyer_has_a_parking_place) {
                    super.sell(buyer, seller, price);       //Metoda Device.sell zajmuje się wymianą gotówki

                    buyer.setCar(this, j);
                    seller.setCar(null, i);
                }else {
                    System.out.println("Kupujący nie ma miejsca w garażu");
                    throw new Exception();
                }

            } else {
                System.out.println("Sprzedawca nie jest posiadaczem tego samochodu albo ");
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Transakcja nie powiodła sie");
        }

    }

    public abstract void refuel();

    @Override
    public int compareTo(Car c) {
        int result = this.yearOfProduction.compareTo(c.yearOfProduction);
        return result;
    }
}

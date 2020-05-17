package com.company.devices;

import com.company.creatures.Human;

public class Phone extends Device {
    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }


    @Override
    public void turnOn() {
        System.out.println("Pstryk");
    }

    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if (seller.phone == this) {
            try {
                super.sell(buyer, seller, price);

                buyer.phone = this;
                seller.phone = null;
            } catch (Exception e) {
                System.out.println("Transakcja nie powiodła sie");
            }

        } else {
            System.out.println("Sprzedawca nie jest posiadaczem tego telefonu");
        }

    }


}


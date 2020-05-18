package com.company.devices;

import com.company.creatures.Human;

import java.net.URL;
import java.util.List;

public class Phone extends Device {

    static final String DEFAULT_SERVER = "www.google.pl/hacktheplanet";
    static final String DEFAULT_PROTOCOL = "HTTPS";
    static final String DEFAULT_VERSION = "1.0";

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

    public void installaAnApp(String name) {
    }

    public void installaAnApp(String name, String version) {
    }

    public void installaAnApp(String name, String version, String server_name) {
    }

    public void installaAnApp(List<String> names) {
    }

    public void installaAnApp(URL url) {
    }


}


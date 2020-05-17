package com.company.creatures;

import com.company.Saleable;

import java.io.File;

public class Animal implements Edible, Saleable {

    final String species;
    protected Double weight;
    public String name;
    File pic;

    public static final Double DEFAULT_DOG_WEIGHT = 10.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 0.1;
    public static final Double DEFAULT_LION_WEIGHT = 20.0;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;
            case "lion":
                this.weight = DEFAULT_LION_WEIGHT;
                break;
        }
    }

    public void feed() {
        if (weight > 0) {
            weight++;
            System.out.println("thx for food bro, my weight is now " + weight);
        } else {
            System.out.println("You can't feed me BECAUSE I'M FUCKING DEAD!!!!");
        }
    }

    public void walk() {

        if (--weight <= 0) {
            System.out.println("I'm fucking dead bro");
        } else if (weight <= 2) {
            System.out.println("FEED MEEEEEEEEEEEE!!!!!!!!!!!!111111111111111 ");
        } else {
            System.out.println("Thx for cardio bro my weight is now " + weight);
        }
    }

    @Override
    public void beEaten() throws Exception {
        if (this instanceof Human) {
            throw new Exception("Porąbało cie kanibalu?");
        } else {
            System.out.println("mniam mniam");
            this.weight = 0.0;
        }
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if (this instanceof Human) {
            throw new Exception("Alarm przeciwniewolniczny!!!!!!!1!!!!!!1111!!!!!!11!!!1!!!11!!!!111!!!");
        } else if(seller.pet == this){

            if (price < buyer.cash) {

                buyer.cash -= price;
                seller.cash += price;

                buyer.pet = this;
                seller.pet = null;

                System.out.println( buyer.firstName + " kupił(a) " + this + " od "+ seller.firstName + " za "+ price + " zł ");
            } else {
                System.out.println("Nie masz wystarczająco dużo kasy");
            }
        }
        else{
            System.out.println("Sprzedawca nie jest posiadaczem tego zwierzęcia");
        }

    }

    public String toString() {
        return name + " " + species + " " + weight;
    }
}

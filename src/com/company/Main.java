package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.creatures.Human;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human(3);
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = new Pet("mouse");
        me.pet.name = "Myszojeleń";

        Pet dog = new Pet("dog");
        dog.name = "Akita";

        me.pet = dog;


        me.setSalary(4000.);
        System.out.println();


        Human zona = new Human();
        zona.cash = 5000.;
        zona.firstName = "Zofia";

        zona.setSalary(500d);

        Car fiat = new LPG("Fiat", "Punto",15000., 2010,"Zielony");
        Car fiat2 = new Electric("Fiat", "Terra",27000., 2020,"niebieski");

//        if (fiat == fiat2){
//            System.out.println("Są równe");
//        }else{
//            System.out.println("nie sa równe\n");
//        }

        Phone komura = new Phone("Nokia", "N95",2007);

        FarmAnimal cow = new FarmAnimal("cow");
        cow.feed(10);
        cow.beEaten();
        cow.feed();

//        dog.feed();
//        dog.feed(0.5);
        System.out.println();

        Car fura = new Disel("Mercedes","M4",11000.,1999,"Czarny");
        me.garage[0] = (fura);
        me.garage[1]= fiat;
        me.garage[2]= fiat2;
        System.out.println("I'm driving : " + me.getCar(0) + ",  " + me.getCar(1) + ", " + me.getCar(2));
        System.out.println("Wartość moich fur: " + me.cars_Value());
        System.out.println("She's driving : " + zona.getCar(0));
        System.out.println();

        fura.refuel();
        fiat.refuel();
        fiat2.refuel();
        System.out.println();



//        me.pet.sell(zona,me,50.);
        fura.sell(zona,me,1000.);
//        fura.sell(zona,me,10000.);
        System.out.println("I'm driving : " + me.getCar(0) + ", " + me.getCar(1) + ", " + me.getCar(2));
        System.out.println("Wartość moich fur: " + me.cars_Value());
        System.out.println("She's driving : " + zona.getCar(0));
//        zona.sell(me,zona,1.);


//        System.out.println(dog);
//        System.out.println(fiat);
//        System.out.println(me);
//
//        komura.turnOn();
//        fura.turnOn();

//        me.feed();
//
//        System.out.println("Sprawdzamy klasy");
//        System.out.println(me instanceof Human);
//        System.out.println(me instanceof Animal);
//        System.out.println(dog instanceof Human);
//        System.out.println(dog instanceof Animal);

//        me.pet.beEaten();
//        me.beEaten();



//        dog.feed();
//        dog.feed();
//        dog.feed();
//
//
//        dog.walk();
//        dog.walk();
//        dog.walk();
//        dog.walk();
//        dog.walk();
//        dog.walk();
//        dog.walk();
//        dog.walk();
//        dog.walk();
//        dog.walk();
//        dog.walk();
//        dog.walk();
//        dog.walk();
//        dog.walk();
//        dog.walk();
//
//        dog.feed();
//        dog.feed();
//        System.out.println(dog);
//        System.out.println(me.pet);
//

//        System.out.println(dog.weight);
//        dog.feed();
//        System.out.println(dog.weight);

//        System.out.println("Hi I'm " + dog.name);
//        System.out.println(dog.weight + " kg");
//        System.out.println(dog);
//
//        Animal lion = new Animal();
//        lion.species="lion";
//        lion.name="Idefos";
//        lion.weight=180d;
//
//        System.out.println(lion.name);
    }
}


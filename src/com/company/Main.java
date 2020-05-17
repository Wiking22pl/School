package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = new Pet("mouse");
        me.pet.name = "Myszojeleń";
        me.pet.feed();

        Pet dog = new Pet("dog");
        dog.name = "Akita";

        me.pet = dog;


        me.setSalary(4000.);

        Car fura = new Car("Mercedes","M4",20000.,1999,"Czarny");
        me.buyCar(fura);
        System.out.println("I'm driving : " + me.getCar());

        Human zona = new Human();
        zona.cash = 5000.;
        zona.firstName = "Zofia";

        zona.setSalary(500d);

        System.out.println("A samochód żony to: " );
        zona.getCar();

        Car fiat = new Car("Fiat", "Punto",15000., 2010,"Zielony");
        Car fiat2 = new Car("Fiat", "Punto",15000., 2010,"Zielony");

        if (fiat == fiat2){
            System.out.println("Są równe");
        }else{
            System.out.println("nie sa równe\n");
        }

        Phone komura = new Phone("Nokia", "N95",2007);

        FarmAnimal cow = new FarmAnimal("cow");
        cow.feed(10);
        cow.beEaten();
        cow.feed();

        dog.feed();
        dog.feed(0.5);



//        me.pet.sell(zona,me,50.);
//        fura.sell(zona,me,1000.);
////        fura.sell(zona,me,10000.);
//        System.out.println("I'm driving : " + me.getCar());
//        System.out.println("She's driving : " + zona.getCar());
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


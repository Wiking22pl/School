package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human();
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = new Animal("mouse");
        me.pet.name = "Myszojeleń";
        me.pet.feed();

        Animal dog = new Animal("dog");
        dog.name = "Akita";

        me.pet = dog;

        me.setSalary(4000.);
        System.out.println("my salary is: " + me.getSalary());

        Car fura = new Car("Mercedes","M4",20000.,1999,"Czarny");
        me.setCar(fura);
        me.getCar();

        Human zona = new Human();

        zona.shareCar(fura);
        System.out.println("A samochód żony to: " );
        zona.getCar();

        me.feed();

        System.out.println("Sprawdzamy klasy");
        System.out.println(me instanceof Human);
        System.out.println(me instanceof Animal);
        System.out.println(dog instanceof Human);
        System.out.println(dog instanceof Animal);

//        me.pet.beEaten();
//        me.beEaten();
        me.pet.sell();
        me.sell();



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


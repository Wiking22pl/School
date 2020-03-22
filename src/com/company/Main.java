package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {

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

        Car fura = new Car("Mercedes","M4",1999,"Czarny",20000.);
        me.setCar(fura);
        me.getCar();

        Human zona = new Human();

        zona.shareCar(fura);
        System.out.println("A samochód żony to: " );
        zona.getCar();
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


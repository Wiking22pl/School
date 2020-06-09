package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;
import java. util. Arrays;
import java.util.Comparator;

public class Human extends Animal {

    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;

    public Car[] garage;
    private Double salary;
    public Double cash;
    public final static Double DEFAULT_HUMAN_WEIGHT = 70.;
    public final static Integer DEFAULT_GARAGE_SIZE = 2;

    public Human() {
        super("homo sapiens");
        this.weight = DEFAULT_HUMAN_WEIGHT;
        this.cash = 1000d;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public Human(Integer garage_size) {
        super("homo sapiens");
        this.weight = DEFAULT_HUMAN_WEIGHT;
        this.cash = 1000d;
        this.garage = new Car[garage_size];
    }

    // shareCar umożliwiałby sprzedawanie nieswoich samochodów

//    public void buyCar(Car car) {
//        if (salary * 3 > car.price) {
//            System.out.println("Samochód gupiony za gotówke");
//            this.car = car;
//        } else if (salary * 12 > car.price) {
//            System.out.println("Samochód kupiony na kredyt");
//            this.car = car;
//        } else {
//            System.out.println("Na samochód cię nie stać cię biedaku");
//        }
//    }

    public void setCar(Car c, Integer miejsce) {
        garage[miejsce] = c;
    }

    public Car getCar(Integer miejsce) {
        return garage[miejsce];
    }

    public Double cars_Value() {
        Double a = 0.;
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] != null) {
                a += garage[i].value;
            }
        }
        return a;
    }

    public void sort_Garage(){
        Arrays.sort(garage);
    }

    public void setSalary(Double salary) {

        if (salary <= 1000) {
            System.out.println("Come on have more faith in yourself (new salary is below legal limit)");
        } else {
            System.out.println("Sending new data to the accountanting system");
            System.out.println("Make sure you send permit A38 to HR");
            System.out.println("Don't worry IRS already knows ;)");
            System.out.println("Your new salary: " + salary);
            this.salary = salary;
        }
    }

    public Double getSalary() {
        return salary;
    }

    public String toString() {
        return firstName + " " + lastName + " " + salary + "   samochody: " + garage + "   zwierzak: " + pet;
    }


}

package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {

    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;

    private Car car;    //
    private Double salary;
    public final static Double DEFAULT_HUMAN_WEIGHT = 70.;
    public double cash;

    public Human() {
        super("homo sapiens");
        this.weight = DEFAULT_HUMAN_WEIGHT;
        this.cash = 1000d;
    }

    public void shareCar(Car dzielony) {
        car = dzielony;
    }

    public void setCar(Car car) {   //
        if (salary * 3 > car.price) {
            System.out.println("Samochód gupiony za gotówke");
            this.car = car;
        } else if (salary * 12 > car.price) {
            System.out.println("Samochód kupiony na kredyt");
            this.car = car;
        } else {
            System.out.println("Na samochód cię nie stać cię biedaku");
        }
    }

    public void getCar() {
        System.out.println("I'm driving : " + car);
    }   //

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


}

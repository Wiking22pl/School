package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {

    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;

    private Car car;
    private Double salary;
    public final static Double DEFAULT_HUMAN_WEIGHT = 70.;
    public Double cash;

    public Human() {
        super("homo sapiens");
        this.weight = DEFAULT_HUMAN_WEIGHT;
        this.cash = 1000d;
    }

    // shareCar umożliwiałby sprzedawanie nieswoich samochodów

    public void buyCar(Car car) {
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

    public void setCar(Car c){
        car = c;
    }

    public Car getCar() {
        return car;
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
        return firstName + " " + lastName + " " + salary + "   samochód: " + car + "   zwierzak: " + pet;
    }


}

package com.company;

public class Human {

    String firstName;
    String lastName;
    Phone phone;
    Animal pet;

    private Car car;

    private Double salary;

    public void shareCar(Car dzielony){
        car=dzielony;
    }

    public void setCar(Car car) {
        if(salary*3>car.cena) {
            System.out.println("Samochód gupiony za gotówke");
            this.car = car;
        }
        else if(salary*12>car.cena){
            System.out.println("Samochód kupiony na kredyt");
            this.car = car;
        }
        else{
            System.out.println("Na samochód cię nie stać cię biedaku");
        }
    }

    public void getCar() {
        System.out.println("I'm driving : " + car);
    }

    public void setSalary(Double salary) {
        System.out.println("Your salary is now: " + salary);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }
}

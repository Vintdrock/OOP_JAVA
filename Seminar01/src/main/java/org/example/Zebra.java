package org.example;

import java.time.LocalDate;

public class Zebra extends Animal{
    public Zebra(String name, double weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void fly(){
        System.out.println(getName() + " не умеет летать");
    }
}

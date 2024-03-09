package org.example;

import java.time.LocalDate;

public class Jellyfish extends Animal {
    public Jellyfish(String name, double weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void toGo(){
        System.out.println(getName() + " не умеет бегать");
    }
    public void fly(){
        System.out.println(getName() + " не умеет летать");
    }
}

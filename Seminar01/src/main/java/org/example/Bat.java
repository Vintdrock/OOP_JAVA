package org.example;

import java.time.LocalDate;

public class Bat extends Animal{
    public Bat(String name, double weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public void swim(){
        System.out.println(getName() + " не умеет плавать");
    }

    public void toGo(){
        System.out.println(getName() + " не умеет бегать");
    }
}

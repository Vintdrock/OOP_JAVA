package org.example;
import java.time.LocalDate;

public class Dog extends Animal{
    public Dog(String name, double weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

}

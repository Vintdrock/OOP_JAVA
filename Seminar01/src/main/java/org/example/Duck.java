package org.example;

import java.time.LocalDate;

public class Duck extends Animal {
    public Duck(String name, double weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
}

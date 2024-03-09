package org.example;

import java.time.LocalDate;

public class Lion extends Animal {
    public Lion(String name, double weight, LocalDate age, Owner owner) { //конструктор, который вызывается new
        super(name, weight, age, owner);
    }
    public Lion() {
        super();
    }
}

package impl;

import java.time.LocalDate;
import clients.Animal;
import clients.Owner;

public class Lion extends Animal {
    public Lion(String name, double weight, LocalDate age, Owner owner) { //конструктор, который вызывается new
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {


    }
}

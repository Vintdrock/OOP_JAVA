package impl;

import java.time.LocalDate;
import clients.Animal;
import clients.Owner;
public class Zebra extends Animal {
    public Zebra(String name, double weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {

    }
}

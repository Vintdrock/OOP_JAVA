package impl;

import java.time.LocalDate;
import clients.Animal;
import clients.Owner;
import clients.Swimable;

public class Jellyfish extends Animal implements Swimable {
    public Jellyfish(String name, double weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}

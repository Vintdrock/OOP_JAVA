package impl;
import clients.Animal;
import clients.Owner;
import clients.Flyable;
import clients.Swimable;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Swimable {
    public Duck(String name, double weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("ест");
    }

    @Override
    public double fly() {
        return 2;
    }

    @Override
    public void swim() {

    }
}

package impl;

import java.time.LocalDate;
import clients.Animal;
import clients.Owner;
import clients.Flyable;

public class Bat extends Animal implements Flyable {
    public Bat(String name, double weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println(" ест");
    }

    public void swim(){
        System.out.println(" не умеет плавать");
    }

    public void toGo(){
        System.out.println(" не умеет бегать");
    }

    @Override
    public double fly() {
        return 7;
    }
}

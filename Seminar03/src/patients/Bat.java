package patients;

import java.time.LocalDate;
import interFace.Animal;
import interFace.Owner;
import interFace.Flyable;

public class Bat extends Animal implements Flyable {
    public Bat(String name, double weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Ночной вампир пьет кровь!");
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

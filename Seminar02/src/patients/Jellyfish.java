package patients;

import java.time.LocalDate;
import interFace.Animal;
import interFace.Owner;
import interFace.Swimable;

public class Jellyfish extends Animal implements Swimable {
    public Jellyfish(String name, double weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Неизвестно как но тоже ест!");
    }

    @Override
    public double swim() {
        return 0.5;
    }
}

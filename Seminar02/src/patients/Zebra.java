package patients;

import java.time.LocalDate;
import interFace.Animal;
import interFace.Goable;
import interFace.Owner;
import interFace.Swimable;

public class Zebra extends Animal implements Goable, Swimable {
    public Zebra(String name, double weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Зебра жует травку!");
    }

    @Override
    public double swim() {
        return 3;
    }

    @Override
    public double run() {
        return 30;
    }
}

package patients;

import java.time.LocalDate;
import interFace.Animal;
import interFace.Goable;
import interFace.Owner;
import interFace.Swimable;

public class Dog extends Animal implements Goable, Swimable {
    public Dog(String name, double weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Авав грызет кость!");
    }

    @Override
    public double swim() {
        return 2;
    }

    @Override
    public double run() {
        return 17;
    }
}

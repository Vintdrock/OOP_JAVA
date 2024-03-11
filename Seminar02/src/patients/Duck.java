package patients;
import interFace.*;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Swimable, Goable {
    public Duck(String name, double weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Утка щипет травку!!");
    }

    @Override
    public double fly() {
        return 2;
    }

    @Override
    public double swim() {
        return 1;
    }

    @Override
    public double run() {
        return 8;
    }
}

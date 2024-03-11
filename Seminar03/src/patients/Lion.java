package patients;

import java.time.LocalDate;
import interFace.Animal;
import interFace.Goable;
import interFace.Owner;
import interFace.Swimable;

public class Lion extends Animal implements Goable, Swimable {
    public Lion(String name, double weight, LocalDate age, Owner owner) { //конструктор, который вызывается new
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("Рвет плоть");

    }

    @Override
    public double swim() {
        return 3;
    }

    @Override
    public double run() {
        return 35;
    }
}

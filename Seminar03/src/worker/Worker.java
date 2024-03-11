package worker;

import java.time.LocalDate;

public class Worker {
    protected String name;
    protected short age;
    protected LocalDate emplDate;

    public Worker(String name) {
        this.name = name;
    }

    public Worker(String name, short age, LocalDate emplDate) {
        this.name = name;
        this.age = age;
        this.emplDate = emplDate;
    }

    @Override
    public String toString() {
        return String.format("name = %s, age = %s, emplDate = %s",
        name, age, emplDate);
    }
}

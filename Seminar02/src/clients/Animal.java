package clients;
import java.time.LocalDate;

public abstract class Animal {
    protected String name;
    protected double weight;
    protected LocalDate age;
    protected Owner owner;

    //Конструкторы вызывается new
    public Animal(String name, double weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }

    //Методы поведение класса
    public abstract void eat();

    public String getType(){
        return getClass().getSimpleName();
    }

    public String toString(){

        return String.format("name = %s, weight = %s, age = %s, owner = %s",
                name, weight, age, owner);
    }
}

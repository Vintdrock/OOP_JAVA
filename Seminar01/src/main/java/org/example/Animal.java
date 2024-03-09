package org.example;
import java.time.LocalDate;


//Поля - состояние класса
public class Animal {
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
    public Animal() {
        this("Животное", 100, LocalDate.now(), new Owner());
    }

    //Методы поведение класса
    private void sleep(){
        System.out.println(getType() + " Спит");
    }
    private void wakeUp(){
        System.out.println(getType() + " Проснулся");
    }
    private void wakeUp(int time){
        System.out.println(getType() + " Проснулся в " + time);
    }
    private void eat(){
        System.out.println(getType() + " Поел");
    }
    private void play(){
        System.out.println(getName() + " играет");
    }
    public void toGo(){
        System.out.println(getName() +" бегает");
    }
    public void fly(){
        System.out.println(getName() + " летает");
    }
    public void swim(){
        System.out.println(getName() + " плавает");
    }
    public void live(){
        wakeUp();
        eat();
        play();
        sleep();
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public LocalDate getAge() {
        return age;
    }
    public Owner getOwner() {
        return owner;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String toString(){

        return String.format("name = %s, weight = %s, age = %s, owner = %s",
                name, weight, age, owner);
    }
}

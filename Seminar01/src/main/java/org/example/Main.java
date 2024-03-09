package org.example;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bat bat = new Bat("Мышонок", 0.02, LocalDate.now(), new Owner("Василий Иванович"));
        Duck duck = new Duck("Утенок", 5, LocalDate.now(), new Owner("Иван Васильевич"));
        Jellyfish jellyfish = new Jellyfish("Пушинка", 0.01, LocalDate.now(), new Owner("Местный Жук"));
        Zebra zebra = new Zebra("Полосатик", 200, LocalDate.now(), new Owner("Частый Гость"));

        bat.fly();
        bat.toGo();
        bat.swim();
        System.out.println("___________________________");
        duck.fly();
        duck.toGo();
        duck.swim();
        System.out.println("___________________________");
        jellyfish.fly();
        jellyfish.toGo();
        jellyfish.swim();
        System.out.println("___________________________");
        zebra.fly();
        zebra.toGo();
        zebra.swim();
        System.out.println("___________________________");




//        Lion lev = new Lion("Лева", 200, LocalDate.now(), new Owner("Василий Иванович"));
//        Lion puzo = new Lion("Кот", 450, LocalDate.now(), new Owner("Иван Васильевич"));
//        System.out.println(lev);
//        System.out.println(lev);
//        System.out.println(puzo);
//        Dog pes = new Dog("Дружок", 30, LocalDate.now(), new Owner("Местный"));
//        System.out.println(pes);
//        System.out.println(pes.getType());
//        lev.setWeight(250);
//        System.out.println(lev.getWeight());
//        Lion test = new Lion();
//        System.out.println(test);

//        pes.live();

//        List<Animal> animals= new ArrayList<>();
//        animals.add(lev);
//        animals.add(puzo);
//        animals.add(pes);
//        animals.add(test);
//        System.out.println(animals);
    }
}

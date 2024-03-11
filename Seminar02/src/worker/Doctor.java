package worker;

import interFace.Animal;

import java.time.LocalDate;

public class Doctor extends Worker{

    public Doctor(String name, short age, LocalDate emplDate) {
        super(name, age, emplDate);
    }
    public void diagnose(Animal animal){
        System.out.println("Диагноз для " + animal.getName() +" владельца "+ animal.getOwner() +"-> На колбасу!");
    }
}

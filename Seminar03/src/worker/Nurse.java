package worker;

import java.time.LocalDate;

public class Nurse extends Worker{

    public Nurse(String name) {
        super(name);
    }

    public Nurse(String name, short age, LocalDate emplDate) {
        super(name, age, emplDate);
    }
    public void injection(){
        System.out.println("Укольчик на подходе");
    }
}

package clinic;

import interFace.Animal;
import interFace.Flyable;
import interFace.Goable;
import interFace.Swimable;
import worker.Doctor;
import worker.Nurse;
import worker.Worker;

import java.util.List;
import java.util.ArrayList;

public class VeterinaryClinic {
    private List<Worker> workers = new ArrayList<>();
    private List<Animal> animals = new ArrayList<>();

    public VeterinaryClinic() {
        this.workers = workers;
        this.animals = animals;
    }

    public void addWorker(Worker employ){
        workers.add(employ);
    }
    public void remWorker(Worker employ){
        workers.remove(employ);
    }
    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void remAnimal(Animal animal){
        animals.remove(animal);
    }
    public List<Nurse> getNurses(){//получение с кастом
        List<Nurse> result = new ArrayList<>();
        for (Worker wo: workers){
            if (wo instanceof Nurse){
                result.add((Nurse) wo);
            }
        }
        return result;
    }
    public List<Doctor> getDoctors(){//получение с кастом
        List<Doctor> result = new ArrayList<>();
        for (Worker wo: workers){
            if (wo instanceof Doctor){
                result.add((Doctor) wo);
            }
        }
        return result;
    }
    public List<Animal> getFlyable(){//получение без каста
        List<Animal> result = new ArrayList<>();
        for (Animal animal: animals) {
            if (animal instanceof Flyable){
                result.add(animal);
            }
        }
        return result;
    }
    public List<Animal> getGoable(){
        List<Animal> result = new ArrayList<>();
        for (Animal animal: animals) {
            if (animal instanceof Goable){
                result.add(animal);
            }
        }
        return result;
    }
    public List<Animal> getSwimable(){
        List<Animal> result = new ArrayList<>();
        for (Animal animal: animals) {
            if (animal instanceof Swimable){
                result.add(animal);
            }
        }
        return result;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Worker> getWorkers() {
        return workers;
    }
}

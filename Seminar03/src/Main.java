import pharmacy.Medicine;
import pharmacy.Medicine2;
import pharmacy.MedicineComponent;
import pharmacy.impl.Asitromin;
import pharmacy.impl.Penicilinum;
import pharmacy.impl.Vetbicid;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
    //Создаем медицинские компоненты
        MedicineComponent asitr = new Asitromin("Азитронит", 50, 70);
        MedicineComponent penicilin = new Penicilinum("Пенецилин", 30, 50);
        MedicineComponent vetbicid = new Vetbicid("Ветбицид", 40, 30);

        //Созадаем лекарство
        Medicine medicine1 = new Medicine();
        medicine1.addComponent(asitr).addComponent(penicilin).addComponent(vetbicid);

        Iterator<MedicineComponent> med = medicine1;
        while (med.hasNext()){
            System.out.println(med.next());
        }
        System.out.println("_______________");
        Medicine2 medicine2 = new Medicine2();
        medicine2.addComponent(penicilin).addComponent(vetbicid).addComponent(asitr);
        for (MedicineComponent component: medicine2){
            System.out.println(component);
        }


        //Код со второй домашки
//        VeterinaryClinic clinic = new VeterinaryClinic();
//        //Добавление животных
//        Animal dog = new Dog("Vasya", 7, LocalDate.now(), new Owner());
//        Jellyfish jellyfish = new Jellyfish("Пузырек", 1, LocalDate.now(), new Owner());
//        clinic.addAnimal(dog);
//        clinic.addAnimal(jellyfish);
//        clinic.addAnimal(new Bat("Чуча", 1, LocalDate.now(), new Owner()));
//        System.out.println(clinic.getSwimable());//получение списка плавающих животных
//        System.out.println(clinic.getAnimals()); //получение всех животных
//
//        //Добавление работников
//        Doctor doc = new Doctor("Доктор1", (short) 32, LocalDate.of(2023, 12, 12));
//        clinic.addWorker(doc);
//        System.out.println(clinic.getDoctors());
//
//        //Диагноз
//        Zebra zebra = new Zebra("Полосатик", 200, LocalDate.now(), new Owner("Чебурашка"));
//        doc.diagnose(zebra);


//Код с семинара
//        Animal dog = new Dog("Vasya", 7, LocalDate.now(), new Owner()); //Правильное создание экземпляра класса Animal
//        //System.out.println(dog);
//        Jellyfish jellyfish = new Jellyfish("Пузырек", 1, LocalDate.now(), new Owner());
//        jellyfish.sound();
//        dog.eat();
//
//        List<Animal>flyables = new ArrayList<>();
//        flyables.add(new Duck("Кряка", 1, LocalDate.now(), new Owner()));
//        flyables.add(new Bat("Мышонок", 1, LocalDate.now(), new Owner()));
//        flyables.add(dog);
//        //System.out.println(flyables);
//
//        for (Animal animal: flyables){
//            if (animal instanceof Flyable){
//                ((Flyable) animal).fly();// Приведение к типу (операция каст)
//            }
//        }
        //Анонимный класс при таком вызове(через new) нужно реализовывать все абстрактные методы
        // Посмотреть сколько методов нужно реализовывать через List list = new List(). Правильное создание на 15 строке
//        Animal dog = new Animal() {
//           @Override
//           public void eat() {
//
//           }
//       };
    }
}

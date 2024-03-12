import pharmacy.Medicine;
import pharmacy.Medicine2;
import pharmacy.MedicineComponent;
import pharmacy.impl.Asitromin;
import pharmacy.impl.Penicilinum;
import pharmacy.impl.Vetbicid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
    //Создаем медицинские компоненты
        MedicineComponent asitr = new Asitromin("Азитронит", 50, 25);
        MedicineComponent penicilin = new Penicilinum("Пенецилин", 30, 50);
        MedicineComponent vetbicid = new Vetbicid("Ветбицид", 40, 30);

        //Созадаем лекарство
        System.out.println("_______________С использованием Iterator ");
        Medicine medicine1 = new Medicine();
        medicine1.addComponent(asitr).addComponent(penicilin).addComponent(vetbicid);

        Iterator<MedicineComponent> med = medicine1;
        while (med.hasNext()){
            System.out.println(med.next());
        }
        System.out.println("_______________С использованием Interable");
        Medicine2 medicine2 = new Medicine2();
        medicine2.addComponent(penicilin).addComponent(vetbicid).addComponent(asitr);
        for (MedicineComponent component: medicine2){
            System.out.println(component);
        }
        System.out.println("_______________Сортировка по силе");

        ArrayList<MedicineComponent> medList = new ArrayList<>();
        medList.add(asitr);
        medList.add(penicilin);
        medList.add(vetbicid);
        System.out.println(medList);
        Collections.sort(medList);
        System.out.println(medList);
        System.out.println("_______________Сортировка по силе в обратном порядке");
        Collections.sort(medList, Comparator.reverseOrder()); //Сортировка в обратном порядке
        System.out.println(medList);
        System.out.println("_______________Сортировка по весу через Лямбду");
        Collections.sort(medList,(comp1, comp2)-> (int)(comp1.getWeight()- comp2.getWeight())); // Сортировка по весу через Лямбду
        System.out.println(medList);
    }
}

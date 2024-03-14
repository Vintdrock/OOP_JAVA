import pharmacy.Medicine;
import pharmacy.MedicineComponent;
import pharmacy.impl.Asitromin;
import pharmacy.impl.Penicilinum;
import pharmacy.impl.Vetbicid;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
    //Создаем медицинские компоненты
        MedicineComponent asitr = new Asitromin("Азитронит", 3, 20);
        MedicineComponent penicilin = new Penicilinum("Пенецилин", 1, 40);
        MedicineComponent vetbicid = new Vetbicid("Ветбицид", 2, 50);

        //Созадаем лекарство
        Medicine medicine1 = new Medicine();
        Medicine medicine2 = new Medicine();
        Medicine medicine3 = new Medicine();
        medicine1.addComponent(asitr).addComponent(vetbicid); //160
        medicine2.addComponent(asitr).addComponent(penicilin); //100
        medicine3.addComponent(penicilin).addComponent(vetbicid);//140



        ArrayList<Medicine> medicinesList = new ArrayList<>();
        medicinesList.add(medicine1);
        System.out.println(medicine1);
        System.out.println(medicine2);
        System.out.println(medicine3);

        medicinesList.add(medicine2);
        medicinesList.add(medicine3);
        System.out.println("Список лекарств без сортировки");
        System.out.println(medicinesList);
        Collections.sort(medicinesList);
        System.out.println("Список лекарств с сортировкой по сумме (веса умноженного на силу компонентов)");
        System.out.println(medicinesList);
        
//        System.out.println("_______________Сортировка по силе в обратном порядке");
//        Collections.sort(medList, Comparator.reverseOrder()); //Сортировка в обратном порядке
//        System.out.println(medList);
//        System.out.println("_______________Сортировка по весу через Лямбду");
//        Collections.sort(medList,(comp1, comp2)-> (int)(comp1.getWeight()- comp2.getWeight())); // Сортировка по весу через Лямбду
//        System.out.println(medList);
    }
}

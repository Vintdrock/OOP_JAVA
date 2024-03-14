package pharmacy;

import java.util.ArrayList;
import java.util.List;
//
public class Medicine implements Comparable<Medicine>, MedicineComponent {
    private List<MedicineComponent> components;
    private int index;

    public Medicine() {
        this.components = new ArrayList<>();
        this.index = 0;
        index++;
    }

    public Medicine addComponent(MedicineComponent component){
        components.add(component);
        return this;
    }


    public int getComponentsPower(){
        int power = 0;
        for (MedicineComponent component: components){
            power += component.getPower()*component.getWeight();
        }
//        power = medicine.getPower() * (int) component.getWeight();
        return power;

    }

    @Override
    public String toString() {
        return "Лекарство: " + components.toString();
    }

    @Override
    public int compareTo(Medicine medicine) {

        return Integer.compare(this.getComponentsPower(), medicine.getComponentsPower());
    }

}

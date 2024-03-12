package gbCollections.lists;

import gbCollections.GbList;
import gbCollections.lists.util.ArrayIterator;

import java.util.Arrays;
import java.util.Iterator;

public class GbArrayList<E> implements GbList<E> {
    private E[] values;
    private int size; //Сколько налито воды в 3-х литровую банку
    private int capacity; //Объем банки, т.е. 3 литра


@SuppressWarnings("unchecked") //указывает не проверять желтое подчеркивание
    public GbArrayList() {
        this.size = 0;
        this.capacity = 10;
        try {
            this.values = (E[]) new Object[capacity];
        } catch (ClassCastException e){
            System.out.println(e.getMessage());
        }
    }
    private void addCapacity(){
        capacity = capacity + capacity/2; //увеличение в 1.5 раза
        E[] array = (E[]) new Object[capacity];
        System.arraycopy(values,0, array, 0, values.length);
        this.values = array;
    }

    @Override
    public void add(E value) {
        if (size == capacity){
            addCapacity();
        }
        values[size++] = value;
    }

    @Override
    public void add(int index, E value) {

    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public void removeByValue(E value) {
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(value)){
                removeByIndex(i);
                return;
            }
        }
        throw new RuntimeException("Элемент не найден");
    }

    @Override
    public void removeByIndex(int index) {
        try{
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values,0, index);
            int amoutElementsAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, amoutElementsAfterIndex);
        } catch (ClassCastException e){
            throw  new RuntimeException(e);
        }
//        capacity = capacity - 1;
//        E[] res = (E[]) new Object[capacity];
//        System.arraycopy(values, 0, res,0, index);
//        int amoutElementsAfterIndex = values.length - index - 1;
//        System.arraycopy(values, index + 1, res, index, amoutElementsAfterIndex);
//        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }
    public String toString(){
        StringBuilder builder = new StringBuilder("[");
        int i =0;
        while (values[i] != null){
            builder.append(values[i]).append(", ");
            i++;
        }
        if (builder.length() == 1)
            return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length()-1);
        builder.append("]");
        return builder.toString();
    }
}


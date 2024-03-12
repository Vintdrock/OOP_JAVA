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
    public void remove(E value) {
        capacity = capacity - 1;
        E[] res = (E[]) new Object[capacity];
        System.arraycopy(values, 0, res,0,);
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }
}

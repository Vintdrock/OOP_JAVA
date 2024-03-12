package gbCollections.lists.util;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator<E> {
    private E[] array;
    private int index;

    public ArrayIterator(E[] array) {
        this.index = 0;
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public E next() {
        return array[index++];
    }
}

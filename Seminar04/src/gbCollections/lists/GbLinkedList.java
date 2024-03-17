package gbCollections.lists;

import gbCollections.GbList;
import gbCollections.lists.util.ArrayIterator;

import java.util.Iterator;

public class GbLinkedList <E> implements GbList<E> {
    private int size;
    private Node<E> head;

    @Override
    public void add(E value) {
        if (head==null) {
            this.head = new Node<>(value);
        } else {
            Node<E> curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = new Node<>(value);
        }
        size++;
    }

    @Override
    public void add(int index, E value) {
        Node<E> temp;
        if (index == 0) {
            temp = this.head;
            this.head = new Node<>(value);
            head.next = temp;
        } else {
            Node<E> prev = null;
            Node<E> curr = head;
            int count = 0;
            while (count != index){
                prev = curr;
                curr = curr.next;
                count++;
            }
            temp = curr;
            prev.next= new Node<>(value);
            curr = prev.next;
            curr.next = temp;

        }
        size++;
    }

    @Override
    public E get(int index) {
        int count = 0;
        Node<E> curr = head;
        while (count != index){
            curr = curr.next;
            count++;
        }
        return curr.value;
    }

    @Override
    public void removeByValue(E value) {
        if (head.value == value){
            head = head.next;
        }else {
            Node<E> prev = null;
            Node<E> curr = head;
        while (curr.value != value){
            prev = curr;
            curr = curr.next;
        }
            prev.next = curr.next;
            size--;
        }
    }

    @Override
    public void removeByIndex(int index) {
        if (index == 0) head = head.next;
        int count = 0;
        Node<E> prev = null;
        Node<E> curr = head;
        while (count != index){
            prev = curr;
            curr = curr.next;
            count++;
        }
        if (prev != null)
            prev.next = curr.next;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(toArray());
    }

    public E[] toArray(){
        E[] result = (E[]) new Object[size];
        Node<E> curr = head;
        int index = 0;
        while (curr.next != null){
            result[index] = curr.value;
            curr = curr.next;
            index++;
        }
        return result;
    }
    public String toString(){
        StringBuilder builder = new StringBuilder("[");
        Node<E> current = head;
        while (current != null){
            builder.append(current.value).append(", ");
            current = current.next;
        }
        if (builder.length() == 1)
            return "[]";
        builder.deleteCharAt(builder.length() - 1).deleteCharAt(builder.length()-1);
        builder.append("]");
        return builder.toString();
    }
    private static class Node<E>{
        private final E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
            this.next = null;
        }
    }
}

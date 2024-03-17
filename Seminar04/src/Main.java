import gbCollections.GbList;
import gbCollections.lists.GbArrayList;
import gbCollections.lists.GbLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        GbList<Integer> list = new GbLinkedList<>();
        list.add(5);
        list.add(89);
        list.add(8);
        list.add(0);
        list.add(45);
        list.add(2);
        System.out.println("Оригинальный  список:             " + list);
        list.removeByIndex(3);
        System.out.println("Список с удаление по  индексу     " + list);
        list.removeByValue(89);
        System.out.println("Список с удаление по значению (89)" + list);
        list.add(0,4);
        System.out.println("С добавлением по индексу в начало " + list);
        list.add(3,99);
        System.out.println("С добавление по индексу в середину" + list);




        //код с семинара
//        GbList<Integer> list = new GbArrayList<>();
//        list.add(5);
//        list.add(8);
//        list.add(0);
//        list.add(3);
//        list.add(9);
//        System.out.println(list);
//        System.out.println(list.size());
//        list.removeByIndex(1);
//        System.out.println(list);
//        list.removeByValue(0);
//        System.out.println(list);
//
//        GbList<String> str = new GbArrayList<>();
//        str.add("123");
//        str.add("456");
//        str.add("789");
//        str.add("012");
//        System.out.println(str);
    }
}
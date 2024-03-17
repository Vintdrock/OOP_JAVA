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
        System.out.println(list);
        list.removeByIndex(2);
        System.out.println(list);


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
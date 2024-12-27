package org.example.collections;

import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list);
        list.add(1,"Boat");
        System.out.println(list);

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        for(int i : list1) {
            System.out.println(i);
        }
        System.out.println(list.size());
        boolean b = list.isEmpty();
        System.out.println(b);
        System.out.println(list1.size());
        System.out.println(list1.contains(3));
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }

}

package org.example.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(0);
        set.add(1);//treesets not allowes duplicates but follow the order
        System.out.println(set);
        System.out.println(set.tailSet(1));
    }
}

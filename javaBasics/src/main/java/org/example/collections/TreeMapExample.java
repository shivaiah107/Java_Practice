package org.example.collections;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        map.put(11,16);
        map.put(12,11);
        map.put(9,15);
        map.put(10,19);
        map.put(11,14);//wont add to the map because map doesn't allow duplicates
        System.out.println(map);
        //it is sorted already natural order by key values
    }
}

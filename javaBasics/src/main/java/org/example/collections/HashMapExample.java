package org.example.collections;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"madhu");
        map.put(2,"manoj");
        map.put(1,"madhu");//duplicates or not allowed it checks the keys
        map.put(3,"madhu");
        System.out.println(map);
    }
}

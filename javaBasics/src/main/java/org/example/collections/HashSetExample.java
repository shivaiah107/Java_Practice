package org.example.collections;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Ramu");
        hs.add("Java");
        hs.add("Ramu");// duplicates or not allowed and there no sorted order
        System.out.println(hs);
        for(String s : hs){
            System.out.println(s);
        }
        hs.add("ramu");// case sensitive so it will duplicate value Ramu of ramu
        int k = hs.size();
        System.out.println(k);
        boolean value = hs.isEmpty();
        System.out.println(value);
       // String[] S = hs.toArray();
        for (int i = 0 ; i<= hs.size();i++){
            System.out.println(i);
        }

    }

}

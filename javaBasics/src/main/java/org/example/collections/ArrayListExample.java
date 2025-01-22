package org.example.collections;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        al.add("List");
        al.add("SET");
        al.add("MAP");
        al.add("Queue");
        System.out.println(al);
        al.add(0,"Sivaiah");
        System.out.println(al);

        String str = al.get(1);
        str = str.toUpperCase();
        System.out.println(str);
        al.remove(0);
        System.out.println(al);
        al.set(0,"SIVA");
        System.out.println(al);
        al.add(0,"londom");
        System.out.println(al);
        al.remove("londom");

        for(String s : al){
            System.out.println(s);
        }
        int[] arr = {1,9,3,4,7,6,7,8,9,10,1,2,3,4};
        System.out.println();
//        for(int i : arr){
//            System.out.println(i);
//        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for( int j : arr){
            arrayList.sort(Comparator.naturalOrder());
            arrayList.add(j);
        }
        System.out.println(arrayList);

    }
}

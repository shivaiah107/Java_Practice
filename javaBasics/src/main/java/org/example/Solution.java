package org.example;

import java.util.HashSet;

class Solution {
    public static boolean audienceOverlap(int blog1[], int blog2[]) {

        HashSet<Integer> visitorSet = new HashSet<>();
        for(int i  : blog1){
            visitorSet.add(i);
        }


        return false;
    }

    public static void main(String[] args) {
        int blog1[] = {1, 2, 3, 4, 5};
        int blog2[] = {6, 7, 8, 9, 10};
        System.out.println();

        if (audienceOverlap(blog1, blog2))
            System.out.print("Yes, there is an audience overlap between both blogs.");
        else
            System.out.print("No, there is no audience overlap between both blogs.");
    }
}
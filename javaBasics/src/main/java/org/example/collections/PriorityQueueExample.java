package org.example.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(7);
        queue.add(7); // allow us to add to duplicate value and sorted
        System.out.println(queue);
    }
}

package org.example.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class LinkedListQueueExample {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(4);
        queue.add(3);
        queue.add(5);
        queue.add(1);
        System.out.println(queue);
        queue.remove(1);
        System.out.println(queue);

    }
}

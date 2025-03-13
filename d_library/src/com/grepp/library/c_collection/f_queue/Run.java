package com.grepp.library.c_collection.f_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Run {

    public static void main(String[] args) {
        _Queue<Integer> queue = new _Queue<>();

        for (int i = 0; i < 10; i++) {
            queue.offer(i);
        }

        System.out.println("peek : " + queue.peek());

        for (int i = 0; i < 10; i++) {
            System.out.println(queue);
            System.out.println(queue.poll());
        }
    }
}

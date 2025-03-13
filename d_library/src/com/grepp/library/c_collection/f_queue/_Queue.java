package com.grepp.library.c_collection.f_queue;

import com.grepp.library.c_collection.z_domain.Node;

public class _Queue <E>{

    private Node<E> front;
    private Node<E> tail;
    private int size;

    public void offer(E e){
        Node<E> node = new Node<>(e);

        if (front == null){
            front = node;
            tail = node;
            size++;
            return;
        }

        tail.setNexT(node);
        tail = node;
        size++;
    }

    public E peek(){
        if (front == null) return null;
        return front.data();
    }

    public E poll(){
        if (front == null) return null;
        E data = front.data();
        front = front.next();
        size--;
        return data;
    }

    public boolean empty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

}

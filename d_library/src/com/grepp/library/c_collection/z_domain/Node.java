package com.grepp.library.c_collection.z_domain;

public class Node<E> {

    private Node<E> next;
    private E data;

    public Node(E data) {
        this.data = data;
    }

    public E data(){
        return data;
    }

    public void setData(E data){
        this.data = data;
    }

    public Node<E> next(){
        return next;
    }

    public void setNexT(Node<E> next){
        this.next = next;
    }

    @Override
    public String toString() {
        return data().toString();
    }
}

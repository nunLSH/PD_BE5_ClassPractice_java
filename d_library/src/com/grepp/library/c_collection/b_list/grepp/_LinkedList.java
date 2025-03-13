package com.grepp.library.c_collection.b_list.grepp;

import com.grepp.library.c_collection.z_domain.Node;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class _LinkedList<E> implements Iterable<E>, _List<E> {

    private Node<E> head;
    private int pointer;

    public int size(){
        return pointer;
    }

    public boolean isEmpty(){
        return pointer == 0;
    }

    public boolean add(E e){
        Node<E> current = new Node<>(e);

        if(pointer == 0){
            head = current;
            pointer++;
            return true;
        }

        Node<E> link = head;
        while(link.next() != null){
            link = link.next();
        }

        link.setNexT(current);
        pointer++;
        return true;
    }

    /**
     * add(int index, E element) 추가 구현
     */
    public boolean add(int index, E e){
        if(index < 0 || index > pointer) throw new IndexOutOfBoundsException();

        Node<E> current = new Node<>(e);

        if(pointer == 0){
            head = current;
            pointer++;
            return true;
        }

        Node<E> link = head;
        for (int i = 0; i < index - 1; i++) {
            link = link.next();
        }
        Node<E> ll = link.next();
        link.setNexT(current);
        link = link.next();
        for (int i = index; i < pointer; i++) {
            link.setNexT(ll);
        }

        pointer++;
        return true;
    }

    public E get(int index){
        if(index < 0 || index >= pointer) throw new IndexOutOfBoundsException();

        Node<E> link = head;
        for (int i = 0; i < index; i++) {
           link = link.next();
        }

        return link.data();
    }

    public E set(int index, E e){
        if(index < 0 || index >= pointer) throw new IndexOutOfBoundsException();

        Node<E> link = head;

        for (int i = 0; i < index; i++) {
            link = link.next();
        }

        E modified = link.data();
        link.setData(e);
        return modified;
    }

    public E remove(int index){
        if (index < 0 || index >= pointer) throw new IndexOutOfBoundsException();

        Node<E> link = head;
        Node<E> prevNode = head;

        if (index == 0) {
            head = head.next();
            pointer--;
            return prevNode.data();
        }

        for (int i = 0; i < index; i++) {
            prevNode = link;
            link = link.next();
        }

        prevNode.setNexT(link.next());
        pointer--;
        return link.data();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            // Iterator 인터페이스를 구현하는 익명클래스

            private int pointer;  // 반환할 위치의 노드

            @Override
            public boolean hasNext() {
                return pointer < size();
            }

            @Override
            public E next() {
                if (pointer >= size()) throw new NoSuchElementException();
                E e = get(pointer);
                pointer++;
                return e;
            }
        };
    }
}

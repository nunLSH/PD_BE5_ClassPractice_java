package com.grepp.library.c_collection.c_set.grepp;

import static java.lang.reflect.Array.get;

import com.grepp.library.c_collection.b_list.grepp._LinkedList;
import com.grepp.library.c_collection.z_domain.Node;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class _HastSet_p3<E> implements Iterable<E>{

    private int pointer;
    private _LinkedList<E> linkedList;

    public _HastSet_p3(){
        linkedList = new _LinkedList<>();
    }

    public boolean add(E e){
        if (linkedList.contains(e)) return false;

        linkedList.add(e);
        pointer++;
        return true;
    }

    public E get(int index){
        if(linkedList.isEmpty()) return null;

        return linkedList.get(index);
    }

    public boolean remove(E e) {
        if (!linkedList.contains(e)) return false;

        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).equals(e)) {
                linkedList.remove(i);
                pointer--;
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private int pointer;

            @Override
            public boolean hasNext() {
                return pointer < linkedList.size();
            }

            @Override
            public E next() {
                if (pointer >= linkedList.size()) throw new NoSuchElementException();
                E e = linkedList.get(pointer);
                pointer++;
                return e;
            }
        };
    }
}

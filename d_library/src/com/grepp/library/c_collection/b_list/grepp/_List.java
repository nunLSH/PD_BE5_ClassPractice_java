package com.grepp.library.c_collection.b_list.grepp;

import java.util.Iterator;

public interface _List<E> extends Iterable<E>{

    boolean add(E e);
    E get(int index);
    int size();
}

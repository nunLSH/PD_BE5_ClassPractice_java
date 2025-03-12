package com.grepp.library.c_collection.b_list.grepp;

import java.util.Iterator;
import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")
public class _ArrayList<E> implements Iterable<E>, _List<E>{

    private Object[] elementData;
    private static final int DEFAULT_CAPACIT = 10;
    private int pointer;   // size
    private int arraySize;

    public _ArrayList() {
        elementData = new Object[DEFAULT_CAPACIT];
        arraySize = DEFAULT_CAPACIT;
    }

    public boolean add(E e){
        if (pointer < arraySize){
            elementData[pointer] = e;
            pointer++;
            return true;
        }

        arraySize *= 2;
        Object[] temp = new Object[arraySize];

        for (int i = 0; i < pointer; i++) {
            temp[i] = elementData[i];
        }

        temp[pointer] = e;
        elementData = temp;
        pointer++;
        return true;
    }

    /**
     * add(int index, E e) 추가 구현
     */
    public boolean add(int index, E e){
        if (index < 0 || index > pointer) throw new IndexOutOfBoundsException();

        arraySize++;
        Object[] temp = new Object[arraySize];

        if (pointer == 0){
            temp[0] = e;
        }

        for (int i = 0; i < index; i++) {
            temp[i] = elementData[i];
        }
        temp[index] = e;
        for (int i = index + 1; i < arraySize; i++) {
            temp[i] = elementData[i - 1];
        }

        elementData = temp;
        pointer++;
        return true;
    }


    public E get(int index){
        if (index < 0 || index >= pointer) throw new IndexOutOfBoundsException("인덱스 범위를 벗어났습니다.");
        return (E) elementData[index];
    }

    /**
     *  set(int index, E e) 수정 구현
     */
    public boolean set(int index, E e){
        if (index < 0 || index >= pointer) throw new IndexOutOfBoundsException();

        elementData[index] = e;
        return true;
    }

    /**
     * remove(int index) 삭제 구현
     */
    public E remove(int index){
        if (index < 0 || index >= pointer) throw new IndexOutOfBoundsException();

        arraySize--;
        Object[] temp = new Object[arraySize];

        for (int i = 0; i < index; i++) {
            temp[i] = elementData[i];
        }
        for (int i = index + 1; i < pointer; i++){
            temp[i-1] = elementData[i];
        }

        E e = (E) elementData[index];
        elementData = temp;
        pointer--;

        return e;
    }

    public int size(){
        return pointer;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int pointer;

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

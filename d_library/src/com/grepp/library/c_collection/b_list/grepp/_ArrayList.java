package com.grepp.library.c_collection.b_list.grepp;

@SuppressWarnings("unchecked")
public class _ArrayList<E> {

    private Object[] elementData;
    private static final int DEFAULT_CAPACIT = 10;
    private int pointer;
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

    public E get(int index){
        if (index < 0 || index >= pointer) throw new IndexOutOfBoundsException("인덱스 범위를 벗어났습니다.");
        return (E) elementData[index];
    }

    public int size(){
        return pointer;
    }

}

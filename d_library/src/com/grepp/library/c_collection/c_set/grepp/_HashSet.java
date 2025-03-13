package com.grepp.library.c_collection.c_set.grepp;

import java.util.Arrays;
import javax.swing.event.CellEditorListener;

public class _HashSet<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private int arraySize = 10;
    private Object[] elementData;
    private int size;

    public _HashSet() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private int hash(E e){
        // hashCode : -21억 ~ +21억
        // 0 ~ 21 억 사이의 값 반환
        int hashCode = Math.abs(e.hashCode());
        return hashCode % arraySize;
    }

    public boolean add(E e){
        // 배열이 가득 차지 않았을 때 배열을 확장
        if (size == arraySize - 1){
            resize();
        }

        int index = hash(e);

        if (elementData[index] != null){
            return false;
        }

        elementData[index] = e;
        size++;
        return true;
    }

    public boolean remove(E e){
        int index = hash(e);
        if (elementData[index] == null) return false;

        elementData[index] = null;
        size--;
        return true;
    }

    @Override
    public String toString(){
       return Arrays.toString(elementData);
    }

    private void resize() {
        arraySize *= 2;
        Object[] temp = new Object[arraySize];

        for (int i = 0; i < arraySize; i++) {
            if(elementData[i] == null) continue;
            int newIndex = hash((E) elementData[i]);
            temp[newIndex] = elementData[i];
        }

        elementData = temp;
    }
}

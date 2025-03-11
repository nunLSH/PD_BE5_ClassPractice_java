package com.grepp.library.c_collection.a_generic;

import com.grepp.library.c_collection.a_generic.domain.Device;

// NOTE A01 : Generic
// 클래스 외부에서 클래스 내부에서 사용할 타입을 결정하는 것.
// 클래스 선언부나 메서드 선언부에 <Generic 매개변수> 를 선언해 사용 가능
// Generic 은 여러개 사용할 수 있다.
public class GenericArray<E> {

    private Object[] elements;
    private int size;
    private int pointer;

    public GenericArray(int size) {
        this.size = size;
        elements = new Object[size];
    }

    public int size(){
        return size;
    }

    // E는 외부에서 결정한 타입의 인스턴스들만 들어갈 수 있음.
    public void add(E e){
        if (pointer == size){
            System.out.println("용량이 부족합니다.");
            return;
        }

        elements[pointer] = e;
        pointer++;
    }

    public E get(int idx){
        if (idx < 0 || idx >= size) throw new IndexOutOfBoundsException();
        return (E) elements[idx];
    }
}

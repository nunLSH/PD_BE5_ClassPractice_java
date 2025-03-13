package com.grepp.library.c_collection.c_set.grepp;

import com.grepp.library.c_collection.z_domain.Node;
import javax.management.NotificationEmitter;
import javax.swing.event.CellEditorListener;
@SuppressWarnings("unchecked")
public class _HashSet_p2<E>  {

    private static final int DEFAULT_CAPACITY = 10;
    private int arraySize = 10;
    protected Object[] elementData;
    private int size;

    public _HashSet_p2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    protected int hash(E e){
        // hashCode : -21억 ~ +21억
        // 0 ~ 21 억 사이의 값 반환
        int hashCode = Math.abs(e.hashCode());
        return hashCode % arraySize;
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

    public boolean add(E e) {
        Node<E> node = new Node<E>(e);

        if (size == arraySize - 1){
            resize();
        }

        int index = hash(e);
        Node<E> head = (Node<E>) elementData[index];

        if(head == null){
            elementData[index] = node;
            size++;
            return true;
        }

        Node<E> link = head;
        while(link.next() != null){
            if(link.equals(node)) return false;
            link = link.next();
        }

        link.setNexT(node);
        size++;
        return true;
    }

    public boolean remove(E e){
        int index = hash(e);
        Node<E> head = (Node<E>) elementData[index];

        if (head.data().equals(e)){
            elementData[index] = head.next();
            size--;
            return true;
        }

        Node<E> prevNode = head;
        Node<E> link = head;

        while(link.next() != null){
            prevNode = link;
            link = link.next();

            if (link.data().equals(e)){
                prevNode.setNexT(link.next());
                size--;
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("[");

        for (int i = 0; i < elementData.length; i++) {
            if(elementData[i] == null) continue;
            Node<E> link = (Node<E>) elementData[i];

            while(link.next() != null){
                sb.append(link.data()).append(",");
                link = link.next();
            }

            sb.append(link.data());
            if(i != elementData.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
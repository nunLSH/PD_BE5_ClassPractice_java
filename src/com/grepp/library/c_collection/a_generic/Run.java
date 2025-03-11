package com.grepp.library.c_collection.a_generic;

import com.grepp.library.c_collection.a_generic.domain.Book;
import com.grepp.library.c_collection.a_generic.domain.Computer;
import com.grepp.library.c_collection.a_generic.domain.Device;
import com.grepp.library.c_collection.a_generic.domain.TV;

public class Run {

    public static void main(String[] args) {

        Book book = new Book("해리포터", "조앤롤링");
        Device computer = new Computer("맥북", "MacOS");
        Device tv = new TV("삼텐바이", 50);

        GenericArray<Device> devices = new GenericArray<>(2);
        devices.add(tv);
        devices.add(computer);

        GenericArray<Book> books = new GenericArray<>(2);
        books.add(book);

        System.out.println(books.get(0));

        for (int i = 0; i < devices.size(); i++){
            devices.get(i).on();
        }
    }
}

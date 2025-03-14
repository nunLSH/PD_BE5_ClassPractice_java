package com.grepp.library.e_record;

public class Run {

    public static void main(String[] args) {
        Book book = new Book("해리포터", "조앤롤링", 5000, true);

        System.out.println(book.title());
        System.out.println(book.author());
        System.out.println(book.price());
        System.out.println(book.activated());

        Book book2 = new Book("해리포터", "조앤롤링", 5000, true);
        System.out.println(book);
        System.out.println(book.equals(book2));

        System.out.println(book);
    }

}

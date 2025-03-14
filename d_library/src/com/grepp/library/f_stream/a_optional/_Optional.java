package com.grepp.library.f_stream.a_optional;

import com.grepp.library.f_stream.a_optional.vo.Book;
import java.util.List;
import java.util.Optional;

// NOTE FA01 Optional
// Null safety : null 로부터 안전한 코드를 작성하는 방법
// null 은 필요한 자료형! 올바르게 처리되지 못한 null 이 위험하다.
public class _Optional {

    private List<Book> books = List.of(
        new Book("해리포터", "조앤롤링", 5000, true),
        new Book("반지의 제왕", "롤킨", 5000, true),
        new Book("비행운", "김애란", 10000, false)
    );

    public Optional<Book> findBook(String title){

        for(Book book : books){
            if(book.title().equals(title)){
                return Optional.of(book);
            }
        }

        return Optional.empty();
    }
}

package com.grepp.library.c_collection.a_generic;

import com.grepp.library.c_collection.a_generic.domain.Book;
import com.grepp.library.c_collection.a_generic.domain.Computer;
import com.grepp.library.c_collection.a_generic.domain.Device;
import com.grepp.library.c_collection.a_generic.domain.SmartPhone;
import com.grepp.library.c_collection.a_generic.domain.TV;

public class Run {

    public static void main(String[] args) {

        Computer mac = new Computer("mac", "apple");
        Computer galaxyBook = new Computer("galaxyBook","intel");
        SmartPhone iphone = new SmartPhone("iphone", "긱벤치", "SKT");
        SmartPhone galaxy = new SmartPhone("galaxy", "intel", "SKT");
        Book book = new Book("해리포터", "조앤롤링");
        TV tv = new TV("삼텐바이", 50);

        GenericArray<Device> devices = new GenericArray<>(2);
        devices.add(tv);
        devices.add(galaxyBook);

        for (int i = 0; i < devices.size(); i++){
            devices.get(i).on();
        }

        GenericArray<Book> books = new GenericArray<>(2);
        books.add(book);
        System.out.println(books.get(0));

        // 제네릭 메서드를 사용할 때는
        // 매개변수, 반환타입을 기반으로 컴파링ㄹ러가 제네릭타입을 추론
        GenericArray<Device> g1 = GenericArray.<Device>practiceGeneric(mac);

        // T extends Device : Device 타입을 가지고 있지 않은 Book은 올 수 없다.
//        GenericArray<Book> g2 = GenericArray.<Book>practiceExtends(book);
        GenericArray<Device> g2 = GenericArray.<Device>practiceExtends(mac);

        // NOTE CA04 generic은 무공변성이다. casting이 안됨.
        // GenericArray<Device>은 GenericArray<Computer> 상위타입이 아님
//        GenericArray<Device> g3 = GenericArray.<Computer>practiceGeneric(mac);

        // NOTE CA05 와일드카드 : ?
        // 제네릭메서드에서는 사용할 수 없다.
        // 상한 경계 : <? extends T>
        // GenericArray<? extends Device> 이 Device 의 후손타입을 제네릭 타입으로 가지는
        // GenericArray<T>에 대해 상위타입이 된다.
        GenericArray<? extends Device> g3 = GenericArray.<Computer>practiceExtends(mac);

        // NOTE CA06 하한 경계
        // <? super T>
        // T 타입의 선조타입
        GenericArray<? super Computer> g4 = GenericArray.<Device>practiceGeneric(mac);

    }
}

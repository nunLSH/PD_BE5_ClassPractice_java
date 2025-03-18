package com.grepp.library.g_io.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class _Properties {

    // NOTE XML (extensible markup language)
    // 확장 가능한 마크업 언어
    // markup language : 데이터를 저장하고 전달하기 위해 디자인된 언어
    // 미리 약속된 tag를 사용해 데이터를 저장하고 식별
    // XML 은 확장가능한 마크업 언어이기 때문에, 사전에 정의된 tag 는 없다. 당사자끼리 약속으로 결정
    // ex) HTML

    // tag : 태그안의 데이터가 어떤 데이터인지 설명
    // <a></a> 태그, <a>(여는 태그), </a>(닫는 태그)

    // <a id="t", href="naver.com">네이버로 이동</a>
    // id, href : 속성
    // 네이버로 이동 : 데이터

    // tag 에 구체적인 속성과 데이터를 부여한 것을 element 라 한다.

    public static void main(String[] args) {
//        studyProperties();
        loadFromXML();
    }

    private static void loadFromXML() {
        Properties prop = new Properties();

        try(FileInputStream fis = new FileInputStream("web.xml")) {
            prop.loadFromXML(fis);

            System.out.println("=== loadFromXML ===");
            System.out.println(prop);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void studyProperties() {

        Properties props = new Properties();

        // C, U
        props.setProperty("DATE", "2025-03-18");
        props.setProperty("PORT", "8080");
        props.setProperty("HOST", "localhost");

        // R
        for(Object key : props.keySet()){
            System.out.println(props.getProperty(key.toString()));
        }

        // D
        props.remove("DATE");
        System.out.println(props);

        // storeToXML
        try(FileOutputStream fos = new FileOutputStream("web.xml")){
            props.storeToXML(fos, "web server properties");
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }


}

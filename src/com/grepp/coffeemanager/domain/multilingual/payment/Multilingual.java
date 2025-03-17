package com.grepp.coffeemanager.domain.multilingual.payment;

import java.util.List;

public class Multilingual {

    private static final List<Language> languages = List.of(Language.SPAIN, Language.CHINA);

    public static List<Language> languages(){
        return languages;
    }
}

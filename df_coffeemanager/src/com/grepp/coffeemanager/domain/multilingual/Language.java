package com.grepp.coffeemanager.domain.multilingual.payment;

public enum Language {

    USA,
    CHINA,
    SPAIN;

    public static PaymentTranslator createPaymentTranslator(Language lang, PaymentTranslator target){
        return switch (lang){
            case USA -> new USAPaymentTranslator(target);
            case CHINA -> new ChinaPaymentTranslator(target);
            case SPAIN -> new SpainPaymentTranslator(target);
            default -> throw new IllegalArgumentException();
        };
    }
}
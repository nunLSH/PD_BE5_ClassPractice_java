package com.grepp.coffeemanager.domain.multilingual.payment;

public abstract class PaymentDecorator implements PaymentTranslator{

    protected PaymentTranslator target;

    public PaymentDecorator(PaymentTranslator target){
        this.target = target;
    }
}
package com.grepp.coffeemanager.domain.multilingual.payment;

import com.grepp.coffeemanager.domain.payment.Payment;

public class SpainPaymentTranslator extends PaymentDecorator{

    public SpainPaymentTranslator(PaymentTranslator target) {
        super(target);
    }

    @Override
    public String translateOrderName() {
        String orderName = target.translateOrderName();
        Payment payment = origin();

        String coffeeCnt = payment.getCoffeeName();
        int orderCnt = payment.getOrderCnt();
        orderName += ", " + orderCnt + "tazes de " + coffeeCnt;
        return orderName;
    }

    @Override
    public String translatePaymentPrice() {
        Payment payment = origin();
        double paymentPrice = payment.getPaymentPrice();
        double eur = paymentPrice / 1400;
        return target.translatePaymentPrice() + " , " + String.format("%.2f eur", eur);
    }

    @Override
    public Payment origin() {
        return target.origin();
    }
}
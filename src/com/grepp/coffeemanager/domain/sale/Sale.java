package com.grepp.coffeemanager.domain.sale;

import static com.grepp.coffeemanager.domain.multilingual.payment.Language.createPaymentTranslator;

import com.grepp.coffeemanager.domain.multilingual.payment.ChinaPaymentTranslator;
import com.grepp.coffeemanager.domain.multilingual.payment.Language;
import com.grepp.coffeemanager.domain.multilingual.payment.Multilingual;
import com.grepp.coffeemanager.domain.multilingual.payment.PaymentTranslator;
import com.grepp.coffeemanager.domain.multilingual.payment.SpainPaymentTranslator;
import com.grepp.coffeemanager.domain.multilingual.payment.USAPaymentTranslator;
import com.grepp.coffeemanager.domain.order.Order;
import com.grepp.coffeemanager.domain.payment.Payment;

public class Sale {

    public PaymentTranslator takeOrder(Order order) {
        order.proceed();
        Payment payment = new Payment(order);
        payment.proceed();
        return generatePaymentTranslator(payment);
    }

    private PaymentTranslator generatePaymentTranslator(Payment payment) {
        PaymentTranslator target = payment;
        for (Language lang : Multilingual.languages()){
            target = Language.createPaymentTranslator(lang, target);
        }

        return target;
    }
}

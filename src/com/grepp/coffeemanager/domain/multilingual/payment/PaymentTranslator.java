package com.grepp.coffeemanager.domain.multilingual.payment;

import com.grepp.coffeemanager.domain.payment.Payment;

public interface PaymentTranslator {

    String translateOrderName();
    String translatePaymentPrice();
    Payment origin();

}

package com.grepp.coffeemanager.domain.payment;

import com.grepp.coffeemanager.domain.account.Account;
import com.grepp.coffeemanager.domain.order.Order;

public class Payment {

    private Order order;
    private int paymentPrice;

    public Payment(Order order) {
        this.order = order;
        this.paymentPrice = order.getOrderPrice();
    }

    public int getPaymentPrice() {
        return paymentPrice;
    }

    public void proceed() {
        Account account = Account.getInstance();
        account.registSales(paymentPrice);
    }
}

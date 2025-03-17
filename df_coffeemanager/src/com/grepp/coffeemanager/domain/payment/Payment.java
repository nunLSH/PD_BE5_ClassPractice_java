package com.grepp.coffeemanager.domain.payment;

import com.grepp.coffeemanager.domain.account.Account;
import com.grepp.coffeemanager.domain.discount.AbsoluteDiscountPolicy;
import com.grepp.coffeemanager.domain.discount.DiscountPolicy;
import com.grepp.coffeemanager.domain.discount.PercentDiscountPolicy;
import com.grepp.coffeemanager.domain.multilingual.payment.PaymentTranslator;
import com.grepp.coffeemanager.domain.order.Order;

public class Payment implements PaymentTranslator {

    private Order order;
    private int paymentPrice;
    public static final DiscountPolicy[] polies = {
        new PercentDiscountPolicy(),
        new AbsoluteDiscountPolicy()
    };

    public Payment(Order order) {
        this.order = order;
        calcPaymentPrice();
    }

    public int getPaymentPrice() {
        return paymentPrice;
    }

    private void calcPaymentPrice(){
        int discountAmount = 0;
        for(DiscountPolicy policy : polies){
            discountAmount += policy.getDiscountAmount(order);
        }
        paymentPrice = order.getOrderPrice() - discountAmount;
    }

    public void proceed() {
        Account account = Account.getInstance();
        account.registSales(paymentPrice);
    }

    public Order getOrder() {
        return order;
    }

    @Override
    public String translateOrderName() {
        return order.getName();
    }

    @Override
    public String translatePaymentPrice() {
        return String.valueOf(paymentPrice);
    }

    @Override
    public Payment origin() {
        return this;
    }

    public String getCoffeeName() {
        return order.getCoffeeName();
    }

    public int getOrderCnt() {
        return order.getOrderCnt();
    }
}
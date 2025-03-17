package com.grepp.coffeemanager.domain.discount;

import com.grepp.coffeemanager.domain.order.Order;

public enum PercentDiscountLevel {
    LEVEL1(5000, 10000, 0.1),
    LEVEL2(10000, 20000, 0.15),
    LEVEL3(20000, 999999, 20);
    private int min;
    private int max;
    private double rate;

    PercentDiscountLevel(int min, int max, double rate) {
        this.min = min;
        this.max = max;
        this.rate = rate;
    }

    public boolean checkRange(Order order){
        return order.getOrderPrice() >= min && order.getOrderPrice() < max;
    }

    public double rate(){
        return rate;
    }
}
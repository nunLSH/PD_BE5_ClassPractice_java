package com.grepp.coffeemanager.domain.discount;

import com.grepp.coffeemanager.domain.order.Order;

public class PercentDiscountPolicy implements DiscountPolicy{

    @Override
    public int getDiscountAmount(Order order) {

        PercentDiscountLevel[] conditions = PercentDiscountLevel.values();
        for (PercentDiscountLevel condition : conditions){
            if (condition.checkRange(order)){
                double discountAmount = order.getOrderPrice() * condition.rate();
                return (int) discountAmount;
            }
        }

        return 0;
    }
}
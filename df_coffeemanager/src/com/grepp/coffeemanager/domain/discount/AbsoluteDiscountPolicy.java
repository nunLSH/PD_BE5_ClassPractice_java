package com.grepp.coffeemanager.domain.discount;

import com.grepp.coffeemanager.domain.order.Order;

public class AbsoluteDiscountPolicy implements DiscountPolicy{

    @Override
    public int getDiscountAmount(Order order) {
        AbsoluteDiscountLevel[] conditions = AbsoluteDiscountLevel.values();
        for (AbsoluteDiscountLevel condition : conditions){
            if (condition.checkRange(order)){
                return condition.amount();
            }
        }
        return 0;
    }
}
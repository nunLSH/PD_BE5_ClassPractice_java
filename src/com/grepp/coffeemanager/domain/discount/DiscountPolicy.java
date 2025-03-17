package com.grepp.coffeemanager.domain.discount;

import com.grepp.coffeemanager.domain.order.Order;

public interface DiscountPolicy {

    int getDiscountAmount(Order order);

}

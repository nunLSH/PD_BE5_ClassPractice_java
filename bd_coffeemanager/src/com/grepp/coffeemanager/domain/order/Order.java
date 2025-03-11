package com.grepp.coffeemanager.domain.order;

import com.grepp.coffeemanager.domain.coffee.Coffee;
import com.grepp.coffeemanager.domain.coffee.SeasonCoffee;
import java.time.LocalDateTime;

public class Order {

    private String name;
    private Coffee coffee;
    private int orderCnt;
    private int orderPrice;
    private LocalDateTime orderTime = LocalDateTime.now();  // 현재 시간
    private OrderStatus status;

    public static Order createOrder(Coffee coffee, int orderCnt){
        Order order = new Order(coffee, orderCnt);
        if(coffee.getStock() < orderCnt) {
            order.status = OrderStatus.FAIL_SEASON;
            return order;
        }

        if (coffee instanceof SeasonCoffee seasonCoffee){
            if (seasonCoffee.notSeason()){
                order.status = OrderStatus.FAIL_SEASON;
                return order;
            }
        }

        order.status = OrderStatus.OK;
        return order;
    }

    private Order(Coffee coffee, int orderCnt) {
        this.coffee = coffee;
        this.orderCnt = orderCnt;
        this.orderPrice = coffee.getPrice() * orderCnt;
        this.name = coffee.getName() + "[" + orderCnt + "]";
    }

    public OrderStatus status(){
        return status;
    }

    public String getName() {
        return name;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public int getOrderCnt() {
        return orderCnt;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void proceed() {
        coffee.provide(orderCnt);
    }
}

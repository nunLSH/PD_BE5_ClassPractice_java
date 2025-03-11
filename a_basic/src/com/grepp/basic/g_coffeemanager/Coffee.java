package com.grepp.basic.g_coffeemanager;

public class Coffee {

    String name;
    int price;
    int cost;
    int stock;
    int safetyStock;
    int salesCnt;

    public Coffee(String name, int price, int cost, int stock, int safetyStock, int salesCnt) {
        this.name = name;
        this.price = price;
        this.cost = cost;
        this.stock = stock;
        this.safetyStock = safetyStock;
        this.salesCnt = salesCnt;
    }
}

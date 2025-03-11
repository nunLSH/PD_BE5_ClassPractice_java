package com.grepp.coffeemanager.domain.coffee;

import com.grepp.coffeemanager.domain.purchase.Purchase;

public class Coffee {

    private String name;
    private int price;
    private int purchasePrice;
    private int stock;
    private int safetyStock;
    private int salesCnt;

    public Coffee(String name, int price, int purchasePrice, int stock, int safetyStock) {
        this.name = name;
        this.price = price;
        this.purchasePrice = purchasePrice;
        this.stock = stock;
        this.safetyStock = safetyStock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getStock() {
        return stock;
    }

    public int getSafetyStock() {
        return safetyStock;
    }

    public int getSalesCnt() {
        return salesCnt;
    }

    public void provide(int orderCnt) {
        // 재고 차감
        deductStock(orderCnt);
        // 판매량 추가
        addSalesCnt(orderCnt);
    }

    private void addSalesCnt(int orderCnt) {
        salesCnt += orderCnt;
    }

    private void deductStock(int orderCnt) {
        stock -= orderCnt;
        checkSafetyStock();
    }

    private void checkSafetyStock() {
        if (stock < safetyStock){
            int purchaseCnt = safetyStock * 2;
            Purchase purchase = new Purchase(this, purchaseCnt);
            purchase.proceed();  // 매입진행
        }
    }

    public void addStock(int purchaseCnt) {
        stock += purchaseCnt;
    }
}

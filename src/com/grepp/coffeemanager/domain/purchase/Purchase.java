package com.grepp.coffeemanager.domain.purchase;

import com.grepp.coffeemanager.domain.account.Account;
import com.grepp.coffeemanager.domain.coffee.Coffee;

public class Purchase {

    private Coffee coffee;
    private int purchaseCnt;

    public Purchase(Coffee coffee, int purchaseCnt) {
        this.coffee = coffee;
        this.purchaseCnt = purchaseCnt;
    }

    public void proceed() {
        Account account = Account.getInstance();
        int purchasePrice = coffee.getPurchasePrice() * purchaseCnt;
        // 매입 금액을 계좌에 등록
        if (account.registExpenses(purchasePrice)){
            System.out.println("* system : " + coffee.getName() + "[" + purchaseCnt + "잔] 매입");
            coffee.addStock(purchaseCnt);
            return;
        }

        System.out.println("* system : 매입에 실패하였습니다.");
        // 커피 재고 추가

    }
}
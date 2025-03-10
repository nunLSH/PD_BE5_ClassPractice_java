package com.grepp.coffeemanager.domain.order;

import com.grepp.coffeemanager.domain.purchase.Purchase;

// NOTE ENUM : 연관된 상수들의 집합
public enum OrderStatus {

     OK(0, "주문 생성 성공"),
     FAIL_SOLD_OUT(1, "재고 부족으로 주문을 취소합니다."),
     FAIL_SEASON(2, "비시즌 입니다.");

    private int code;
    private String desc;

    private OrderStatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public boolean isOk(){
        return code == 0;
    }

    public String desc() {
        return desc;
    }
}
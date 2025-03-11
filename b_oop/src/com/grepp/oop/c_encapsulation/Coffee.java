package com.grepp.oop.c_encapsulation;


// NOTE CCcoffee 01 : 캡슐화
// 모든 속성을 private으로 선언해 클래스 외부와 내부를 구분
// getter/setter
// getter : 속성에 저장된 값을 클래스 외부로 전달
// setter : 속성에 들어갈 값에 대한 검증(validate)

// 클래스 속성에 대한 권한관리
// getter/setter : 속성에 대한 읽고 쓰기 권한
// getter        : 속성에 대한 읽기 권한
//               : 속성을 숨김

public class Coffee {

    // private으로 외부에서 속성으로의 접근을 막음
    private String name;
    private int price;
    private int cost;
    private int stock;
    private int safetyStock;
    private int salsesCnt;

    public Coffee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // getter : 외부에서 접근을 하도록 반환
    // 접근제한자가 public 이므로 어디서든 사용할 있도록 해줌
    public int getCost() {
        return cost;
    }

    // setter : 외부에서 전달받은 값을 넣어주는 역할
    // 우리 속성에 들어갈 값에 대한 사전 검증 가능
    public void setCost(int cost) {
        if (cost < 0) return;
        this.cost = cost;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getSafetyStock() {
        return safetyStock;
    }

    public void setSafetyStock(int safetyStock) {
        this.safetyStock = safetyStock;
    }

    public int getSalsesCnt() {
        return salsesCnt;
    }

    public void setSalsesCnt(int salsesCnt) {
        this.salsesCnt = salsesCnt;
    }

}

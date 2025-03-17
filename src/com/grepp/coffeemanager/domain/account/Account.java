package com.grepp.coffeemanager.domain.account;

public class Account {

    private int balance;
    private int sales;
    private int expenses;
    private static Account instance;

    // NOTE Singleton pattern :
    // 인스턴스를 최초 한번만 생성, 생성한 인스턴스에 접근하기 위한
    // 전역접근점을 제공
    public static Account getInstance(int balance){
        if(instance == null){
            instance = new Account(balance);
        }

        return instance;
    }

    public static Account getInstance(){
        if(instance == null){
            instance = new Account(0);
        }

        return instance;
    }

    private Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int getSales() {
        return sales;
    }

    public int getExpenses() {
        return expenses;
    }

    public boolean registExpenses(int expenses) {
        if(balance < expenses) return false;

        balance -= expenses;
        this.expenses += expenses;
        return true;
    }

    public void registSales(int paymentPrice) {
        balance += paymentPrice;
        sales += paymentPrice;
    }
}
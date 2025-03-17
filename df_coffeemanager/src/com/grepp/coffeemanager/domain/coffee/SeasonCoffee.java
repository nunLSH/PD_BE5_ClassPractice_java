package com.grepp.coffeemanager.domain.coffee;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class SeasonCoffee extends Coffee{

    private Month[] season;

    public SeasonCoffee(String name, int price, int purchasePrice, int stock, int safetyStock,
        Month[] season) {
        super(name, price, purchasePrice, stock, safetyStock);
        this.season = season;
    }

    public boolean notSeason(){
        Month now = LocalDate.now().getMonth();
        for(Month month : season){
            if (month.equals(now)) return false;
        }

        return true;
    }
}
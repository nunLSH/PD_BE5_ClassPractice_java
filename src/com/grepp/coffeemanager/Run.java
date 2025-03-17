package com.grepp.coffeemanager;

import com.grepp.coffeemanager.domain.account.Account;
import com.grepp.coffeemanager.domain.coffee.Coffee;
import com.grepp.coffeemanager.domain.coffee.SeasonCoffee;
import com.grepp.coffeemanager.domain.sale.Sale;
import com.grepp.coffeemanager.presentation.Menu;
import java.time.Month;

public class Run {

    public static void main(String[] args) {
        Coffee americano = new Coffee("americano", 1000, 500, 10, 3);
        Coffee mocha = new Coffee("mocha", 2000, 800, 10, 3);
        Coffee latte = new Coffee("latte", 3000, 1000, 10, 3);
        Coffee frapuccino = new SeasonCoffee("frapuccino", 4000, 2000, 10, 3,
            new Month[]{Month.JUNE, Month.JULY,Month.AUGUST});

        Coffee[] coffees = {americano, mocha, latte, frapuccino};
        new Menu(new Sale(), Account.getInstance(100000), coffees).menu();
    }
}
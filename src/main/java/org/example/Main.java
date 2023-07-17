package org.example;

import org.example.shop_interaction.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop greatShop = new Shop("Best Shop ever", 0);
        Employee nati = new Employee(123, "nati", greatShop, 30000);

        System.out.println(nati);
        System.out.println(greatShop);
        greatShop.hireEmployee(nati);
        System.out.println(greatShop);

        Shopper someone = new Shopper("Elliot", 100);
        System.out.println(someone);

        try{
            someone.purchaseItem("computer", greatShop);
            someone.purchaseItem("chair", greatShop);
        }catch (Exception ex){
            System.out.println("Caught an exception:" + ex.getMessage());
        }
        System.out.println(greatShop);

        ////

        List<APerson> persons = new ArrayList<>() {{add(nati); add(someone); }};

        for( APerson person : persons){
            person.printContactDetails();
        }
    }
}
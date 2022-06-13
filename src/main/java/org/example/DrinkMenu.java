package org.example;

import java.util.HashMap;
import java.util.Map;

public class DrinkMenu {
    Map<String,Integer> drinkshop=new HashMap<>();

    public void addDrinks(String drinks, Integer price) {
        drinkshop.put(drinks,price);
    }
}

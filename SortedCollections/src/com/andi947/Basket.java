package com.andi947;

import java.util.*;

/**
 * Created by Andrea on 2017/05/05.
 */
public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();  // more work than HashMap, because each time it uses the .compareTo()
    }

    public int addToBasket(StockItem item, int quantity){
        if((item != null) && (quantity > 0)){
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
        }
        return 0;
    }

    public Map<StockItem, Integer> items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for(Map.Entry<StockItem, Integer> item : list.entrySet()){
            s = s + item.getKey() + ". " + item.getValue() + " purchased\n";  // StringBuilder.append() ????
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + String.format("%.2f",totalCost);
    }


}

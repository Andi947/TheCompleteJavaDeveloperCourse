package com.andi947;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Andrea on 2017/05/04.
 */
public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();  // alphabetical order but generic Map
    }

    public int addStock(StockItem item){
        if(item != null){
            // check if we already have quantities of this item
            StockItem inStock = list.getOrDefault(item.getName(), item); // get item if it already exists in the map/ or use the item if it doesn't exist
            // If there are already stocks on this item, adjust quantity
            if(inStock != item){
                item.adjustStock(inStock.quantityInStock());
            }

            list.put(item.getName(), item);
            return item.quantityInStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity){
        StockItem inStock = list.getOrDefault(item, null);

        if((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity > 0)){
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem get(String key){
        return list.get(key);
    }

    public Map<String, Double> priceList() {
        Map<String, Double> prices = new LinkedHashMap<>();
        for(Map.Entry<String, StockItem> item : list.entrySet()){
            prices.put(item.getKey(), item.getValue().getPrice());
        }
        return Collections.unmodifiableMap(prices);
    }

    // Read-only view of the Map - any changes throw UnsupportedOperationException
    public Map<String,StockItem> Items(){
        return Collections.unmodifiableMap(list);  // no need to change - no such thing as unmodifiableLinkedHashMap() -> the map passed with be of LinkedHashMap type
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0;
        for(Map.Entry<String,StockItem> item : list.entrySet()){
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

            s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in stock. Value of items: ";
            s = s + String.format("%.2f",itemValue) + "\n";
            totalCost += itemValue;
        }
        return s + "Total stock value " + String.format("%.2f",totalCost);
    }
}

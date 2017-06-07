package com.andi947;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7); // we added items and changed the price
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.Items().keySet()){
            System.out.println(s);
        }

        Basket timsBasket = new Basket("Tim");

        addItemToBasket(timsBasket, "car", 1);
        System.out.println(timsBasket);

        addItemToBasket(timsBasket, "car", 1);
        System.out.println(timsBasket);

        if(addItemToBasket(timsBasket, "car", 1) != 1){
            System.out.println("There are no more cars in stock");
        } else {
            addItemToBasket(timsBasket, "car", 1);
        }

        addItemToBasket(timsBasket, "spanner", 5);

        addItemToBasket(timsBasket, "juice", 4);
        addItemToBasket(timsBasket, "cup", 12);
        addItemToBasket(timsBasket, "bread", 1);

        Basket basket = new Basket("customer");
        addItemToBasket(basket, "cup", 100);
        addItemToBasket(basket, "juice", 5);
        removeItemFromBasket(basket, "cup", 1);
        System.out.println(basket);

        removeItemFromBasket(timsBasket, "car", 1);
        removeItemFromBasket(timsBasket, "cup", 9);
        removeItemFromBasket(timsBasket, "car", 1);
        System.out.println("Cars removed: " + removeItemFromBasket(timsBasket, "car", 1)); // should not remove any

        System.out.println(timsBasket);

        // remove all items from timsBasket
        removeItemFromBasket(timsBasket, "bread", 1);
        removeItemFromBasket(timsBasket, "cup", 3);
        removeItemFromBasket(timsBasket, "juice", 4);
        removeItemFromBasket(timsBasket, "cup", 3);
        System.out.println(timsBasket);

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkOut(basket);
        System.out.println(basket);
        System.out.println(stockList);

//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);
        StockItem car = stockList.Items().get("car"); // testing boundary conditions if there is no stock
        if(car != null) {
            car.adjustStock((2000));
        }
        if(car != null) {
            stockList.get("car").adjustStock(-1000);
        }
        System.out.println(stockList);
//        for(Map.Entry<String, Double> price : stockList.priceList().entrySet()){
//            System.out.println(price.getKey() + " costs " + price.getValue());
//        }

        checkOut(timsBasket);
        System.out.println(timsBasket);
        System.out.println(stockList);

    }

    public static int addItemToBasket(Basket basket, String item, int quantity){
        // retrieve the item from the stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.reserveStock(item, quantity) != 0){  // assumption that it was ok
            return basket.addToBasket(stockItem, quantity);  // only once to add to basket
        }
        return 0;
    }

    public static int removeItemFromBasket(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(basket.removeFromBasket(stockItem, quantity) == quantity){
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    // customer decides to purchase the items
    // loops through the items in basket using unmodifiable map returned by items()
    // for each item it calls the sellStock() [StockList]
    // once all are sold, it then clears the basket completely
    public static void checkOut(Basket basket){
        for(Map.Entry<StockItem, Integer> item : basket.Items().entrySet()){
            stockList.sellStock(item.getKey().getName(), item.getValue());  // would write exception here if sellStock returns 0
        }
        basket.clearBasket();
    }
}

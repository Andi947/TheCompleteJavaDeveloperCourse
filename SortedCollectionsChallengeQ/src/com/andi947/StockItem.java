package com.andi947;

/**
 * Created by Andrea on 2017/05/04.
 */
public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityInStock; // = 0; can be initialised later or here
    private int quantityReserved;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityInStock = 0; // or here (but you wouldn't normally do both).
        this.quantityReserved = 0;
    }

    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;

        this.price = price;
        this.quantityInStock = quantityInStock;
        this.quantityReserved = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

//    Returns the quantity in stock less the stock that was reserved
    public int availableQuantity() {
        return quantityInStock - quantityReserved;
    }

    public int getQuantityReserved() {
        return quantityReserved;
    }

    public void setPrice(double price) {
        if (price > 0.0) {   // validation
            this.price = price;
        }
    }

    // adds stock to be reserved to the reserved stock field ... returns the quantity to show success or not
    // as we shouldn't update basket, unless the stock can be reserved and thus is in reserve stock
    public int reserveStock(int quantity){
        if(quantity <= this.availableQuantity()){
            this.quantityReserved += quantity;
            return quantity;
        }
        return 0;
    }

    // removes stock to that was reserved
    public int unreserveStock(int quantity){
        if(quantity <= this.quantityReserved){
            this.quantityReserved -= quantity;
            return quantity;
        }
        return 0;
    }

//  finalises the total stock quantity by removing what was reserved for purchase
    public int finaliseStock(int quantity){
        if(quantity <= quantityReserved){
            this.quantityInStock -= quantity;
            this.quantityReserved -= quantity;
            return quantity;
        }
        return 0;
    }

    public void adjustStock(int quantity){
        int newQuantity = this.quantityInStock + quantity;
        if(newQuantity >= 0){   // validation
            this.quantityInStock = newQuantity;
        }
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem.equals");
        if(obj == this){
            return true;
        }

        if((obj == null ) || (obj.getClass() != this.getClass())){
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
//        System.out.println("Entering StockItem.compareTo");
        if(this == o){
            return 0;
        }

        if(o != null){
            return this.name.compareTo(o.getName());
        }
        throw new NullPointerException();  // if you want to use compareTo - we are not going to compare something that is null
    }

    @Override  // reserved from all baskets for that item
    public String toString() {
        return this.name + " : price " + this.price + ". Reserved: " +  this.quantityReserved;
    }
}

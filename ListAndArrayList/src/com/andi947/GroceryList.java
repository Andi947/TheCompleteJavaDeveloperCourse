package com.andi947;

import java.util.ArrayList;

/**
 * Created by Andrea on 2017/02/14.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i=0;i<groceryList.size(); i++ ){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){  // method overloading
        int position = findItem(currentItem.toLowerCase());
        if(position>=0){
            modifyGroceryItem(position, newItem);
        }
    }
    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem.toLowerCase());
        System.out.println("Grocery item has been modified to " + newItem);
    }

    public void removeGroceryItem(String item){
        int position = findItem(item.toLowerCase());
        if(position>=0){
           removeGroceryItem(position);
        } else{
            System.out.println(item + " is not on the list");
        }
    }
    private void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("You have removed " + theItem + " from the grocery list");
    }

    public boolean isItemOnList(String searchItem){
        int position = findItem(searchItem.toLowerCase());
        if(position >= 0){
            return true;
        }
        return false;
    }
    private int /*String*/ findItem(String searchItem){
        return groceryList.indexOf(searchItem.toLowerCase());  // should return an integer
//        boolean exists = groceryList.contains(searchItem);
//        int position = groceryList.indexOf(searchItem);
//        if(position >=0){
//            return groceryList.get(position);
//        }
//        return null;
    }

}

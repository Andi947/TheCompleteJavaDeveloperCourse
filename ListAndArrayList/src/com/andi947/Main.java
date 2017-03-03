package com.andi947;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");   // \t = tab function
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine().toLowerCase());
    }

    public static void modifyItem(){
        System.out.print("Enter item you want to modify: ");
        String currentItem = scanner.nextLine().toLowerCase();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine().toLowerCase();
        groceryList.modifyGroceryItem(currentItem, newItem); // array lists start @0, but human lists @1, thus -1
    }

    public static void removeItem(){
        System.out.print("Enter item to remove: ");
        String item = scanner.nextLine().toLowerCase();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem(){
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine().toLowerCase();
        if (groceryList.isItemOnList(searchItem)){
            System.out.println("Found " + searchItem + " on our grocery list");
        } else{
            System.out.println(searchItem + " is not on the shopping list");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();  // quick way to copy the groceryList

        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList()); // shortcut to above

        String[] myArray = new String[groceryList.getGroceryList().size()];  // convert arrayList to regular array
        myArray = groceryList.getGroceryList().toArray(myArray); // converts obj(groceryList.getGroceryList()) to array format

        // look at documentation to see how code has been built in to Java for you to use
    }
}


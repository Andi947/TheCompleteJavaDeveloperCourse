package com.andi947;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone contactList = new MobilePhone();

    public static void main(String[] args) {
        // Create a program that implements a simple mobile phone with the following capabilities:
        //      Able to store, modify, remove and query contact names (MOBILEPHONE class)
        // You will want to create a separate class for Contacts (name and phone number)
        // Create a master class (MobilePhone) that holds the ArrayList of Contacts
        // The MobilePhone class has the functionality listed above
        // Add a menu of options that are available
        // Options: Quit, print list of contacts, add new contact, update existing contact, remove contact
        // and search/find contact
        // When adding or updating be sure to check if the contact already exists (use name)
        // Be sure not to expose the inner workings of the ArrayList to MobilePhone
        // e.g. no ints, no .get(i), etc
        // MobilePhone should do everything with Contact objects only

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("retard");
            }
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    contactList.printContactsList();
                    break;
                case 2:
                    storeContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
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
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add new contact to the list.");
        System.out.println("\t 3 - To update an existing contact in the list.");
        System.out.println("\t 4 - To remove an existing contact from the list.");
        System.out.println("\t 5 - To search/find a contact in the list.");
        System.out.println("\t 6 - To process a new list of contacts.");
        System.out.println("\t 7 - To quit the application.");
    }

   public static void storeContact(){
        System.out.print("Please enter the contact's name: ");
        String name = scanner.nextLine().toLowerCase();
        System.out.print("Please enter the contact's 10-digit phone number: ");
        String phoneNumber = scanner.nextLine().toLowerCase();
        contactList.storeContact(name, phoneNumber);
    }

    public static void updateContact(){
        System.out.print("Enter name you want to modify: ");
        String currentContactName = scanner.nextLine().toLowerCase();
        System.out.print("Enter replacement item: ");
        String updatedContactName = scanner.nextLine().toLowerCase();
        System.out.print("Please enter the contact's 10-digit phone number: ");
        String updatedPhoneNumber = scanner.nextLine().toLowerCase();
        contactList.updateContacts(currentContactName, updatedContactName, updatedPhoneNumber); // array lists start @0, but human lists @1, thus -1
    }

    public static void removeContact(){
        System.out.print("Enter item to remove: ");
        String item = scanner.nextLine().toLowerCase();
        contactList.removeContact(item);
    }

    public static void queryContact(){
        System.out.print("Item to search for: ");
        String searchContact = scanner.nextLine().toLowerCase();
        if (contactList.isContactOnList(searchContact)){
            System.out.println("Found " + searchContact + " on your mobile phone.");
        } else{
            System.out.println(searchContact + " is not on your mobile phone");
        }
    }

    public static void processArrayList(){
//        ArrayList<String> newArray = new ArrayList<String>();  // quick way to copy the groceryList
//
//        newArray.addAll(contactList.getContacts());
//
//        ArrayList<String> nextArray = new ArrayList<String>(contactList.getContacts()); // shortcut to above
//
//        String[] myArray = new String[contactList.getContacts().size()];  // convert arrayList to regular array
//        myArray = contactList.getContacts().toArray(myArray); // converts obj(groceryList.getGroceryList()) to array format
//
//        // look at documentation to see how code has been built in to Java for you to use
   }
}

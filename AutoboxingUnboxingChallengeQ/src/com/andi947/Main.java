package com.andi947;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("ING");
    public static void main(String[] args) {

        Bank test = new Bank("myBank");

        if(test.getBankName().equals("myBank") ==false)
        {
            System.out.println("I DO NOT WORK");
        }



        // Your job is to create a simple banking application
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each branch should have an arrayList of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        //      Name, and the ArrayList of doubles
        // Branch:
        //      Need to be able to add a new customer and initial transaction amount
        //      Also needs to add additional transactions for that customer/branch
        // Bank:
        //      Add a new branch
        //      Add a customer to that branch with initial transaction
        //      Add a transaction for an existing customer for that branch
        //      Show list of customers for a particular branch and optionally a list oof their transactions
        // Demonstrate autoboxing and unboxing in your code
        // Add data validation
        //      e.g. check if exists, or does not exist etc
        // Think about where you are adding the code to perform certain actions.

        boolean quit = false;
        startBankingApp();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("\nExiting...");
                    quit = true;
                    break;

                case 1:
                    addBranch();
                    break;

                case 2:
                    addNewCustomer();
                    break;

                case 3:
                    addNewTransaction();
                    break;

                case 4:
                    bank.printBranchList();
                    break;

                case 5:
                    bank.printCustomerList();
                    break;

                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addBranch(){
        System.out.print("Enter new branch name: ");
        String branchName = scanner.nextLine();
        bank.addBranch(branchName);
    }

    private static void addNewCustomer(){
        bank.printBranchList();
        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();
        System.out.print("Enter new customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        bank.addCustomer(branchName, name, amount);
    }

    private static void addNewTransaction(){
        System.out.print("Enter existing customer name: ");
        String name = scanner.nextLine();
        int index = bank.findCustomer(name);
        if (index < 0){
            System.out.println("Contact not found.");
            return;
        }
        System.out.print("Enter transaction amount: ");
        double amount = scanner.nextDouble();
        bank.addTransaction(name, amount);

    }

    private static void startBankingApp(){
        System.out.println("Starting application...");
    }

    private static void printActions(){
        System.out.println("\nAvailable actions: \npress");
        System.out.println( "0 - to exit application\n" +
                "1 - to add a branch \n" +
                "2 - to add a new customer with deposit \n" +
                "3 - to add a new transaction for existing customer\n" +
                "4 - to print branch list\n" +
                "5 - to print customer list \n" +
                "6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }


}

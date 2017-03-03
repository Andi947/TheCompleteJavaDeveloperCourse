package com.andi947;

import java.util.ArrayList;

/**
 * Created by Andrea on 2017/02/21.
 */
public class Branch {
    private ArrayList<Customer> customers;
    private String branchName;

    public Branch(String branchName) {
        this.customers = new ArrayList<Customer>();
        this.branchName = branchName;
    }

    public static Branch createBranch(String name){
        Branch branch = new Branch(name);
        return branch;
    }

    public boolean addCustomer(String name, double amount){
//        System.out.println(name);
//        if(findCustomer(name) == -2){
//            System.out.println("customer obj is null");
//        }
//        if(findCustomer(name) == -3){
//            System.out.println("customer.getCustomerName() is null");
//        }
        if(findCustomer(name) >= 0){
            System.out.println("Customer is already on file.");
            return false;
        }
        customers.add(Customer.createCustomer(name, amount));
        System.out.println("New customer added: \n" +
                "\t name -> " + name + "\n" +
                "\t deposit -> " + amount);
        return true;
    }

    public void printCustomerList(){
        System.out.println("Customer List");
        for(int i=0; i<this.customers.size(); i++){
            System.out.println((i + 1) + ". " + this.customers.get(i).getCustomerName() + " -> " +
                    this.customers.get(i).getTransactions());
        }
    }

    public int numberOfCustomers(){
        int totalCustomers = this.customers.size();
        return totalCustomers;
    }

    public boolean addTransaction(String name, double amount){
        int index = findCustomer(name);
        if(index >= 0){
            customers.get(index).addTransaction(amount);
            System.out.println("Transaction successful: \n" +
                    name + " added " + amount + " to their account");
            return false;
        }
        return true;
    }

    public int findCustomer(String name){
//        System.out.println(name);
        for(int i=0; i<customers.size(); i++){
            Customer customer = customers.get(i);
            if(customer == null){
                System.out.println("Customer was null");
                return -2;
            } if(customer.getCustomerName() == null){
                return -3;
            }
            if(customer.getCustomerName().equals(name)){    //customer is returning null
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getBranchName() {
        return branchName;
    }
}

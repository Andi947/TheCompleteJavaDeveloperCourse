package com.andi947;

import java.util.ArrayList;

/**
 * Created by Andrea on 2017/02/21.
 */
public class Customer {
    private ArrayList<Double> transactions;
    private String customerName;

    public Customer(String customerName) {
        this.transactions = new ArrayList<Double>();
        this.customerName = customerName;
    }

    public static Customer createCustomer(String name, double deposit){
//        System.out.println(name);
        Customer customer = new Customer(name);
        customer.transactions.add(Double.valueOf(deposit));
        return customer;
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getCustomerName() {
        return customerName;
    }
}

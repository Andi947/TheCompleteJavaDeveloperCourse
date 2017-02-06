package com.andi947;

/**
 * Created by Andrea on 2017/02/03.
 */
public class VIPCustomer {   // Tim called his VIPPerson

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VIPCustomer(){
        this("Default name", 1000.00, "Default email address");   // may be nice to ensure character use is correct: default@gmail.com
        System.out.println("This was an empty constructor");
    }

    public VIPCustomer(String name, double creditLimit){
        this(name, creditLimit, "Default email address");  // default@gmail.com
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VIPCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("This is a complete constructor");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

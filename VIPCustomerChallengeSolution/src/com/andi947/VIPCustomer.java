package com.andi947;

/**
 * Created by Andrea on 2017/02/03.
 */
public class VIPCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VIPCustomer() {
        this("Default name", 50000.00, "default@email.com");
        this.name = name;
    }

    public VIPCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@gmail.com");
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VIPCustomer(String name, double creditLimit, String emailAddress) {

        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
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

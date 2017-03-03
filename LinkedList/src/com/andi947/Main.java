package com.andi947;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);

        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());


        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i=0; i<intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1,2);  //inserted, other positions moved over
        // not a big deal with small ArrayList size; but with larger = slower = > processing
        // same with removal -> positions move up to fill up the space

        for(int i=0; i<intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }


    }
}

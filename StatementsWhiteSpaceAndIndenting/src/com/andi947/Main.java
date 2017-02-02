package com.andi947;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;
        if (myVariable == 50) {
            System.out.println("Printed");
        }
        myVariable++;
        myVariable--;

        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " still more.");
        System.out.println("This is" + " another" + " still more."); // this is the same as above

        int anotherVariable = 50;
        myVariable--; // this is the same as below
        //int anotherVariable = 50;
        //myVariable--;

        //Challenge
    }
}

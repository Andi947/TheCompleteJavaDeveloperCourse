package com.andi947;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 5 / 2;
	    float myFloatValue = 5f / 3f; // float has 7 decimal points
	    double myDoubleValue = 5d / 3d; // double has 16 decimal points

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //Challenge:
        // convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable
        // 3. Print out the result
        //
        // NOTES: 1 pound = 0.45359237 kilograms

        double numPounds = 200d;
        double numKilograms = numPounds * 0.45359237d;
        System.out.println("200 Pounds is equal to " + numKilograms + " Kilograms");
    }
}

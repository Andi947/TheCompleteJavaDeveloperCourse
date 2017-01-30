package com.andi947;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue=-2_147_483_648; // -2147483649 is too large a number; literal = fixed number
        int myMaxValue=2_147_483_647; //2147483648 is too large a number; expression = a*b
        int myTotal = (myMinValue/2);

        // byte has a width of 8
        byte myByteValue = -128; // 127 is the largest
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short myShortValue = -32_768; // 32_767 is the largest
        short myNewShortValue = (short) (myShortValue/2);

        // long has a width of 64
        long myLongValue = 100L; // 2^63L - must have L at the end of the number

        //Challenge:
        //1. Create a byte variable and set it to any valid byte number
        //2. Create a short variable and set it to any valid short number
        //3. Create an int variable and set it to any valid int number
        //4. Create a variable of type long, and make it equal to 50000 +
        //   10 times the sum of the byte, plus the short, plus the int

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = 50000L + 10L*(myByte+myShort+myInt);
        short shortTotal = (short) (1000 + 10 * (myByte+myShort+myInt));
        System.out.println("longTotal = " + myLong);
        System.out.println("shortTotal = " + shortTotal);
    }
}

package com.andi947;

public class Main {

    public static void main(String[] args) {
	    char myChar = '\u00A9'; // can only take a single character or a unicode
        System.out.println("Unicode output was: " + myChar);

        boolean myBoolean = true; // or false
        boolean isMale = true;

        //Challenge:
        // 1. Find the code for the registered symbol on the same line as the copyright symbol
        // 2. Create a variable of type char and assign it the unicode value for that symbol
        // 3. Display it on screen

        char registeredSymbol = '\u00AE';
        System.out.println("The registered symbol is: " + registeredSymbol);
    }
}

package com.andi947;

public class Main {

    public static void main(String[] args) {
	    // a mile = 1.609344km
        double kilometres = (100 * 1.609344); //100 miles converted to km
        int highscore = 50;

        if(highscore == 50){
            System.out.println("This is an expression");
        }
        // Challenge:
        // In the following code that I will type below, write down what parts
        // of the code are expressions.

        int score = 100;
        if(score > 99) {
            System.out.println("You got the high score");
            score = 0;
        }
    }
}

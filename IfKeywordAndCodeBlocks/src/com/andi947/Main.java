package com.andi947;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 800;
	    int levelCompleted = 5;
	    int bonus = 100;

        if(gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // int savedFinalScore = finalScore; can't access final score as it is in the code block

        if(gameOver){  // means the same as ==true
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);

        }

        // Challenge:
//            Print out a second score on the screen with the following:
//            score = 10000
//            levelCompleted = 8
//            bonus = 200
//            But make sure the first printout above still displays as well

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver) {  // means the same as ==true
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


//      if(score == 5000)
//            System.out.println("Your score was 5000");
//
//	    if(score == 5000) {
//            System.out.println("Your score was 5000");
//            System.out.println("This was executed");
//        }
//
//        if(score < 5000){
//            System.out.println("Your score was less than 5000");
//        } else {
//            System.out.println("Got here");
//        }
//
//        if(score <= 5000){
//            System.out.println("Your score was less than 5000");
//        } else {
//            System.out.println("Got here");
//        }
//
//        if(score < 5000 && score > 1000)  {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if(score < 1000){
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

    }
}

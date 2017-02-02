package com.andi947;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highscore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highscore);

        highscore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highscore);

        // Challenge:
        // Create a method called displayHighScorePosition
        // it should have player name as parameter, and 2nd parameter as a position in the highscore table
        // you should display the player's name along with a message like " managed to get into position "
        // and the position they got and a further message " on the high score table."
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // the return data should be:
        // 1 if the score is > 1000
        // 2 if the score is > 500 and < 1000
        // 3 if the score is > 100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // score of 1500, 900, 400, and 50
        //

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Tina", position);
        //String playerName = "Tina";
        //int playerScore = 1500;
        //int position = calculateHighScorePosition(playerScore);
        //displayHighScorePosition(playerName, position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Sue", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Rachel", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Jane", position);

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) {
            return 1;
        } if(playerScore >=500 && playerScore < 1000 ) { // "else if" is suitable here too
            return 2;
        } if(playerScore >= 100 && playerScore < 500) {
            return 3;
        }
        return 4;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {  // means the same as ==true
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } //else {
        //return -1;
        //}

        return -1;

    }

}

package com.andi947;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Andi", 500);
        System.out.println("New score is " + newScore);
        calculateScore(500);
        calculateScore();

        System.out.println(459%12);

        calcFeetAndInchesToCentimeters(3, 7);
        calcFeetAndInchesToCentimeters(0);

    }

    // Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters
    // feet is te first, inches is the 2nd
    //
    // You should validate that the 1st # is >=0
    // You should validate that the 2nd # is >=0 && <=12
    // return -1 from the method if either is false
    //
    // If the parameters are valid, then calculate how many centimeters
    //comprise the feet and inches passed to this method and return value
    //
    // Create a 2nd method of the same name but with one parameter inches
    // validate that it is >=0
    // return -1 if false
    // But if valid, then calc how many feet are in the inches'
    // call the other overloaded method passing the correct feet and inches
    // calcualted so that it can calculate correctly
    // hints:
    // Use double for datatypes
    // 1 inch = 2.54cm; 1 foot = 12 inches
    // use the link provided to confirm code is calculating correctly
    // calling another overloaded method requires the correct # of parameters used

    // public static double calcFeetAndInchesToCentimeters(double feet, double inches){
    //    if((feet >=0) && (inches >=0) && (inches <12)) {
    //      double centimeters = (feet * 12)*2.54;
    //      centimeters += inches * 2.54;
    //      System.out.println(feet + " feet, " + inches + " inches equals " + centimeters + "cm.");
    //
    //      return centimeters
    //      }
    //    return -1
//}

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet <0) || (inches <0) || (inches >12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
            }
        double centimeters = (inches * 2.54) + ((feet * 12)*2.54);
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + "cm.");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches <0) {
            System.out.println("Invalid inches parameter");
            return -1;
        }
        double feet = (int)inches/12;
        double remainingInches = (int) inches%12;
                //(((inches/12)-feet)*12);
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches.");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);

    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }

}

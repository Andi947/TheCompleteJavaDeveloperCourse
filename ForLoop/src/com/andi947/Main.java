package com.andi947;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            System.out.println("Loop " + i + " hello!");
        }
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        // Using the for statement, call the calculateInterest method with
        // the amount of 10,000 with an interestRate of 2, 3, 4, ,5, 6, 7, and 8
        // and print the result to the console window
//
        for (double i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }

        System.out.println();
        // How would you modify the for loop above to do the same thing as shown
        // but to start from 8% and work back to 2%?

        for (double i = 8; i >= 2; i--) {  //while i is greater than or equal to, keep running the code, when it is no longer, then break
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000, i)));
        }
        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is, print out and increment a count of the number of prime no.s
        // If that count is 3 exit the for loop
        // hint: Use the break; statement to exit

        int countPrime = 0;
        for (int i=10; i < 50; i++) {
            if (isPrime(i)) {
                countPrime++;
                System.out.println(i + " is a prime number");
                if (countPrime == 10) {
                    System.out.println("Exiting for-loop");
                    break;
                }
            }
        }
    }



    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for(int i=2; i <= (long) Math.sqrt(n); i++) {   // replace n/2 with (long) Math.sqrt(n) = optimized code (reduces the amount of times the code loops)
            System.out.println("Looping " + i);
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}

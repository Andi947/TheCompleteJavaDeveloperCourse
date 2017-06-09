package com.andi947;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by Andrea on 2017/06/09.
 */
public class Example {

    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch(ArithmeticException | NoSuchElementException e){ // bitwise inclusive or (|)
            System.out.println(e.toString());  // caught the error in main method and was performed
            System.out.println("Unable to perform division, autopilot shutting down");
        }
    }

    private static int divide(){ // throw exception if int / 0 (ArithmeticException)
        int x, y;
//        try{
        x = getInt();
        y = getInt();
        System.out.println("x is " + x + ", y is " + y);
        return x / y;
//        } catch(NoSuchElementException e){
//            throw new ArithmeticException("no suitable input");
//        } catch(ArithmeticException e){
//            throw new ArithmeticException("attempt to divide by zero");
//        }
    }

    private static int getInt(){  // throw exception if no int available (InputMismatchException) or invalid element e.g.ctrl+D (NoSuchElementException)
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        while(true){
            try{
                return s.nextInt();
            } catch(InputMismatchException e){
                // go round again. Read past the end of line in the input first
                s.nextLine();
                System.out.println("Please enter a number using only the digits 0 to 9 ");
            }
        }
    }
}

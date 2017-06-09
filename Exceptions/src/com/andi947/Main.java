package com.andi947;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int x = 98;
//        int y = 0;
//        System.out.println(divideLBYL(x, y));
//        System.out.println(divideEAFP(x, y));
//        System.out.println(divide(x, y));
        int x = getIntEAFP();
        System.out.println("x is " + x);
    }

    private static int getInt(){
        System.out.println("Please enter a number: \n");
        Scanner s = new Scanner(System.in);  // type anything other than int -> doesn't handle exception
        return s.nextInt();  // returns int that has been typed
    }

    private static int getIntLBYL(){   // checks if input is not a digit and if it is, returns 0; else returns digit
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Please enter an integer: ");
        String input = s.next();
        for(int i=0; i<input.length(); i++){
            if(!Character.isDigit(input.charAt(i))){
                isValid = false;
                break;
            }
        }
        if(isValid){
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP(){  // if exception is thrown, returns 0; else returns valid digit
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");  // more elegant and more efficient
        try{
            return s.nextInt();
        } catch (InputMismatchException e){
            return 0;
        }
    }

    private static int divideLBYL(int x, int y){
        if(y!=0){
            return x/y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y){  // can cope if divide by zero by catching the exception
        try{
            return x/y;
        } catch(ArithmeticException e){
            return 0;
        }
    }

    private static int divide(int x, int y){
        return x/y;
    }
}

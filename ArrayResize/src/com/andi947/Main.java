package com.andi947;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10];  // array of 10 elements

    public static void main(String[] args) {
        System.out.println("Enter 10 integers: ");
        getInput();
        printArray(baseData);
        resizeArray();
//        System.out.println("Enter 12 integers: ");
//        getInput();
        baseData[10] = 67;
        baseData[11] = 34;
        printArray(baseData);
    }

    private static void getInput(){                 // purpose - get data from console and save it into the array
        for(int i = 0; i < baseData.length; i++){   // using baseData which is variable we've defined in the above class
            baseData[i] = s.nextInt();
        }
    }

    private static void printArray(int[] arr){      // purpose - print out array contents
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void resizeArray() {             // purpose - takes copy of original array and creates new array,
        int[] original = baseData;                  // changes the size and then takes each element from original array
        // that we took a copy of & stores back in new array
        baseData = new int[12];
        for(int i=0; i<original.length; i++){
            baseData[i] = original[i];
        }
    }
}

// A base way of resizing is: you save the original array first into another variable, initialise variable with new int
// or new array; and then you go through a loop and copy the original values
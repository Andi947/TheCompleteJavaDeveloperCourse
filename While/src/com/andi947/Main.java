package com.andi947;

public class Main {

    public static void main(String[] args) {
//	    int count = 1;
//	    while(count != 6){
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println();
//        count = 1;
//        while(true) {
//	        if (count == 6){
//	            break;
//            } else {
//                System.out.println("Count value is " + count);
//                count++;
//            }
//        }
//
//        System.out.println();
//        count = 6;
//        // always executed at least once
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if (count > 100) {
//                break;
//            }
//
//        } while(count !=6);


//        My solution to the Challenge:

//        int count = 0;
//        int n = 5;
//        int endN = 20;
//
//        while(n <= endN) {
//            if(count < 5){
//                if (!isEvenNumber(n)) {
//                        n++;
//                        continue;
//                }
//
//                System.out.println(n + " is an even number.");
//                n++;
//                count ++;
//            } else {
//                break;
//            }
//        }
//
//        System.out.println("There were " + count + " even numbers found");

//        Tim's Solution to Challenge:
        int count = 0;
        int n = 5;
        int endN = 20;

        while(n <= endN) {
            if (!isEvenNumber(n)) {
                n++;
                continue;
            }
            System.out.println(n + " is an even number.");
            n++;

            count++;
            if(count >= 5){
                break;
            }
        }

        System.out.println("There were " + count + " even numbers found");
//
        // Challenge:
        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found
    }

// Challenge:
// Create a method called isEvenNumber that takes a parameter of type int
//    It's purpose is to determine if the argument passed to the method
//    an even number or not.
//    return true if an even number, otherwise return false

    public static boolean isEvenNumber(int n){
        if(n % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

}


//Code won't show output because criteria has been pre-met
//int count = 6;
//while(count != 6){
//System.out.println("something");
//count++;
//}

//for(int i=6; i!=6; i++){
//System.out.println("Something);
//}
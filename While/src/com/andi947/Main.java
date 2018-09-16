package com.andi947;

public class Main {

    public static void main(String[] args) {
//	    int number = 1;
//	    while(number != 6){
//            System.out.println("Count value is " + number);
//            number++;
//        }
//
//        System.out.println();
//        number = 1;
//        while(true) {
//	        if (number == 6){
//	            break;
//            } else {
//                System.out.println("Count value is " + number);
//                number++;
//            }
//        }
//
//        System.out.println();
//        number = 6;
//        // always executed at least once
//        do {
//            System.out.println("Count value was " + number);
//            number++;
//
//            if (number > 100) {
//                break;
//            }
//
//        } while(number !=6);


//        My solution to the Challenge:

        int myCount = 0;
        int myN = 5;
        int myEndN = 20;

        while(myN <= myEndN) {
            if(myCount < 5){
                if (!isEvenNumber(myN)) {
                        myN++;
//                        continue;
                }

                System.out.println(myN + " is an even number.");
                myN++;
                myCount ++;
            } else {
                break;
            }
        }

        System.out.println("There were " + myCount + " even numbers found");

        System.out.println();
//        Tim's Solution to Challenge: Better coz easier to read, remove continue, avoid do-while, if-else
        int number = 0;
        int evenNumbersFound = 5;
        int finishNumber = 20;

        while(evenNumbersFound <= finishNumber) {
            if (!isEvenNumber(evenNumbersFound)) {
                evenNumbersFound++;
                continue;
            }
            System.out.println(evenNumbersFound + " is an even number.");
            evenNumbersFound++;

            number++;
            if(number >= 5){
                break;
            }
        }

        System.out.println("There were " + number + " even numbers found");
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
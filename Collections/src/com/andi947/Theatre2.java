package com.andi947;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Andrea on 2017/04/26.
 */
public class Theatre2 {
//    private final String theatreName;
//    public List<Seat2> seats = new ArrayList<>();
//
//    public Theatre2(String theatreName, int numRows, int seatsPerRow) {  // name of theatre, number of rows and number of seats per row
//        this.theatreName = theatreName;
//
//        int lastRow = 'A' + (numRows-1);
//        for(char row = 'A'; row <= lastRow; row++){  // increases letter by the number of rows present
//            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){  // increases the seat number by the number of seats per row
//                Seat2 seat = new Seat2(row + String.format("%02d", seatNum));  // creates the seat by assigning the seatNum of that letter
//                seats.add(seat);   // creation of seats for the theatre  // adds it to the seats ArrayList
//            }
//        }
//    }
//
//    public String getTheatreName() {
//        return theatreName;
//    }
//
//    public boolean reserveSeat(String seatNumber){   // brute force search - scans every element until it finds the one we want
//        Seat2 requestedSeat = new Seat2(seatNumber);
//        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
//        if(foundSeat >= 0){
//            return seats.get(foundSeat).reserve();
//        } else {
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//    }
//
//    // for testing
//    public void getSeats(){
//        for(Seat2 seat : seats){
//            System.out.println(seat.getSeatNumber());
//        }
//    }
//
//    // InnerClass of TheatreSimple
//    public class Seat2 implements Comparable<Seat2>{
//        private final String seatNumber;
//        private boolean reserved2 = false;
//
//        public Seat2(String seatNumber) {
//            this.seatNumber = seatNumber;
//        }
//
//        public boolean reserve(){
//            if(!this.reserved2){
//                this.reserved2 = true;
//                System.out.println("Seat " + seatNumber + " reserved");
//                return true;
//            } else {
//                return false;
//            }
//        }
//
//        public boolean cancel(){
//            if(this.reserved2){
//                this.reserved2 = false;
//                System.out.println("Reservation of seat " + seatNumber + "cancelled");
//                return true;
//            } else {
//                return false;
//            }
//        }
//
//        public String getSeatNumber() {
//            return seatNumber;
//        }
//
//        @Override   // Binary Search ( +1 = seat positioned before this; -1 = after this; 0 = seat == this)
//        public int compareTo(Seat2 seat) {
////            System.out.print(".");
//            return this.seatNumber.compareTo(seat.getSeatNumber());
//        }
//    }
}

//Binary Search source code adapted for out program:

//int low = 0;
//int high = seats.size()-1;
//
//while(low<= high){
//    System.out.print(".");
//    int mid = (low + high)/2;
//    Seat midVal = seats.get(mid);
//    int cmp = midVal.getSeatNumber().compareTo(seatNumber);
//
//    if(cmp < 0){
//        low=mid+1;
//    } else if(cmp>0){
//        high = mid-1;
//    } else {
//        return seats.get(mid).reserve();
//    }
//}
//System.out.println("There is no seat " + seatNumber);
//return false;

// From main():
//Theatre theatre = new Theatre("Olympian", 8, 12);
//List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);  // shallow copy / modify by reserving - will change the copy as well
//printList(seatCopy);  // seatCopy is the same shared object of theatre constructed
//
//seatCopy.get(1).reserve();  // reserving seat using copy of arraylist
//if(theatre.reserveSeat("A02")){   // checking that seat was reserved in theatre arraylist
//    System.out.println("Please pay for A02"); // by reserving it here through theatre
//
//} else {
//    System.out.println("Seat already reserved");
//}
//
//System.out.println();
//
//Collections.shuffle(seatCopy);
//System.out.println("Printing seatCopy: ");
//printList(seatCopy);
////        System.out.println("Printing theatre.seats: ");
////        printList(theatre.seats);
//
//sortList(seatCopy);
//System.out.println("Printing sorted seatCopy");
//printList(seatCopy);
//
////        List<Theatre2.Seat2> newList = new ArrayList<>(theatre.seats.size());
////        Collections.copy(newList, theatre.seats);  // won't work, because although the size has been declared
////                                                   // the number of elements in the list = 0.
//
//    public static void printList(List<Theatre.Seat> list){
//        for(Theatre.Seat seat : list){
//            System.out.print(" " + seat.getSeatNumber());
//        }
//        System.out.println();
//        System.out.println("==========================================");
//    }
//
//    public static void sortList(List<? extends Theatre.Seat> list){
//        for(int i=0; i<list.size(); i++){
//            for(int j=i+1; j<list.size(); j++){
//                if(list.get(i).compareTo(list.get(j))> 0){
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
//    }

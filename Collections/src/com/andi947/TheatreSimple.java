package com.andi947;

import java.util.*;

/**
 * Created by Andrea on 2017/04/26.
 */
public class TheatreSimple {
//    private final String theatreName;
//    private Collection<Seat> seats = new ArrayList<>();
//
//    public TheatreSimple(String theatreName, int numRows, int seatsPerRow) {  // name of theatre, number of rows and number of seats per row
//        this.theatreName = theatreName;
//
//        int lastRow = 'A' + (numRows-1);
//        for(char row = 'A'; row <= lastRow; row++){  // increases letter by the number of rows present
//            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){  // increases the seat number by the number of seats per row
//                Seat seat = new Seat(row + String.format("%02d", seatNum));  // creates the seat by assigning the seatNum of that letter
//                seats.add(seat);   // creation of seats for the theatre  // adds it to the seats ArrayList
//            }
//        }
//    }
//
//    public String getTheatreName() {
//        return theatreName;
//    }
//
//    public boolean reserveSeat(String seatNumber){   // inefficient - brute force search - scans every element until it finds the one we want
//        Seat requestedSeat = null;
//        for(Seat seat : seats){
////            System.out.println(".");  // how many seats it has to check to find the seat
//            if(seat.getSeatNumber().equals(seatNumber)){
//                requestedSeat = seat;
//                break;
//            }
//        }
//
//        if(requestedSeat == null){
//            System.out.println("There is no seat " + seatNumber);
//            return false;
//        }
//        return requestedSeat.reserved();
//    }
//
//    // for testing
//    public void getSeats(){
//        for(Seat seat : seats){
//            System.out.println(seat.getSeatNumber());
//        }
//    }
//
//    // InnerClass of TheatreSimple
//    private class Seat {
//        private final String seatNumber;
//        private boolean reserved = false;
//
//        public Seat(String seatNumber) {
//            this.seatNumber = seatNumber;
//        }
//
//        public boolean reserved(){
//            if(!this.reserved){
//                this.reserved = true;
//                System.out.println("Seat2 " + seatNumber + " reserved");
//                return true;
//            } else {
//                return false;
//            }
//        }
//
//        public boolean cancel(){
//            if(this.reserved){
//                this.reserved = false;
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
//    }
}

/// From main():
//        theatre.getSeats();
//        if(theatre.reserveSeat("B13")){
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
//
//        if(theatre.reserveSeat("Z11")){
//            System.out.println("Please pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }




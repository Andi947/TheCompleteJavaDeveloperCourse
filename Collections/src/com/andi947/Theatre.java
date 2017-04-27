package com.andi947;

import java.util.*;

/**
 * Created by Andrea on 2017/04/26.
 */
public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    static final Comparator<Seat> PRICE_ORDER;

    static {
        PRICE_ORDER = new Comparator<Seat>() {   // Anonymous inner class implementing a comparator & providing implementation method of single compare method
            @Override
            public int compare(Seat seat1, Seat seat2) {
                if (seat1.getPrice() < seat2.getPrice()) {
                    return -1;
                } else if (seat1.getPrice() > seat2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };  // static initialisation block for static final comparator PRICE_ORDER
    }

    public Theatre(String theatreName, int numRows, int seatsPerRow) {  // name of theatre, number of rows and number of seats per row
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows-1);
        for(char row = 'A'; row <= lastRow; row++){
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                double price = 12.00;
                if((row < 'D') && (seatNum >= 4) && (seatNum <= 9)){
                    price = 14.00;
                } else if((row > 'F') || (seatNum < 4) || (seatNum > 9)){
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){   // brute force search - scans every element until it finds the one we want
        Seat requestedSeat = new Seat(seatNumber, 0);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >= 0){
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }

    // for testing
    public Collection<Seat> getSeats(){
        return seats;
    }

    // InnerClass of TheatreSimple
    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved2 = false;
        private double price;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        @Override   // Binary Search ( +1 = seat positioned before this; -1 = after this; 0 = seat == this)
        public int compareTo(Seat seat) {
//            System.out.print(".");
            return this.seatNumber.compareTo(seat.getSeatNumber());
        }

        public boolean reserve(){
            if(!this.reserved2){
                this.reserved2 = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel(){
            if(this.reserved2){
                this.reserved2 = false;
                System.out.println("Reservation of seat " + seatNumber + "cancelled");
                return true;
            } else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }
    }
}


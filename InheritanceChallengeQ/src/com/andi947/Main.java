package com.andi947;

public class Main {

    public static void main(String[] args) {

       // Challenge:
        // Start with a base class of a Vehicle, then create a
        //      Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car
        //      that inherits from the Car class.
        // You should be able to hand steering, changing gears,
        //      and moving (speed in other words).
        // You will want to decide where to put the appropriate
        //      state and behaviours (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing
        //      speed should be included.
        // For your specific type of vehicle, you will want to add
        //      something specific for that type of car.

        Vehicle vehicle1 = new Vehicle("Large", "boat", 2013);

        vehicle1.steering("forward");
        vehicle1.move(20);

        System.out.println();

        Car car1 = new Car(2004, 4, 2, true, "Small");
        car1.changeGears();
        car1.steering("left");

        System.out.println();

        LandCruiser landCruiser1 = new LandCruiser(2012, "large", true,true);
        landCruiser1.towVehicle(101);
        landCruiser1.changeGears();
        landCruiser1.steering("straight");
        landCruiser1.move(120);


    }
}

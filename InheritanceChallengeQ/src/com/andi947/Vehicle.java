package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Vehicle {
    private String size;
    private String name;
    private int modelYear;

    private int currentSpeed;
    private String currentDirection;

    public Vehicle(String size, String name, int modelYear) {
        this.size = size;
        this.name = name;
        this.modelYear = modelYear;
    }

//    public Vehicle(int currentSpeed, String currentDirection) {
//        this("Regular", "Vehicle", 2004);
//        this.currentSpeed = currentSpeed;
//        this.currentDirection = currentDirection;
//    }

    public void steering(String direction){
        System.out.println("Vehicle.steering() called.");
        System.out.println("Vehicle is now going " + direction);
    }

    public void changeGears() {
        System.out.println("Vehicle.changeGears() called");
    }

    public void move(int speed){
        System.out.println("Vehicle.move() called.");
        System.out.println("Vehicle is now moving at " + speed);
    }

}

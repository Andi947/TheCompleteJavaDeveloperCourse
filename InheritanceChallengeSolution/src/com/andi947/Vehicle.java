package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        // These bottom 2 fields are not part of the initialisation menu but are initialised here.
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    // not all vehicles have gears therefore no gear() here

    // here we use the values already initialsed in constructor for use with our methods
    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees");
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    // we have created getters so we can get the values of our parameters while in another class

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        this.currentVelocity = 0;
    }
}

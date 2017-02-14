package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Car extends Vehicle {

    // can only inherit from one class at a time, and each
    // instance created is only an instance from one class.

    private int doors;
    private int engineCapacity;

    public Car(String name, int doors, int engineCapacity) {
        super(name);
        this.doors = doors;
        this.engineCapacity = engineCapacity;
    }
}

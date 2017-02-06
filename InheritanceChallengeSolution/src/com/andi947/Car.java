package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Car extends Vehicle{

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;   // this is where the gear() will be included

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    // ability to change the gear; ability to change the velocity of vehicle;
    // method to stop and a method to steer.

    // by creating the setter it allows us to change the parameter from outside the class
    public void changeGear(int currentGear) {  // don't have to use the title setCurrentGear
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Changed to " + this.currentGear + " gear.");
    }

    // change velocity of the vehicle... we will leave that alone here and leave it at the
    // basic functionality under the Vehicle Class - thus below.

    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity(): Velocity " + speed + ", direction " + direction);
        move(speed, direction);
    }

    // stop method now created in Vehicle class; stop

    // steering method is set to basic method.

}

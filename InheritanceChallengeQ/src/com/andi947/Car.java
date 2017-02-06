package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private boolean isManual;
    private String bootSpace;

    public Car(int modelYear, int wheels, int doors, boolean isManual, String bootSpace) {
        super("Small-Medium vehicle", "car", modelYear);
        this.wheels = wheels;
        this.doors = doors;
        this.isManual = isManual;
        this.bootSpace = bootSpace;
    }

    private void shiftGears(){
        if(isManual){
            System.out.println("Push clutch in and change to desired gear");
        } else {
            System.out.println("Gears change automatically");
        }
    }

    public void steering(String direction) {
        System.out.println("Car.steering() called");
        System.out.println("Car is now going " + direction);
    }

    @Override
    public void changeGears() {
        System.out.println("Car.changeGears() called");
        shiftGears();
        super.changeGears();
    }
}

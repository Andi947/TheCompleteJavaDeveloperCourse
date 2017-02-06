package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Outlander extends Car {

    private int roadServiceMonths;

    // You can hard-set the parameters in the more specific class
    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    // gear change for automatic gear box - depending on gear and speed, changes the gear automatically:
    public void accelerate(int rate){ // difference in speed from current speed
        // can call the method from the main super class
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0){  // if car is stopped, it'll automatically change gear to first gear.
            stop();
            changeGear(1);
        } else if(newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        } else if(newVelocity > 10 && newVelocity <=20){
            changeGear(2);
        } else if(newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        }else if(newVelocity > 30 && newVelocity <= 50){
            changeGear(4);
        } else if(newVelocity > 50 && newVelocity <= 80) {
            changeGear(5);
        } else {
            changeGear(6);
        }

        if(newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}

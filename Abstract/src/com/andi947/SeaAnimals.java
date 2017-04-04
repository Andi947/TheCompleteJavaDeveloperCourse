package com.andi947;

/**
 * Created by Andrea on 2017/04/03.
 */
public abstract class SeaAnimals implements Animal{    // because abstract don't have to implement interface method
    public abstract int moveForward();
    public abstract int moveBackwards();

    @Override
    public void move() {
        int metresSwum = moveForward();
        System.out.println(metresSwum);

        int distanceCovered = metresSwum-moveBackwards();
        System.out.println(distanceCovered);
    }
}

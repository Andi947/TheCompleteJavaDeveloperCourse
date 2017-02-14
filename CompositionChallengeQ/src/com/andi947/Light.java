package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Light {

    private int number;
    private String colour;
    private boolean hasShade;
    private String type;

    public Light(int number, String colour, boolean hasShade, String type) {
        this.number = number;
        this.colour = colour;
        this.hasShade = hasShade;
        this.type = type;
    }

    public void lightSwtich(boolean isOn){
        if(isOn){
            System.out.println("Turn lights off");
        } else {
            System.out.println("Turn lights on");
        }
    }

    public int getNumber() {
        return number;
    }

    public String getColour() {
        return colour;
    }

    public boolean isHasShade() {
        return hasShade;
    }

    public String getType() {
        return type;
    }
}

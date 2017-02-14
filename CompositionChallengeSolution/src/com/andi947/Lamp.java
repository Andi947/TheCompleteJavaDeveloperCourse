package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Lamp {
    private String style;
    private boolean battery;
    private int glowRating;

    public Lamp(String style, boolean battery, int glowRating) {
        this.style = style;
        this.battery = battery;
        this.glowRating = glowRating;
    }

    public void turnON(){
        System.out.println("Lamp -> Turning on");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlowRating() {
        return glowRating;
    }
}

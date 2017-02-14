package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Window {
    private boolean isTinted;
    private Dimensions dimensions;

    public Window(boolean isTinted, Dimensions dimensions) {
        this.isTinted = isTinted;
        this.dimensions = dimensions;
    }

    public void openWindow(boolean hasLatch){
        if(hasLatch){
            System.out.println("Open and close window");
        } else {
            System.out.println("Window cannot open");
        }
    }

    public boolean isTinted() {
        return isTinted;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}

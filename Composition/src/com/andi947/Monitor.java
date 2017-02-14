package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Monitor {

    private String model;
    private String manufacturer;
    private int screenSize;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int screenSize, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String colour) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in colour " + colour);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}

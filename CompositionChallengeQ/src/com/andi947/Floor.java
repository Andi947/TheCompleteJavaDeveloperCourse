package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Floor {

    private String type;
    private Dimensions dimensions;
    private String colour;

    public Floor(String type, Dimensions dimensions, String colour) {
        this.type = type;
        this.dimensions = dimensions;
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColour() {
        return colour;
    }
}

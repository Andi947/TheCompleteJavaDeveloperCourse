package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Ceiling {
    private Dimensions dimensions;
    private String colour;

    public Ceiling(Dimensions dimensions, String colour) {
        this.dimensions = dimensions;
        this.colour = colour;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColour() {
        return colour;
    }
}

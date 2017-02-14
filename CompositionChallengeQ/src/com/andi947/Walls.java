package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Walls {
    private int walls;
    private String colour;
    private Dimensions dimensions;

    public Walls(int walls, String colour, Dimensions dimensions) {
        this.walls = walls;
        this.colour = colour;
        this.dimensions = dimensions;
    }

    public int getWalls() {
        return walls;
    }

    public String getColour() {
        return colour;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}

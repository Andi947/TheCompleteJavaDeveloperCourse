package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Dimensions {

    private double width;
    private double height;
    private double depth;

    public Dimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Dimensions(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


//    public void Area(){
//        int area = width * depth;
//    }
//
//    public void Volume(){
//        int volume = width * depth * height;
//    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }
}

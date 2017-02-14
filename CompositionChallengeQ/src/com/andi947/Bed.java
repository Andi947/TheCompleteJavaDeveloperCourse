package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Bed {

    private Dimensions dimensions;
    private int pillows;
    private int duvet;
    private boolean hasHeadboard;
    private int sideTables;
    private String typeFrame;

    public Bed(Dimensions dimensions, int pillows, int duvet, boolean hasHeadboard, int sideTables, String typeFrame) {
        this.dimensions = dimensions;
        this.pillows = pillows;
        this.duvet = duvet;
        this.hasHeadboard = hasHeadboard;
        this.sideTables = sideTables;
        this.typeFrame = typeFrame;
    }

    public void makeBed(){
        System.out.println("Bed is neatly made");
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getPillows() {
        return pillows;
    }

    public int getDuvet() {
        return duvet;
    }

    public boolean isHasHeadboard() {
        return hasHeadboard;
    }

    public int getSideTables() {
        return sideTables;
    }

    public String getTypeFrame() {
        return typeFrame;
    }
}

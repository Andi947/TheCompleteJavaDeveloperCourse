package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Cupboards {

    private Dimensions dimensions;
    private int doors;
    private int shelves;
    private boolean hasHangingSpace;
    private String colour;

    public Cupboards(Dimensions dimensions, int doors, int shelves, boolean hasHangingSpace, String colour) {
        this.dimensions = dimensions;
        this.doors = doors;
        this.shelves = shelves;
        this.hasHangingSpace = hasHangingSpace;
        this.colour = colour;
    }

    public void accessCupboards(int doorsOpen) {
        if (doorsOpen <= doors){
            if (doorsOpen < doors) {
                System.out.println("Open all cupboard doors and access cupboard");
            } else if (doorsOpen == doors) {
                System.out.println("Access cupboard");
            }
        } else {
            System.out.println("Impossible - More doors open than there are doors");

        }
    }

    public void closeCupboards(boolean doorsOpen){
        if(doorsOpen) {
            System.out.println("Close doors");
        } else {
            System.out.println("Doors are already closed");
        }
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getDoors() {
        return doors;
    }

    public int getShelves() {
        return shelves;
    }

    public boolean isHasHangingSpace() {
        return hasHangingSpace;
    }

    public String getColour() {
        return colour;
    }
}

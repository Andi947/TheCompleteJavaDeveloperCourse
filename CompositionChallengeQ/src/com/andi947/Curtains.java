package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Curtains {
    private int noCurtains;
    private String hangType;
    private String colour;
    private boolean hasBlackout;

    public Curtains(int noCurtains, String hangType, String colour, boolean hasBlackout) {
        this.noCurtains = noCurtains;
        this.hangType = hangType;
        this.colour = colour;
        this.hasBlackout = hasBlackout;
    }

    public void openCurtains(boolean areClosed){
        if(areClosed){
            System.out.println("Open curtains by pulling them to the side");
        } else {
            System.out.println("Curtains are already open");
        }

    }

    public void closeCurtains(boolean areOpen){
        if(areOpen) {
            System.out.println("Close curtains by drawing them together");
        } else {
            System.out.println("Curtains are already closed");
        }
    }

    public int getNoCurtains() {
        return noCurtains;
    }

    public String getHangType() {
        return hangType;
    }

    public String getColour() {
        return colour;
    }

    public boolean isHasBlackout() {
        return hasBlackout;
    }
}

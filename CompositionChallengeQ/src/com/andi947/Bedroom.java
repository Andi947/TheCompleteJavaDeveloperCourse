package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Bedroom {
    private Window window;
    private Curtains curtains;
    private Bed bed;
    private Light light;
    private Cupboards cupboards;
    private Walls walls;
    private Floor floor;
    private Ceiling ceiling;

    public Bedroom(Window window, Curtains curtains, Bed bed, Light light, Cupboards cupboards, Walls walls, Floor floor, Ceiling ceiling) {
        this.window = window;
        this.curtains = curtains;
        this.bed = bed;
        this.light = light;
        this.cupboards = cupboards;
        this.walls = walls;
        this.floor = floor;
        this.ceiling = ceiling;
    }


    public void takeClothes(){
        cupboards.accessCupboards(2);
        takeOutClothes();
        cupboards.closeCupboards(true);

    }

    private void takeOutClothes(){
        System.out.println("Take clothes out of cupboard");
    }

    public void lightsOn(){
        light.lightSwtich(false);
    }

    public Window getWindow() {
        return window;
    }

    public Curtains getCurtains() {
        return curtains;
    }

    public Bed getBed() {
        return bed;
    }

    public Walls getWalls() {
        return walls;
    }

    public Floor getFloor() {
        return floor;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }
}

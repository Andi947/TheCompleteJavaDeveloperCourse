package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class LandCruiser extends Car{
    private boolean hasTowbar;
    private boolean isAWD;

    public LandCruiser(int modelYear,String bootSpace, boolean hasTowbar, boolean isAWD) {
        super(modelYear, 4, 4, true, bootSpace);
        this.hasTowbar = hasTowbar;
        this.isAWD = isAWD;
    }

    public void towVehicle(int vehicleSize){
        if(hasTowbar){
            if(vehicleSize < 100){
                System.out.println("Land cruiser to the rescue");
            } else {
                System.out.println("Land cruiser needs help");
            }

        } else {
            System.out.println("Land cruiser cannot help");
        }
    }

    private void shiftGears(){
        if(isAWD) {
            System.out.println("Switch to All Wheel Drive mode and change gears as usual");
        } else {
            System.out.println("Change gears normally");
        }
    }


    @Override
    public void changeGears() {
        System.out.println("LandCruiser.changeGears() called");
        shiftGears();
        super.changeGears();
    }
}

package com.andi947;

/**
 * Created by Andrea on 2017/02/01.
 */
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    // State components of the object (ABOVE)

    public void setModel(String model) {   // setter
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }



    public String getModel(){
        return this.model;
    }
}

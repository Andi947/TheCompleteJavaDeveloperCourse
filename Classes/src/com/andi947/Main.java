package com.andi947;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();        //define obj and initialise obj
        Car holden = new Car();

        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}

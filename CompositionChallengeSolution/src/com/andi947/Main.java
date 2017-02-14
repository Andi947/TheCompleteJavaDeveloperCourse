package com.andi947;

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("north");
        Wall wall3 = new Wall("east");
        Wall wall4 = new Wall("south");

        Ceiling ceiling = new Ceiling(12, "White");

        Bed bed = new Bed("Modern", 4, 3, 2,1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Tim's", wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnON();

    }
}

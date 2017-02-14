package com.andi947;

public class Main {

    public static void main(String[] args) {
	    //Challenge:
        // Create a single room of a house using composition
        // Think about the things that should be included in the room
        // Maybe physical parts of the house but furniture as well
        // Add at least one method to access an object via getter
        // and then that objects public method as you saw in the previous video
        // then add at least one method to hide the object e.g. not
        // using a getter but to access the obj used in the composition
        // within the main class like you saw in this video.

        Walls theWalls = new Walls(4, "white", new Dimensions(5, 3));
        Ceiling theceiling = new Ceiling(new Dimensions(5,5), "white");
        Floor theFloor = new Floor("carpeted", new Dimensions(5,5), "beige");
        Window theWindow = new Window(false, new Dimensions(3,2));
        Curtains theCurtains = new Curtains(2, "Ring", "Blue", true);
        Bed theBed = new Bed(new Dimensions(2,2,0.3), 2, 1, true, 2, "leather");
        Cupboards theCupboards = new Cupboards(new Dimensions(2, 1.5, 0.5), 2, 5,true, "Wood");
        Light theLight = new Light(3, "Warm", true, "bayonette");

        Bedroom theBedroom = new Bedroom(theWindow, theCurtains, theBed, theLight, theCupboards,theWalls,theFloor,theceiling);

        theBedroom.getBed().makeBed();
        theBedroom.takeClothes();
        theBedroom.lightsOn();
        theBedroom.getWindow().openWindow(true);

    }
}

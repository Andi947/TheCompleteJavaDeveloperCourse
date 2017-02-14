package com.andi947;

public class Main {

    public static void main(String[] args) {

        // we created each item individually and reality we would buy each item individually
        // then we passed each item into Object PC and reality we would place each obj into PC
        // we do this through the constructor in PC
        // Thus PC HAS A case, HAS A motherboard and HAS A monitor

        // Dimensions... - we created a new instance of that class to be used with our Case instance
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        // new Resolution(x,y) - we created a new instance of the class without creating a new variable
        // especially when you're not using it for anything else but are just passing it in a method
        // NOTE - this value is not saved as a variable to be used outside of the method
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        //create mother board instance
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        // here we pass each of the new instances created from the other classes into this class
        // i.e. created the PC class by passing the other 3 obj to it
        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        // how do we access the methods in the other classes?
        // dot method: thePC class instance.  the get method for the monitor . the method used in the monitor class
        // As follows:
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();

        // ABOVE - use getter function which is returning theMonitor (class already been
        // initialised - i.e. the object that has been created in this class is returning
        // to the calling process) and then from there we are calling the method which is
        // from that object(theMonitor) that's stored within the PC class itself, in the
        // PC object and that is invoking the method for us.
        //
        // Thus through the get method we are invoking the class method
        // getMonitor() returns monitor which linked to the class Monitor and as such
        // when getting monitor we are able to access public methods within the class
        // it is linked to.

        // Further explanation:
        // Accessing ultimately the functions found in the base classes
        // (theCase, theMotherboard and theMonitor) via thePC object

        //Composition PART 2:

        thePC.powerUp();
    }
}

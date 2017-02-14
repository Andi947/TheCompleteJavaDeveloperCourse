package com.andi947;

public class Main {

    public static void main(String[] args) {
        // Challenge:
        // Create a class and demonstrate proper encapsulation techniques
        // the class will be called Printer
        // It will simulate a real Computer Printer
        // It should have fields for toner level, number of pages printed, and
        // also whether its a duplex printer (capable of printing on both
        // sides of the paper).
        // Add methods to fill up the toner (up to a maximum of 100%), another
        // method to simulate printing a page (which should increase the number
        // of pages printed).
        // Decide on the scope, whether to use constructors, and anything else
        // that you think is needed.

        Printer printer = new Printer(100,true);

        System.out.println(printer.printPage(5));
        printer.printPage(35);
        printer.printPage(45);
        printer.fillToner();

        System.out.println(printer.getPagesPrinted() + " pages have been printed.");
        int pagesPrinted = printer.printPages(5);
        printer.printPages(35);
        printer.printPages(45);
        printer.addToner(55);

    }
}

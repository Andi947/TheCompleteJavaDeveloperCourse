package com.andi947;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print"); // create a local class that implements that OnClickListener interface
                                                             // and assign an instance of it to our button

    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
//        mcLaren.addGear(1, 5.3); // now added the add gear function to Constructor
//        mcLaren.addGear(2, 10.6);
//        mcLaren.addGear(3, 15.9);
//        mcLaren.operatingClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operatingClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.operatingClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operatingClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));
//        mcLaren.operatingClutch(true);
//        System.out.println(mcLaren.wheelSpeed(2000));

//        class ClickListener implements Button.OnClickListener{
//            public ClickListener(){
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();




//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        //Gearbox.Gear second = new Gearbox.Gear(2, 15.4);  // doesn't work -> Gear would need to be static nested clss
        //Gearbox.Gear third = new mcLaren.Gear(3, 17.8); // need the .new to create a new instance of GEAR
//        System.out.println(first.driveSpeed(1000));



    }

    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;

                case 1:
                    btnPrint.onClick();
            }
        }
    }
}

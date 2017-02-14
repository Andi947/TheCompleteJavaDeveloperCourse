package com.andi947;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;

        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine(){
        return "Car -> stateEngine()";
        //return "Place key in ignition, place car in neutral and turn on ignition";
    }

    public String accelerate(){
        return "Car -> accelerate()";
        //return "Press accelerator pedal and change up gears";
    }

    public String brake(){
        return "Car -> brake()";
        //return "Press brake pedal and change down gears";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}

class Keyless extends Car{
    public Keyless(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
        // return "Place car in neutral and press start button";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

class Automatic extends Car{
    public Automatic(String name, int cylinders) {
        super(name, cylinders);
    }

    public Automatic() {
        super("Automatic", 4);
    }

    @Override
    public String startEngine() {
        return "Automatic -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Automatic -> accelerate()";
        //return "Press accelerator pedal and car will go up gears automatically";
    }

    @Override
    public String brake() {
        return "Automatic -> brake()";
        //return "Press brake pedal and car will go down gears automatically";
    }
}

class Manual extends Car{
    public Manual(String name, int cylinders) {
        super(name, cylinders);
    }
    // no change in methods required


    @Override
    public String startEngine() {
        return "Manual -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Manual -> accelerate()";
    }

    @Override
    public String brake() {
        return "Manual -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        //Challenge:
        // WE are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields for a generic car class:
        // name; engine(T/F); no. cylinders, no. wheels, etc.
        // Constructor should accept 2 parameters - cylinders and name
        // Constructor should initialise cylinders and name, and set wheels to 4
        //  and engine to true
        //
        // Create appropriate getters
        //
        // Create some methods like startEngine, accelerate, and brake
        //
        // show a message for each in the base class
        // Now create 3 sub classes for your favourite vehicles
        // Override the appropriate methods to demonstrate polymorphism in use
        // put all classes in the one java file (this one)

        Car[] array = new Car[4];

        Car car = new Car("Base car", 8);
//        runCar(car);
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());
//
        Keyless keyless = new Keyless("Ford Focus 2.0", 6);
//        runCar(keyless);
//        System.out.println(keyless.startEngine());
//        System.out.println(keyless.accelerate());
//        System.out.println(keyless.brake());
//
        Automatic automatic = new Automatic("Honda Odyssey", 4);
//        runCar(automatic);
//        System.out.println(automatic.startEngine());
//        System.out.println(automatic.accelerate());
//        System.out.println(automatic.brake());
//
        Manual manual = new Manual("Toyota Tazz", 2);
//        runCar(manual);
//        System.out.println(manual.startEngine());
//        System.out.println(manual.accelerate());
//        System.out.println(manual.brake());

        array[0] = car;
        array[1] = keyless;
        array[2] = automatic;
        array[3] = manual;

        for(int i = 0; i < 4; i++ ) {
            runCar(array[i]);
        }

    }

    public static void runCar(Car car) {
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
    }

}

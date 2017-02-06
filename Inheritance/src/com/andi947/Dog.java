package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);   // super.move() - if we override the animal class move();
        // this method will be ignored in this instance because it will go straight to
        // the animal.move() and execute that method.
        // If just move(); then it will search for a move method in the class and
        // execute the move method and thus the override.
        // I.e. super.__() forces the class to use the super class method.
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }
    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}

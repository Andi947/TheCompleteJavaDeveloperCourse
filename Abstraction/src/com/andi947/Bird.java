package com.andi947;

/**
 * Created by Andrea on 2017/03/30.
 */
public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}

//Abstract class implementing another abstract class

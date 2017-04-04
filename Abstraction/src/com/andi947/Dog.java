package com.andi947;

/**
 * Created by Andrea on 2017/03/30.
 */
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breath out, repeat");
    }
}

// Allows us to enter fields in the abstract class while with an interface, it is only methods
// Allows also enter certain abstract methods

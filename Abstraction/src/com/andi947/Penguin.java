package com.andi947;

/**
 * Created by Andrea on 2017/03/30.
 */
public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();  // has wings but cannot fly
        System.out.println("I'm not very good at that, can I go for a swim instead?");
    }
}

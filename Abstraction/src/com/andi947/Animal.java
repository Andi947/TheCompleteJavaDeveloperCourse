package com.andi947;

/**
 * Created by Andrea on 2017/03/30.
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}

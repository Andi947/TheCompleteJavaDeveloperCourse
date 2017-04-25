package com.andi947;

/**
 * Created by Andrea on 2017/04/07.
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

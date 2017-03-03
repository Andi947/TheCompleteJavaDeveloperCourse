package com.andi947;

/**
 * Created by Andrea on 2017/03/03.
 */
public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override  // IMPORTANT TO UNDERSTAND!
    public String toString() {
        return this.title + ": " + this.duration;
    }
}

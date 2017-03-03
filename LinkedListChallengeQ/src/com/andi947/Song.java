package com.andi947;

/**
 * Created by Andrea on 2017/03/01.
 */
public class Song {
    private String songName;
    private String duration;


    public Song(String songName, String duration) {
        this.songName = songName;
        this.duration = duration;
    }

    public Song(String songName) {
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public boolean equals(Object obj) {
        Song sObj = (Song) obj;
        if( sObj.getSongName().equals(this.getSongName()))
        {
           return sObj.getDuration().equals(this.getDuration());
        }

        return false;
    }
}

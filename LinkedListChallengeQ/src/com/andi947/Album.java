package com.andi947;

import java.util.ArrayList;

/**
 * Created by Andrea on 2017/03/01.
 */
public class Album {
    private String albumName;
    private ArrayList<Song> songs;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSongToAlbum(String songName, String duration){
        if(findSong(songName) == null) {
            this.songs.add(new Song(songName, duration));
            System.out.println("\t"+ songName + " was added");
            return true;
        }
        System.out.println("Song already exists in album");
        return false;
    }

    private Song findSong(String songName){
        for(int i=0; i < this.songs.size(); i++){
            Song checkedSong = this.songs.get(i);
            if(checkedSong.getSongName().equals(songName)){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean searchForSong(String songName){
        if(findSong(songName) != null){
            return true;
        }
        return false;
    }


    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}

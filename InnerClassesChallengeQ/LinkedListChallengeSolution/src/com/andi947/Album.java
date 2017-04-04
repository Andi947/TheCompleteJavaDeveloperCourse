package com.andi947;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrea on 2017/03/03.
 */
public class Album {
    private String name;
    private String artist;
    private SongList songList;


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    public void addSong(String title, double duration){
        this.songList.addSong(title,duration);
    }

    private void findSong(String title){
        this.songList.findSong(title);
    }


    public boolean addToPlayList(int trackNumber, List<Song> playList){
        int index = trackNumber-1;
        if((index > 0)&&(index <= this.songList.songs.size())){
            playList.add(this.songList.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, List<Song> playList){
        Song checkedSong = songList.findSong(title);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This song " + title + " is not in this album");
        return false;
    }

    public class SongList{
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean addSong(String title, double duration){
            if(findSong(title) == null){
                this.songs.add(new Song(title, duration));
                return true;
            }
            return false;
        }

        private Song findSong(String title){
            for(Song checkedSong: this.songs){ // for each loop
                if(checkedSong.getTitle().equals(title)){
                    return checkedSong;
                }
            }
            return null;
        }
    }

}

// Modify the playlist challenge so that the Album class uses an inner class.
// Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
// The inner SongList class will use an ArrayList and will provide a method to add a song.
// It will also provide findSong() methods which will be used by the containing Album class
// to add songs to the playlist.
// Neither the Song class or the Main class should be changed.


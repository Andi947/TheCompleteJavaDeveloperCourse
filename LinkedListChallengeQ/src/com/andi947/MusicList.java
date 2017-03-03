package com.andi947;

import java.util.ArrayList;

/**
 * Created by Andrea on 2017/03/01.
 */
public class MusicList {

    private ArrayList<Album> albums;

    public MusicList() {
        this.albums = new ArrayList<Album>();
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public boolean addAlbum(String albumName) {
        if (findAlbum(albumName) == null) {
            System.out.println(albumName + " was added to albums.");
            this.albums.add(new Album(albumName));
            return true;
        }
        System.out.println("This album already exits");
        return false;
    }

    public boolean addSongToAlbum(String albumName, String songName, String duration){
        Album album = findAlbum(albumName);
        if(album != null){
            System.out.println("Album " + albumName +": ");
            return album.addSongToAlbum(songName, duration);
        }
        System.out.println("Album doesn't exist");
        return false;
    }

    private Album findAlbum(String albumName) {
        for (int i = 0; i < this.albums.size(); i++) {
            Album checkedAlbum = this.albums.get(i);
            if (checkedAlbum.getAlbumName().equals(albumName)) {
                return checkedAlbum;
            }
        }
        return null;
    }

    public boolean doesSongExist(String songName){
        for (int i = 0; i < this.albums.size(); i++) {
            Album checkedAlbum = this.albums.get(i);
            boolean songSearch = checkedAlbum.searchForSong(songName);
            if(songSearch){
                return true;
            }
        }
        return false;
    }

    public boolean listSongs(String albumName){
        Album album = findAlbum(albumName);
        if(album!= null){
            System.out.println("Song list for Album " + album.getAlbumName());
            ArrayList<Song> albumSongs = album.getSongs();
            for(int i=0; i<albumSongs.size(); i++){
                Song albumSong = albumSongs.get(i);
                System.out.println("[" + (i+1) + "] " + albumSong.getSongName() + "\t" + albumSong.getDuration());
            }
            return true;
        } else {
            return false;
        }
    }

    public void listAlbums(){
        System.out.println("Album list for all music: ");
        ArrayList<Album> albums = getAlbums();
        for(int i=0; i<albums.size(); i++){
            Album album = albums.get(i);
            System.out.println("[" + (i+1) + "] " + album.getAlbumName());
        }
    }


}



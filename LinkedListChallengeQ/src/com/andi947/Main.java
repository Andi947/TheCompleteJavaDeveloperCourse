package com.andi947;

import java.util.*;

public class Main {

    private static final int NEXT_SONG = 1;
    private static final int PREVIOUS_SONG = 2;
    private static final int REPEAT_SONG = 3;
    private static final int QUIT = 0;

    public static void main(String[] args) {
        //Create a program that implements a playlist (LinkedList) for songs
        //Create a Song class having Title and Duration for a song
        //The program will have an Album class containing a list of songs (ArrayList)
        // The albums will be stored in an ArrayList
        // Songs from different albums can be added to the playlist and will appear in the list in the order they are added
        // Once the songs have been added to the playlist, create a menu of options to:
        //          - Quit
        //          - Skip forward to the next song
        //          - skip backwards to the previous song
        //          - replay the current song
        //          - list the songs in the play list
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that you own)
        // Hint: To replay a song, consider what happened when we went back and forth from a city before we started
        // tracking the direction we were going
        // As an optional extra, provide an option to remove the current song from the playlist ( listIterator.remove())

        MusicList musicList1 = new MusicList();
        musicList1.addAlbum("Joker");
        musicList1.addAlbum("Penny for your Thoughts");
//        musicList1.addAlbum("Joker");
        musicList1.addAlbum("Smoking Mirrors");
        System.out.println();

        musicList1.listAlbums();
        System.out.println();

        musicList1.addSongToAlbum("Joker", "Funny Man", "1:23");
        musicList1.addSongToAlbum("Penny for your Thoughts", "Thinking of you", "1:56");
        musicList1.addSongToAlbum("Joker", "Laughing Out Loud", "1:05");
//        musicList1.addSongToAlbum("Joker", "Funny Man", "1:23");
        musicList1.addSongToAlbum("Smoking Mirrors", "Faceless", "1:15");
        musicList1.addSongToAlbum("Joker", "Joke is on You", "1:33");
        musicList1.addSongToAlbum("Joker", "Town Clown", "2:13");
        musicList1.addSongToAlbum("Smoking Mirrors", "Grounded", "1:11");
        musicList1.addSongToAlbum("Smoking Mirrors", "Reflections", "2:30");
        musicList1.listSongs("Joker");
        System.out.println();

        LinkedList<String> playlist = new LinkedList<>();
        addSongToPlaylist(playlist, musicList1, "Faceless");
        addSongToPlaylist(playlist, musicList1, "Town Clown");
        addSongToPlaylist(playlist, musicList1, "Thinking of you");
        addSongToPlaylist(playlist, musicList1, "Reflections");
        addSongToPlaylist(playlist, musicList1, "Laughing Out Loud");
        addSongToPlaylist(playlist, musicList1, "People person");
        System.out.println();
        printPlaylist(playlist);

//
//
//        LinkedList<Song> nickSongs = new LinkedList();
//
//
//        Song a1 = new Song("nick", "1:001");
//        Song a2 = new Song("nick", "1:002");
//        Song a3 = new Song("nick", "1:003");
//
//        System.out.println(" are these the same : " + a1.equals(a2));
//
//        nickSongs.add(a1);
//        nickSongs.add(a2);
//        nickSongs.add(a3);
//
//        boolean contains = nickSongs.contains(new Song("nick1", "1:001"));
//
//        System.out.println("contains " + contains);

        play(playlist);


    }

    private static void printPlaylist(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator();
        int j = 0;
        while(i.hasNext()){
            System.out.println("[" + (j+1) + "] " + i.next());
            j++;
        }
        System.out.println("============================");
    }

    private static boolean addSongToPlaylist(LinkedList<String> linkedList, MusicList musicList, String songName){
        ListIterator<String> songListIterator = linkedList.listIterator();


//        boolean playListContainsSong = linkedList.contains(songName);


        while (songListIterator.hasNext()) {
            String mySong = songListIterator.next();
            boolean comparison = mySong.equalsIgnoreCase(songName);
            if (comparison) {
                System.out.println(songName + " is already in playlist");
                return false;
            }
        }
        boolean songExists = musicList.doesSongExist(songName);
        if (songExists) {
            songListIterator.add(songName);
            System.out.println(songName + " added");
            return true;
        } else {
            System.out.println("Song doesn't exist in music list");
            return false;
        }
}

    private static void play(LinkedList playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = playlist.listIterator();

        if(playlist.isEmpty()){ // way to check if there are any items in a LinkedList
            System.out.println("No songs in the list");
            return;
        } else{
            System.out.println("Now playing " + listIterator.next());
            printMenu();
        }

        String currentPlayingSong = null;  // String because songName is string and would be currently used

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case QUIT:
                    System.out.println("Quitting...");
                    quit = true;
                    break;

                case NEXT_SONG:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        currentPlayingSong = listIterator.next();  // collects & saves songName from playlist to cPSong
                        System.out.println("Now playing " + currentPlayingSong);
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case PREVIOUS_SONG:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        currentPlayingSong = listIterator.previous(); // collects & saves songName from playlist to cPSong
                        System.out.println("Now playing " + currentPlayingSong);
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;

                case REPEAT_SONG:
                    System.out.println("repeating : " + currentPlayingSong); // uses the stored songName as it is what we were last on
                    break;

                case 4:
                    listIterator.remove(); // need to provide a next() or previous() -> as done below now
                    if(listIterator.hasNext()){
                        currentPlayingSong = listIterator.next();
                        System.out.println("Now playing " + currentPlayingSong);
                    } else if(listIterator.hasPrevious()){
                        currentPlayingSong = listIterator.previous();
                        System.out.println("Now playing " + currentPlayingSong);
                    }
                    break;

                case 5:
                    printPlaylist(playlist);
                    break;

                case 6:
                    printMenu();
                    break;
            }
        }

    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - go to next song\n" +
                "2 - got to previous song\n" +
                "3 - replay the current song\n" +
                "4 - remove song from playlist\n" +
                "5 - list the songs in the play list\n" +
                "6 - print menu options");
    }
}

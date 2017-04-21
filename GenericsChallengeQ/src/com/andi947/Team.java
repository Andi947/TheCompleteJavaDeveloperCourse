package com.andi947;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Andrea on 2017/04/20.
 */
public class Team<T extends Sport> implements Comparable<Team<T>>{
        private String name;
        private int played;
        private int won;
        private int lost;
        private int tied;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

        String message;

        if(ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if(ourScore == theirScore) {
            tied++;
            message = " drew with ";

        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(team != null){
            return 1;
        }
        return 0;
    }
}


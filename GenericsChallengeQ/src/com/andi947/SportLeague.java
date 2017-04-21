package com.andi947;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Andrea on 2017/04/20.
 */
public class SportLeague<T extends Sport> {

    private String name;
    private ArrayList<Team> teams = new ArrayList<>();
    private ArrayList<Team> teamRanking = new ArrayList<>();

    public SportLeague(String name) {
        this.name = name;
    }

    public boolean addTeam(Team<T> team) {
        if(teams.contains(team)) {
            System.out.println("Team is already in the League");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " added to League");
            return true;
        }
    }

    public void printLeagueTable(){
        Collections.sort(teams);
        for (int i = 0; i < teams.size(); i++) {
            System.out.println((i + 1) + ". " + teams.get(i).getName() + ": " + teams.get(i).ranking());
        }
    }
}

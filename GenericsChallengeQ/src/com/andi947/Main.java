package com.andi947;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

//	     ArrayList<Team> teams;
//         Collections.sort(teams);

        // Create a generic class to implement a league table for a sport.  // Class League<T implements Player>
        // The class should allow teams to be added to the list, and store // addTeam(T Team) return list<T>
        // a list of teams that belong to the league. // leagueTeamList
        //
        // Your class should have a method to print out the teams in order, //sort(team) and print - rankings
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.

        Team<Netball> furiousFairies = new Team<>("Furious Fairies");
        Team<Netball> theVixens = new Team<>("The Vixens");
        Team<Netball> dashers = new Team<>("Dashers");
        Team<Soccer> fastFoxes = new Team<>("Fast Foxes");

        SportLeague<Netball> netballChamps = new SportLeague<>("Netball Championships");
        netballChamps.addTeam(furiousFairies);
        netballChamps.addTeam(theVixens);
        netballChamps.addTeam(dashers);
//        netballChamps.addTeam(fastFoxes);


        furiousFairies.matchResult(theVixens, 8, 3);
        furiousFairies.matchResult(dashers, 4, 4);
        theVixens.matchResult(dashers, 3, 3);

        netballChamps.printLeagueTable();


    }
}

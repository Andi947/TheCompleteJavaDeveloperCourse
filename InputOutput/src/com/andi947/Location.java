package com.andi947;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Challenge:
//          what is wrong with the location constructor that will allow the program to compile but crash at run time?
//          Find it and fix the code
//          If we don't pass a map, but instead pass a null for a map, we get a NullPointerException
//          Reasonable in the case of location 0, as there aren't any exits

/**
 * Created by Andrea on 2017/04/27.
 */
public class Location {    // making the class final will prevent it from being subclassed = immutable
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {  // test constructors arguments and don't initialise new map if null is passed
        this.locationID = locationID;
        this.description = description;
        if(exits != null) {   // test if null has been entered and if so, create empty map
            this.exits = new LinkedHashMap<String, Integer>(exits);  // Constructor will crash with NullPointerException; if null is passed instead of the map
        } else {
            this.exits = new LinkedHashMap<String, Integer>();
        }
        this.exits.put("Q", 0);  // placing the Q = 0 for each location
    }

    protected void addExit(String direction, int location){ // originally public but immutable caused us to comment it out
        exits.put(direction, location);
    }

    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new LinkedHashMap<String, Integer>(exits);
    }


}

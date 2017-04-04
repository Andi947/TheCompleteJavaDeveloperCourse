package com.andi947;

import java.util.ArrayList;

/**
 * Created by Andrea on 2017/03/04.
 */
public class Players implements ISaveable {
    private String playerName;
    private String gender;

    public Players(String playerName, String gender) {
        this.playerName = playerName;
        this.gender = gender;
    }

    @Override
    public ArrayList<String> valuesToBeSaved() {
        ArrayList<String> data = new ArrayList<String>();
        data.add(playerName);
        data.add(gender);
        return data;
    }

    @Override
    public void populateObjectFields(ArrayList<String> values) {

        playerName = values.get(0);
        gender = values.get(1);
    }

    @Override
    public String toString() {
        return "Name: " + playerName + " Gender - " + gender;
    }
}

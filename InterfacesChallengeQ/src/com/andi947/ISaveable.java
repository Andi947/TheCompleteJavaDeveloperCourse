package com.andi947;

import java.util.ArrayList;

/**
 * Created by Andrea on 2017/03/04.
 */
public interface ISaveable {
    ArrayList<String> valuesToBeSaved();  //write()
    void populateObjectFields(ArrayList<String> values);  // read(ArrayList<String> savedValues)

}

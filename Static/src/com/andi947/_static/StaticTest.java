package com.andi947._static;

/**
 * Created by Andrea on 2017/04/25.
 */
public class StaticTest {
    private static int numInstances = 0;  // only one copy of this variable with class creation / no longer created with each instance of the class
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }


}

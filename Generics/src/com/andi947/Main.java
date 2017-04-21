package com.andi947;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();  // is a generic type but missing type parameter
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);

        // when ArrayList is raw then:
        // can contain any type of Object- items.add("tim"); would be valid
        // code compiles and builds but crashes at run time
    }

    private static void printDoubled(ArrayList<Integer> n){
        for(int i: n){  //don't need the object because we know the type we're using
            System.out.println(i*2);  // Have to tell Java what type of object we are using
        }
    }
}

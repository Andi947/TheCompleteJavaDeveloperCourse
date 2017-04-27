package com.andi947;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andrea on 2017/04/26.
 */
public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "a compiled high-level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }

        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All-Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness");

//        System.out.println(languages.get("Java")); // specify the key and .get() will get the value
        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            // keys are unique, so if you use it again, then the old key gets overwritten
            System.out.println(languages.put("Java", "this course is about Java"));
        }
        System.out.println("===========================================");

//        languages.remove("Lisp");

        if (languages.remove("Algol", "an algorithmic language")){
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if(languages.replace("Lisp", "Therein lies madness","a functional programming languages with imperative features")){
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
//        System.out.println(languages.replace("Scala", "This will not be added"));

        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }


    }

}

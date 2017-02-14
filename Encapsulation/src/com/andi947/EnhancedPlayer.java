package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100; // defined a hitPoints value of 100 // changing internal name for hitPoints
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health>0 && health <= 100) {     // validating that hitPoints can only be between
            this.hitPoints = health;           // 1 - 100.
        }
        this.weapon = weapon;               // guaranteeing that the name, hitPoints and weapon are initialised.
                                            // can do other validation for the other fields
    }

    public void loseHealth(int damage){
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0){
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}

// by making fields private  we're making sure that our class is not accessible or
// fields in the classes aren't accessible to any classes that are outside the class
// containing the field

//IntelliJ rename - right click on name, refactor and then rename; change the name
// Press enter; then it will tell you about getters; click no
// Then another window rename parameters, select the parameter and okay.


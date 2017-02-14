package com.andi947;

/**
 * Created by Andrea on 2017/02/06.
 */
public class Player {

    public String fullName; // problem is that by changing these, you would have to change all instances of them in all the classes
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}

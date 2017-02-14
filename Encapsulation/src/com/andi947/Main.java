package com.andi947;

public class Main {

    public static void main(String[] args) {
//        // Constructors help to guarantee and ensure that accessing Player class creates valid data
//        Player player = new Player();
//        player.name = "Tim";
//        // player.health = 20; //forget to initialise due to manual insertion and the first time class is accessed, health = 0
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200; // outside access to field can change the way the field and methods should have worked
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword"); // validation failed and set to default
        System.out.println("Initial health is " + player.getHealth()); // can only access health through getter in player class

        // still able to run code - because we don't know the internal runnings of that class
        // due to us using the getHealth() - this does the work of whatever the internal class fields are
        // This is also why we didn't change any of the getters or health parameters.. only the field

        // Encapsulation allows us to make feature changes to to the class, we can create private fields
        // and private functions that we don't want to be exposed to any other class, and we
        // can change those names at any time in this code without affecting any other code.
        // Thus the only way to create an enhanced player obj is to call the constructor with these parameters
        // WE've also got some validation in the constructor thus can't fake the health.
        // we're giving all control to the enhanced player class and in the case of losing health
        // we've ensured that no matter what, the only way with this class to reduce the amount
        // of health for a player is to use this function.

        // Encapsulation protects the members of a class and some methods from external access
        // Prevent unauthorised set up or access to fields and methods
        //
    }
}

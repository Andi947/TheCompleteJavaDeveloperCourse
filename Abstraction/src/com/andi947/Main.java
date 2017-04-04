package com.andi947;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();  // found in inherited class's methods that are public
        parrot.eat();      // found in inherited class's methods that are public
        parrot.fly();      // found in Parrot class

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();

    }
}

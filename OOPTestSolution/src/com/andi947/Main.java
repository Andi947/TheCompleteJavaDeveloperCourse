package com.andi947;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "sausage",3.56, "white" );
//        double price = hamburger.itemiseHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemiseHamburger());
        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemiseHamburger());
        System.out.println();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("Total Deluxe Burger price is " + deluxeBurger.itemiseHamburger());
        deluxeBurger.addHamburgerAddition3("Cheese", 3.00);
        System.out.println();
        System.out.println("Total Deluxe Burger price is " + deluxeBurger.itemiseHamburger());

    }
}

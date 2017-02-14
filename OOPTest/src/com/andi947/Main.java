package com.andi947;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("White");
        System.out.println("The hamburger costs: " + hamburger.getHamburgerPrice());
        //System.out.println(hamburger.totalCost(hamburger.getHamburgerPrice()));
        //Hamburger hamburger1 = new Hamburger("Plain")
//        hamburger.listAdditions();
//        hamburger.addAdditions(hamburger.lettuce);
//        hamburger.addAdditions(hamburger.drink);
//        hamburger.addAdditions(hamburger.chips);
//        hamburger.addAdditions(hamburger.pickles);
//        hamburger.grandTotal();
//        hamburger.addAdditions(hamburger.cheese);
//        hamburger.grandTotal();
//        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger();
        System.out.println("The healthy burger costs: " + healthyBurger.getHamburgerPrice());
//        System.out.println("You're allowed: " + healthyBurger.maxAdditions + " additions");
//        healthyBurger.addAdditions(healthyBurger.lettuce);
//        healthyBurger.addAdditions(healthyBurger.drink);
//        healthyBurger.addAdditions(healthyBurger.sauce);
//        healthyBurger.addAdditions(healthyBurger.tomato);
//        healthyBurger.addAdditions(healthyBurger.cheese);
//        healthyBurger.addAdditions(healthyBurger.pickles);
//        healthyBurger.addAdditions(healthyBurger.chips);
//        System.out.println();
//        healthyBurger.grandTotal();

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("Sesame seed");
        System.out.println("The deluxe hamburger costs: " + deluxeHamburger.getDeluxeBurgerPrice());
        deluxeHamburger.listAdditions();
        deluxeHamburger.addAdditions(deluxeHamburger.pickles);
        deluxeHamburger.grandTotal();
    }
}

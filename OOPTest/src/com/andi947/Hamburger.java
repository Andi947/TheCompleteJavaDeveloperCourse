package com.andi947;

/**
 * Created by Andrea on 2017/02/08.
 */
public class Hamburger {
    private String breadRollType;
    private boolean meat;
    private double hamburgerPrice;
    public int additionsCount = 0;
    public double additionsCost = 0;
    public String additionsList = "";
    public int maxAdditions = 4;

    public Cheese cheese = new Cheese();
    public Chips chips = new Chips();
    public Drink drink = new Drink();
    public Lettuce lettuce = new Lettuce();
    public Pickles pickles = new Pickles();
    public Sauce sauce = new Sauce();
    public Tomato tomato = new Tomato();

    public Hamburger(String breadRollType, boolean meat, double hamburgerPrice, int maxAdditions) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.hamburgerPrice = hamburgerPrice;
        this.maxAdditions = maxAdditions;
    }

    public Hamburger(String breadRollType, double hamburgerPrice) {
        this.breadRollType = breadRollType;
        this.hamburgerPrice = hamburgerPrice;
    }

    public Hamburger(String breadRollType) {
        this.breadRollType = breadRollType;
        this.hamburgerPrice = 10.00;
        this.meat = true;
    }

// use setters for Additions?
// public static void runCar(Car car) {
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());

    public void listAdditions(){
        System.out.println();
        System.out.println("You can choose between the following additions: \n" +
                "Cheese \n" +
                "Chips \n" +
                "Drink \n" +
                "Lettuce \n" +
                "Pickles \n" +
                "Sauce \n" +
                "Tomato");
    }



    public double addAdditions(Additions addition){
        if(additionsCount < maxAdditions) {
            additionsCount++;
            additionsCost += addition.getPrice();
            additionsList += addition.getAdditionName() + "    " + addition.getPrice() + "\n";
        } else {

            System.out.println();
            System.out.println("You have added the maximum number of additions.");
        }

        System.out.println();
        System.out.println("You have the following additions: \n" + additionsList);
        System.out.println("Your additions total: " + additionsCost);
        System.out.println("You can add " + (maxAdditions - additionsCount) + " more addition/s.");
        return additionsCost;
    }

    public void grandTotal(){
        double grandTotal = 0;
        grandTotal += getHamburgerPrice() + additionsCost;

        System.out.println("Your burger will cost: " + grandTotal);
    }



    public String getBreadRollType() {
        return breadRollType;
    }

    public double getHamburgerPrice() {
        return hamburgerPrice;
    }
}



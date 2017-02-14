package com.andi947;

/**
 * Created by Andrea on 2017/02/13.
 */
public class DeluxeHamburger extends Hamburger {
    private double deluxeBurgerPrice = getHamburgerPrice() + chips.getPrice() + drink.getPrice();

    public DeluxeHamburger(String breadRollType) {
        super(breadRollType, true, 15.00, 2);
//        System.out.println("The deluxe hamburger costs: \n" +
//        "hamburger: " + getHamburgerPrice() + "\n" +
//        "chips: " + chips.getPrice() + "\n" +
//        "drink: " + drink.getPrice() + "\n" +
//        "Total: " + deluxeBurgerPrice);
    }

    @Override
    public void listAdditions() {
        System.out.println("This burger comes with only the following additions: \n " + chips.getAdditionName()
                + " and " + drink.getAdditionName());
    }

    @Override
    public double addAdditions(Additions addition) {
        return -1;
    }

    @Override
    public void grandTotal() {
        System.out.println("The deluxe hamburger costs: " + deluxeBurgerPrice);
    }

    public double getDeluxeBurgerPrice() {
        return deluxeBurgerPrice;
    }
}

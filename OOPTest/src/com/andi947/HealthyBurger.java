package com.andi947;

/**
 * Created by Andrea on 2017/02/13.
 */
public class HealthyBurger extends Hamburger {

//    public HealthyBurger() {
//        super("Brown Rye bread roll", true, 12.00, 0, 0, "", 4+2);
//    }

    public HealthyBurger() {
        super("Brown rye bread roll", true, 12.00, 4+2);
    }

    @Override
    public double addAdditions(Additions addition) {
            if(additionsCount < maxAdditions) {
                additionsCount++;
                additionsCost += addition.getPrice();
                additionsList += addition.getAdditionName() + "    " + addition.getPrice() + "\n";
            } else {

                System.out.println();
                System.out.println("You have added the maximum number of additions.");
            }

            System.out.println();
            System.out.println("You have the following additions: \n" + additionsList );
            System.out.println("Your additions total: " + additionsCost);
            System.out.println("You can add " + (maxAdditions-additionsCount) + " more addition/s.");
            return additionsCost;
    }


}

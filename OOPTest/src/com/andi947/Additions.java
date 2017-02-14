package com.andi947;

/**
 * Created by Andrea on 2017/02/08.
 */
public class Additions {
    private String additionName;
    private double price;


    public Additions(String additionName, double price) {
        this.additionName = additionName;
        this.price = price;
    }

    public String getAdditionName() {
        return additionName;
    }

    public double getPrice() {
        return price;
    }
}

class Lettuce extends Additions{
    public Lettuce() {
        super("Lettuce", 0.50);
    }
}

class Tomato extends Additions{
    public Tomato() {
        super("Tomato", 0.50);
    }
}

class Pickles extends Additions{
    public Pickles() {
        super("Pickles", 0.50);
    }
}

class Cheese extends Additions {
    public Cheese() {
        super("Cheese", 1.50);
    }
}

class Sauce extends Additions {
    public Sauce() {
        super("Sauce", 1.00);
    }
}

class Chips extends Additions {
    public Chips() {
        super("Chips", 2.00);
    }
}

class Drink extends Additions {
    public Drink() {
        super("Drink", 2.00);
    }
}
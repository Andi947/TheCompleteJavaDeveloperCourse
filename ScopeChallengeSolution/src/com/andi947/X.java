package com.andi947;

import java.util.Scanner;

/**
 * Created by Andrea on 2017/04/25.
 */
public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Please enter a number: ");
        this.x = x.nextInt();
    }

    public void x(){
        for(int x=1; x<13; x++){
            System.out.println(x + " times " + this.x + " equals " + x*this.x);
        }
    }
}

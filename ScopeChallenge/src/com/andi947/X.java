package com.andi947;

import java.util.Scanner;


/**
 * Created by Andrea on 2017/04/25.
 */
public class X {

    private int x;

    public X() {
        Scanner x = new Scanner(System.in);
        System.out.println("Please select a number between 1-12: ");
        this.x = x.nextInt();

    }

    public void x(){
       for(int x=0; x<13; x++){
           System.out.println((x)*(this.x));
       }
    }
}

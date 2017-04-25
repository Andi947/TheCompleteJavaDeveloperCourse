package com.andi947;

/**
 * Created by Andrea on 2017/04/25.
 */
public class ExtendedPassword extends Password {  // -> change security of encrypting password
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}

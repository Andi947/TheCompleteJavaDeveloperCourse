package com.andi947;

/**
 * Created by Andrea on 2017/02/15.
 */
public class Contacts {

    private String name;
    private String phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return name + "\t " + phoneNumber;
    }  // when printing out from mobile phone using contacts - overrides the toString() print call (andi947.uniqueID)

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}


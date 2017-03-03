package com.andi947;

/**
 * Created by Andrea on 2017/02/21.
 */
public class Contact {
    private String name;
    private String phoneNumber;

    public static int andreasCoolObject = 1;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.andreasCoolObject = andreasCoolObject + 1;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

//    public static Contact createContact(String name, String phoneNumber){
//        return new Contact(name, phoneNumber);
//    }
}

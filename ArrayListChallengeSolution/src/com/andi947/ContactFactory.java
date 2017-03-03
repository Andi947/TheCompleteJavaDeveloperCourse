package com.andi947;

/**
 * Created by Andrea on 2017/02/22.
 */
public class ContactFactory {

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }

}

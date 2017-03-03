package com.andi947;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrea on 2017/02/15.
 */
public class MobilePhone {
    private List<Contacts> contacts = new ArrayList<Contacts>();

//    public ArrayList<Contacts> getContacts() {   // getter for ArrayList
//        return contacts;
//    }

    public void storeContact(String name, String phoneNumber) {
        boolean isPresent = isContactOnList(name.toLowerCase());
        if(isPresent) {
            System.out.println("Contact already exists");
        } else {
            Contacts newContact = new Contacts(name,phoneNumber);
            contacts.add(newContact);
        }

    }
    
   public void printContactsList(){
        System.out.println("You have " + contacts.size() + " contacts on your mobile phone");
        for (Contacts myContact: contacts) {      //for each - new for loop - only used for looping over lists
            System.out.println(myContact);
        }
   }

    public void updateContacts(String contactName, String updatedContactName, String updatedPhoneNumber){  // method overloading
        int position = findContact(contactName.toLowerCase());
        if(position>=0){
//            System.out.println("You can update this name");
            updateContact(position, updatedContactName, updatedPhoneNumber);
        }
    }
    private void updateContact(int position, String updatedContactName, String updatedPhoneNumber){

        contacts.get(position).setName(updatedContactName);
        contacts.get(position).setPhoneNumber(updatedPhoneNumber);

        System.out.println("Contact was updated as: " + updatedContactName + " and their number is: " + updatedPhoneNumber);
    }

    public void removeContact(String contact){
        int position = findContact(contact.toLowerCase());
        if(position>=0){
            removeContact(position);
        } else{
            System.out.println(contact + " is not on your mobile phone");
        }
    }
    private void removeContact(int position){
        String contact = contacts.get(position).getName();
        contacts.remove(position);
        System.out.println("You have removed " + contact + " from your mobile phone");
    }

    public boolean isContactOnList(String searchContact){
        int position = findContact(searchContact.toLowerCase());
        if(position >= 0){
            return true;
        }
        return false;
    }
    private int findContact(String searchContact) {

        int index = 0;
        for (Contacts myContact: contacts) {      //for each - new for loop - only used for looping over lists
            String contactName = myContact.getName();
            if (contactName.equals(searchContact)) {
                return index;
            }
            index++;

        }

        return -1;
//
//        for (int i = 0; i < contacts.size(); i++) {
//            String contactName = contacts.get(i).getName();
//            if (contactName.equals(searchContact)) {
//                return i;
//            }
//        }
//        return -1;
    }
//        boolean exists = contacts.contains(searchContact).getName();
//        int position = contacts.indexOf(searchContact);
//        if(position >=0){
//            return contacts.get(position);
//        }
//        return null;

}


package com.andi947;


/**
 * Created by Andrea on 2017/03/31.
 */
public abstract class ListItem{
    // (private means subclasses in direct package can access, but others can't) THUS PROTECTED
    protected ListItem nextLink;   // reference to the next element
    protected Object itemValue;  // current element value
    protected ListItem previousLink; // reference to the previous element

    // General constructor to generate itemValue for ListItem
    // Any concrete class that inherits from list item will need a constructor that sets the value

    public ListItem(Object itemValue) {
        this.itemValue = itemValue;
    }

    // returns a reference to the next ListItem in the list
    abstract ListItem next();  // abstract getter

    // passing parameter that sets the reference to next item to refer to the parameter = item
    abstract ListItem setNext(ListItem item); // abstract setter

    // returns a reference to the previous ListItem in the list
    abstract ListItem previous(); // abstract getter

    // passes parameter that sets the reference to previous item to refer to the parameter = item
    abstract ListItem setPrevious(ListItem item); // abstract setter

    // compares the object to the item returns 0 if equal, or a number >0 item after obj/ <0 item before obj
    abstract int compareTo(ListItem item);

    public Object getItemValue() {
        return itemValue;
    }

    public void setItemValue(Object itemValue) {
        this.itemValue = itemValue;
    }
}

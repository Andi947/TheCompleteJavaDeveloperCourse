package com.andi947;

/**
 * Created by Andrea on 2017/04/03.
 */
public class NodeA extends ListItem {

    // constructor generated for itemValue in ListItem class
    public NodeA(Object itemValue) {
        super(itemValue);
    }

    // methods overridden from Abstract ListItem class
    @Override
    // returns the link reference stored for the next item in list
    ListItem next() {
        return this.nextLink;
    }

    @Override
    // sets the next link reference to that of item parameter
    ListItem setNext(ListItem item) {
        this.nextLink = item;
        return this.nextLink;
    }

    @Override
    // returns the link reference stored for the previous item in list
    ListItem previous() {
        return this.previousLink;
    }

    @Override
    // sets the previous link reference to that of item parameter
    ListItem setPrevious(ListItem item) {
        this.previousLink = item;
        return this.previousLink;
    }

    @Override  // if we were using own classes to compare to, we'd have to create our own compareTo operator
    // checks that item is not equal to null
    // then converts super(ListItem) itemValue and item itemValue to string for comparison
    // returns an int to indicate the comparison result
    public int compareTo(ListItem item) {
        if(item != null) {
            // can return 0, positive or negative numbers
            return ((String) super.getItemValue()).compareTo((String) item.getItemValue());

        } else{
            return -1;  // because item is null
        }
    }
}

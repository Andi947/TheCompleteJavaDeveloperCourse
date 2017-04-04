package com.andi947;

/**
 * Created by Andrea on 2017/04/04.
 */
public interface NodeList {
    /** any data structure we create must have a starting node = head of list **/

    // returns the starting node/head/root (binary search trees)
    ListItem getRoot();

    //to add items to the structure
    boolean addItem(ListItem item);

    // remove items from the structure
    boolean removeItem(ListItem item);

    //will start at the root and print the values of each item in the structure
    void traverse(ListItem root);
}

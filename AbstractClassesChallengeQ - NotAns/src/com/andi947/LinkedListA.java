package com.andi947;

/**
 * Created by Andrea on 2017/04/03.
 */
public class LinkedListA{
//    private static int counter;
//    private NodeA head;
//    private NodeA tail;
//
//    // Constructor
//    public LinkedListA() {
//
//    }
//
//    public void add(String newItem) {
//
//        // temporarily stores the newItem as a node
////        tempItem.setItemValue((ListItem) newItem);
//        // checks to see if head is null, and creates first head node which becomes both the current and tail nodes
//        if (this.head.getItemValue() == null) {
//            this.head = tempItem;
//            this.currentItem = this.head;
//            this.tail = this.head;
//            // head is not null, now need to check if item exists and if not, where it needs to be placed
//        } else {
//            if(this.currentItem.getNext() == null) {
//                int x = this.currentItem.toString().compareTo(newItem);
//                if (x == 0) {
//                    System.out.println("This list item is already in the list");
//                }
//                if (x < 0) {
//                    this.currentItem.setNext(tempItem);
//                    this.nextItem = tempItem;
//                    this.nextItem.setPrevious(this.currentItem);
//                    this.tail = this.nextItem;
//                    this.head = this.currentItem;
//                } else {  // if x > 0
//                    this.currentItem.setPrevious(tempItem);
//                    this.previousItem = tempItem;
//                    this.previousItem.setNext(this.currentItem);
//                    this.head = this.previousItem;
//                    this.tail = this.currentItem;
//                }
//            } else {
//                // Loops through the items as currentItem until the getNext() has a null value (i.e. is the tail)
//                while (this.currentItem.getNext() != null) {
//
//                    // checks to see if new element(item) comes before (x > 0) or after (x < 0) current element
//                    // if x == 0, current and new are the same and new should not be added
//                    int x = this.currentItem.toString().compareTo(newItem);
//                    if (x < 0) {
//                        this.currentItem.moveNext();
//                    }
//                    if (x > 0) {
//                    } else {
//                        System.out.println("This list item already exists in the list");
//                    }
//                }
//            }
//        }
//    }
//
//    public void remove(ListItem item){
//
//    }

}

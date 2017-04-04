package com.andi947;


public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);  // not added anything yet
        list.traverse(list.getRoot());

//        Create a string data array to avoid typing loads of addItem instructions:
                String stringData = "5 7 3 9 8 2 1 0 4 6";

                String[] data = stringData.split(" ");
                for (String s : data) {
                    list.addItem(new NodeA(s));  //causes the implementation of our listitem class
                }
                list.traverse(list.getRoot());
    }
}











//        LinkedListA newList = new LinkedListA();
//        newList.add("Cat");
//        newList.add("Dog");
//
//        System.out.println(newList.getCurrentItem().getItemValue().toString());
//        System.out.println(newList.getCurrentItem().getNext().toString());
//        System.out.println(newList.getNextItem().getItemValue().toString());
//        System.out.println(newList.getNextItem().getPrevious().toString());


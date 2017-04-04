package com.andi947;

/**
 * Created by Andrea on 2017/04/04.
 */
public class MyLinkedList implements NodeList{

    private ListItem root = null; // the basic head of a list that exists when list is created

    // Default constructor initialising the root field for the list when the list is created
    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    // returns the root/ head of the list
    public ListItem getRoot() {
        return this.root;
    }

    @Override  //shortcut methods done in Solution
    //check for empty list item first
    //then add new item as head/root if list was empty
    // but if not empty - compare each item in the list with new item
    // the result will indicate where the new item should be inserted
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            // the list was empty thus item = head/root of list
            this.root = newItem;
            return true;
        }  // no else required because code would continue if first block wasn't called

        // create a currentItem and set it equal to root
        // each add thus starts looking from root
        ListItem currentItem = this.root;

        while(currentItem != null) {  // if we reach null = no more entries in list
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                // newItem is greater, thus move next if possible
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    // there is no next, thus insert at end of list
                    // the setNext null on current item is changed to refer to the new Itm
                    currentItem.setNext(newItem);
                    // the newItem's previous is set to refer to the currentItem
                    newItem.setPrevious(currentItem);
                    return true;

                    /** doing code in 1 line: when you setNext you return the
                    newItem as link thus when you set previous, you're doing
                    so on the returned item link:
                    currentItem.setNext(newItem).setPrevious(currentItem); **/
                }
            } else if(comparison > 0){
                // newItem is less, insert previous if possible
                if(currentItem.previous() != null){

                    // sets the next of current item's previous item to point to new item
                    currentItem.previous().setNext(newItem);

                    // sets the previous ref to current item's previous item)
                    newItem.setPrevious(currentItem.previous());

                    /**
                     currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                     newItem.setNext(currentItem).setPrevious(newItem);
                     **/

                    // sets the next ref of new item to point to current item
                    newItem.setNext(currentItem);

                    // sets the previous ref of current item to point to new item
                    currentItem.setPrevious(newItem);

                } else {
                    // there is no previous, thus insert as root
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
                    /**
                     currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                     newItem.setNext(currentItem).setPrevious(newItem);
                     **/
                    this.root = newItem;
                }
                return true;
            }else {
              // equal
                System.out.println(newItem.getItemValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item!= null){
        System.out.println("Deleting item " + item.getItemValue());
        }
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareTo(item);
            if(comparison == 0){
                //found the item to delete
                if(currentItem == this.root){
                    this.root = currentItem.next();
                } else {  // setting the previous and the next records to point to correct references
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            }else if(comparison < 0){
                currentItem = currentItem.next();
            }else { // comparison > 0
                // We are at an item greater than the one to be deleted
                // so the item is not in the list
                return false;
            }
        }
        // We have reached the end of our list
        // Without finding the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null){
            System.out.println("The list is empty");
        }else {
            while(root != null) {
                System.out.println(root.getItemValue());
                root = root.next();
            }
        }
    }
}

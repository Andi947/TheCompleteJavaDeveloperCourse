package com.andi947;

/**
 * Created by Andrea on 2017/04/25.
 */

// Challenge:
// In the following interface declaration, what is the visibility of:
//
// 1. Accessible interface?
// 2. the int variable SOME_CONSTANT?
// 3. methodA?
// 4. methodB and methodC?
//
// Hint: think back to the lecture on interfaces before answering

interface Accessible {    // package-private - only visible to classes in package
    int SOME_CONSTANT = 100;   // public - visible to all classes outside package once implemented
    public void methodA(); // public - visible to all classes outside package once implemented
    void methodB(); // public - visible to all classes outside package once implemented
    boolean methodC();  // public - visible to all classes outside package once implemented
}

// 1. package private - accessible to all classes in com.andi947 package
// 2. all interface variables are public static final (i.e. will not change)
// 3. public
// 4. public

// Not possible to have anything except public methods in an interface


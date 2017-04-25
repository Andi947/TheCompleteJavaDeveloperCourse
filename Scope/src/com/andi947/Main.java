package com.andi947;

public class Main {

    public static void main(String[] args) {
        String varFour = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.useInner();
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        System.out.println("varThree is not accessible here " + innerClass.varThree); // no visibility outside outerClass
//        System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());  // can only access via getter
//        System.out.println(varFour); // knows only the var declared in main(); only one available to access
//
//
//        scopeInstance.timesTwo();
//        System.out.println("*******************");
//
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        // there needs to be an instance of ScopeCheck to create an instance of InnerClass otherwise
//        // InnerClass won't exist - i.e. we create an instance of innerClass for our scopeInstance
//        innerClass.timesTwo();


    }
}

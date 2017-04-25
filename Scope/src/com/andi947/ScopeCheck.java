package com.andi947;

/**
 * Created by Andrea on 2017/04/25.
 */
public class ScopeCheck { // Java always looks for variable with the narrowest scope, most local - goes through blocks backwards
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo(){  // next block after current
        int varTwo = 2;   // if commented out, looks at previous blocks from current for variable
        for(int i=0; i<10; i++){  // i is declared here and as such, scope is limited to here
            System.out.println(i + " times two is " + i * varTwo); // current block  - can write this.field to specify the use of the field
        }
    }

    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
    }

    public class InnerClass {
        private int varThree = 3;

        public InnerClass() {
            System.out.println("InnerClass created, varOne is " + varOne + " and varThree is " + varThree);
        }

        public void timesTwo(){
            System.out.println("varOne is still available here " + varOne);
            for(int i=0; i<10; i++){
                System.out.println(i + " times two is " + i* varThree); // this.field - will look for field in InnerClass
            }  // can access the ScopeCHeck's field - ScopeCheck.this.varOne
        }
    }
}

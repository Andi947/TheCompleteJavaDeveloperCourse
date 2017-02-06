package com.andi947;

public class Main {

    public static void main(String[] args) {
        Account bobsAccount = new Account();
        // Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "myemail@bob.com", "0871234567");
//        This uses the constructor created in Account Class called Account() (a special method) to set the parameters.

//        Account bobsAccount = new Account();
//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmailAddress("myemail@bob.com");
//        bobsAccount.setCustomerPhoneNumber("0871234567");

        // when creating an obj for the first time using a class,
        // you can use constructors to set the initial parameters/ values of the fields
        // as well as any other initialization (just using a constructor)

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100.00);

        bobsAccount.deposit(50.00);
        bobsAccount.withdrawal(100.00);

        bobsAccount.deposit(51.00);
        bobsAccount.withdrawal(101.00);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

    }
}

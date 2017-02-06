package com.andi947;

public class Main {

    public static void main(String[] args) {
	// Challenge:
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. to allow the customer to deposit funds (this should increment the balance field)
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field
        // but not allow the withdrawal to complete if their are insufficient funds
        // You will want to create various code in the MAIN class to confirm that your
        // code is working
        // Add some System.out.println's in the two methods above as well

        BankAccount savings = new BankAccount();
        savings.setAccNumber("36678910");
        savings.setBalance(0.01);
        savings.setCustomerName("MR. A JONES");
        savings.setCustomerEmail("a.jones@gmail.com");
        savings.setCustomerPhone("+4423456789");

        System.out.println("Your account number is: " + savings.getAccNumber() +
                " and your balance is currently: " + String.format("%.2f", savings.getBalance()));
        System.out.println();
        System.out.println("This account belongs to: " + savings.getCustomerName());
        System.out.println("He can be reached via e-mail: " + savings.getCustomerEmail() + " or by phone: " +
                savings.getCustomerPhone());

        savings.Deposit(300.00);
        savings.Deposit(-0.03);
        savings.getBalance();
        savings.Withdrawal(400.00);
        savings.getBalance();
        savings.Withdrawal(-50.00);
        savings.getBalance();
        savings.Withdrawal(75.60);
        savings.getBalance();
    }
}

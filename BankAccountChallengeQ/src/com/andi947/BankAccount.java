package com.andi947;

/**
 * Created by Andrea on 2017/02/03.
 */
public class BankAccount {
    private String accNumber;   // could also work as an int as I originally used, but string is easier (avoids potential to do calc with variable)
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
	
	public void Deposit(double depositAmount){   // originally I put a return type double - not necessary
        if(depositAmount < 0){
            System.out.println("Value error - amount must be larger than 0.00");
			System.out.println("You have " + this.balance + " in your account.");
        } else {
            this.balance += depositAmount;			// NEED to REMEMBER the += and -= operators for these types of calculations
            System.out.println("You deposited " + depositAmount + " into your account. You now " +
                    "have " + this.balance + " in your account.");
        }
    }

    public void Withdrawal(double withdrawalAmount){   // originally I put a return type double - not necessary
        if (withdrawalAmount < 0) {
            System.out.println("Value error - amount must be larger than 0.00");
			System.out.println("You have " + this.balance + " in your account.");
        } else {

            if ((this.balance - withdrawalAmount) < 0) {		// NEED to REMEMBER that an IF STATEMENT can use this statement.
                System.out.println("Insufficient funds in your account. Withdrawal not processed.");  // added withdrawal not processed
				System.out.println("You have " + this.balance + " in your account.");
            } else {
                this.balance -= withdrawalAmount;
                System.out.println("You withdrew " + withdrawalAmount + " from your account. You now " +
                        "have " + this.balance + " in your account.");				// be consistent when using this.(anything).
            }
        }
    }

    public int getAccNumber() {
        return this.accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        System.out.println("You have " + this.balance + " in your account.");
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return this.customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    
}

package com.andi947;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", false);
        System.out.println();
        bank.listCustomers("Adelaide", true);

        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");

        if(!bank.addCustomer("Melbourne", "Brian", 5.33)){
            System.out.println("Error branch doesn't exist");
        }
        if(!bank.addBranch("Adelaide")){
            System.out.println("Branch already exists");
        }

        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)){
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomerTransaction("Sydney", "Tim", 52.33)){
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Adelaide", "Tim", 12.21)){
            System.out.println("Customer already exists");
        }

    }
}

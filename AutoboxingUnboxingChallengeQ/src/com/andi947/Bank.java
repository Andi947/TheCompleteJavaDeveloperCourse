package com.andi947;

import java.util.ArrayList;

/**
 * Created by Andrea on 2017/02/21.
 */
public class Bank {
    private ArrayList<Branch> branches;
    private String bankName;

    public Bank(String bankName) {
        System.out.println(bankName);
        this.branches = new ArrayList<Branch>();
        this.bankName = bankName;
        System.out.println(bankName);
    }

    public boolean addBranch(String name){
        Branch branch = findBranch(name);
        if(branch != null){
            System.out.println("Branch is already on file.");
            return false;
        }
        System.out.println("New branch added: " + name);
        branches.add(Branch.createBranch(name));
        return true;
    }

    public void printBranchList(){
        System.out.println("Branch List");
        for(int i=0; i<this.branches.size(); i++){
            System.out.println((i + 1) + ". " + this.branches.get(i).getBranchName() + " -> " +
                    this.branches.get(i).numberOfCustomers());
        }
    }

    public void printBranchList(String branchName){
        System.out.println("Branch List");
        for(int i=0; i<this.branches.size(); i++){
            if(branches.get(i).getBranchName().equals(branchName)){
                System.out.println((i + 1) + ". " + this.branches.get(i).getBranchName() + " -> " +
                        this.branches.get(i).numberOfCustomers());
            }

        }
    }

    public Branch findBranch(String name){
        for(int i=0; i<branches.size(); i++){
            Branch branch = this.branches.get(i);
            if(branch == null){
                return null;
            } if(branch.getBranchName() == null){
                return null;
            }
            if(branch.getBranchName().equals(name)){
//                System.out.println(name + " is found in file");
                return branch;
            }
        }
        return null;
    }



    public boolean addCustomer(String branchName, String customerName, double amount){
//        System.out.println(branchName);
//            if(findBranch(branchName) == null){
//                System.out.println("customer obj is null");
//            }
//            if(findBranch(branchName) == -3){
//                System.out.println("customer.getCustomerName() is null");
//            }
        Branch branch = findBranch(branchName);
        if(branch != null){
                branch.addCustomer(customerName, amount);
                return true;
            }
        System.out.println(branchName + " is not on file");
        return false;
    }

    public boolean addTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            branch.addTransaction(customerName, amount);

            return true;
        }
        System.out.println(branchName + " is not on file");
        return false;
    }

    public boolean addTransaction(String customerName, double amount){
        for(int i = 0; i <branches.size(); i++){
            branches.get(i).addTransaction(customerName, amount);
            return true;
        }
        return false;
    }

    public void printCustomerList(){
        for(int i=0; i<branches.size(); i++){
            System.out.print("For " + branches.get(i).getBranchName() + ": \n" + "\t");
            branches.get(i).printCustomerList();
            System.out.println();
        }
    }

    public void printCustomerList(String branchName){
        for(int i=0; i<branches.size(); i++){
            if(branches.get(i).getBranchName().equals(branchName)){
                System.out.print("For " + branches.get(i).getBranchName() + ": \n" + "\t");
                branches.get(i).printCustomerList();
                System.out.println();
            }
        }
    }

    public int findCustomer(String customerName){
//        System.out.println(name);
        for(int i=0; i<branches.size(); i++){
            branches.get(i).findCustomer(customerName);
            if(branches.get(i).getCustomers().get(i).getCustomerName().equals(customerName)){    //customer is returning null
                return i;
            }
        }
        return -1;
    }


    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public String getBankName() {
        return bankName;
    }


}

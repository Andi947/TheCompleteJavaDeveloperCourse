package com.andi947;

public class Main {

    public static void main(String[] args) {
	    // Create a new class VIPCustomer
        // it should have 3 fields name, credit limit, and email address
        // 1st constructor empty should call constructor with 3 parameters with default values
        // 2nd should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd should save all fields
        // Create getters only for this using code generation of IntelliJ as setters won't be needed
        // test and confirm it works.

        VIPCustomer timBuchalka = new VIPCustomer();
        System.out.println(timBuchalka.getName());
        System.out.println(timBuchalka.getCreditLimit());
        System.out.println(timBuchalka.getEmailAddress());

        System.out.println();

        VIPCustomer etPhilips = new VIPCustomer("Etienne Philips", 10000.00);
        System.out.println(etPhilips.getEmailAddress());

        System.out.println();

        VIPCustomer sabiPhilips = new VIPCustomer("Sabina Philips", 30000.00, "sabi@email.com");
        System.out.println(sabiPhilips.getName());
        System.out.println(sabiPhilips.getCreditLimit());
        System.out.println(sabiPhilips.getEmailAddress());

    }
}

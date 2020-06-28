package com.java.bankapp;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Bangladesh Bank");
        bank.addBranch("Dhaka");
        bank.addCustomer("Dhaka", "Shahnewaz", 5000);
        bank.addCustomer("Dhaka", "Tameem", 4000);
        bank.addCustomer("Dhaka", "Saied", 1000);

        bank.addBranch("Khulna");
        bank.addCustomer("Khulna", "Rafi", 2500);
        bank.addCustomerTransaction("Dhaka", "Saied", 500);
        bank.addCustomerTransaction("Khulna", "Tameem", 5500);
        bank.addCustomerTransaction("Dhaka", "Shahnewaz", 5000);

         bank.listCustomers("Dhaka", true);
    }
}

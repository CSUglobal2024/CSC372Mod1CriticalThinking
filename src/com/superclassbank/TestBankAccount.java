package com.superclassbank;

public class TestBankAccount {
    public static void main(String[] args) {
        // Testing BankAccount class
        BankAccount account1 = new BankAccount();
        account1.setFirstName("John");
        account1.setLastName("Doe");
        account1.setAccountID(1001);
        account1.deposit(1000);
        account1.accountSummary();
        System.out.println();

        // Testing CheckingAccount class
        CheckingAccount account2 = new CheckingAccount();
        account2.setFirstName("Jane");
        account2.setLastName("Smith");
        account2.setAccountID(2002);
        account2.deposit(2000);
        account2.setInterestRate(1.5);
        account2.withdrawal(2500);
        account2.displayAccount();
    }
}

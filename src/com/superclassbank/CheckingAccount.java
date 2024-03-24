package com.superclassbank;

public class CheckingAccount extends BankAccount {
    private double interestRate;

    public CheckingAccount() {
        super();
    }

    // Setters
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Getter
    public double getInterestRate() {
        return interestRate;
    }

    // Overridden method to handle withdrawal including overdraft fee
    @Override
    public void withdrawal(double amount) {
        double overdraftFee = 30.0;
        if (amount > getBalance()) {
            super.withdrawal(amount + overdraftFee);
            System.out.println("Overdraft Fee of $" + overdraftFee + " applied.");
        } else {
            super.withdrawal(amount);
        }
    }

    // Method to display account details including interest rate
    public void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


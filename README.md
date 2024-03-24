Instructions:
Option #1:  Implementing a Superclass Bank Account
Part 1: Implement a superclass BankAccount that has the following fields and methods.

Fields:

string firstName
string lastName
int accountID
double balance
Methods:  

constructor():  initialize balance to zero
deposit() - will accept a single value double parameter; the parameter value is added to the existing balance
withdrawal() - accepts a single value double dollar amount; the parameter value is subtracted from the existing balance
Setters and getters for firstName, lastName, and accountID
getBalance() getter to return the balance
accountSummary() - prints all account information
Part 2: Implement a CheckingAccount class that inherits from the BankAccount class, that: 

Has an interest rate attribute
Allows overdraft withdrawals and charges a $30 fee
Methods:

processWithdrawal() - will display a negative balance that includes a $30 overdraft fee and denotes that a fee has been accessed
displayAccount() - should display all superclass attributes and provides an additional interest rate
Ensure that your program has the two required classes and a test class.

Place each Java class into a separate Java source file.

Students must use appropriate version control for all programmatic assignments created. GIT repositories should be established and screen captures of repositories submitted with each assignment.

Submit screenshots of your program's execution and output. Include all appropriate source code in a zip file.

Pseudocode:

// BankAccount class
class BankAccount:
    // Fields
    string firstName
    string lastName
    int accountID
    double balance

    // Constructor
    constructor():
        balance = 0

    // Method to deposit money
    method deposit(amount: double):
        balance += amount

    // Method to withdraw money
    method withdrawal(amount: double):
        balance -= amount

    // Setters and getters
    method setFirstName(firstName: string)
    method getFirstName(): string
    method setLastName(lastName: string)
    method getLastName(): string
    method setAccountID(accountID: int)
    method getAccountID(): int

    // Getter for balance
    method getBalance(): double

    // Method to print account summary
    method accountSummary():
        print "First Name: " + firstName
        print "Last Name: " + lastName
        print "Account ID: " + accountID
        print "Balance: $" + balance

// CheckingAccount class inheriting from BankAccount class
class CheckingAccount inherits BankAccount:
    // Additional field
    double interestRate

    // Constructor
    constructor(interestRate: double):
        // Call superclass constructor
        super.constructor()
        this.interestRate = interestRate

    // Method to process withdrawal
    method processWithdrawal(amount: double):
        if (amount > balance):
            balance -= (amount + 30)  // Charge overdraft fee
            print "Overdraft fee of $30 has been applied."
            print "New balance: $" + balance
        else:
            balance -= amount

    // Method to display account details
    method displayAccount():
        // Call superclass accountSummary() method
        super.accountSummary()
        print "Interest Rate: " + interestRate

// Test class
class TestBankAccounts:
    method main():
        // Create a BankAccount object
        BankAccount account1 = new BankAccount()

        // Set account details
        account1.setFirstName("John")
        account1.setLastName("Doe")
        account1.setAccountID(123456)
        
        // Deposit and withdraw money
        account1.deposit(1000)
        account1.withdrawal(500)
        
        // Print account summary
        account1.accountSummary()

        // Create a CheckingAccount object
        CheckingAccount checkingAccount1 = new CheckingAccount(0.05)

        // Set account details
        checkingAccount1.setFirstName("Jane")
        checkingAccount1.setLastName("Smith")
        checkingAccount1.setAccountID(654321)

        // Deposit and withdraw money
        checkingAccount1.deposit(2000)
        checkingAccount1.withdrawal(2500)

        // Print account summary
        checkingAccount1.accountSummary()





















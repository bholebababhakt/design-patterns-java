package designpattern.structuralpattern.privateclassdata;

// Class that holds the bank account data
class BankAccountData {
    private String accountHolderName;
    private double balance;  // Mutable, but private and encapsulated

    // Constructor to initialize the data
    public BankAccountData(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters for the encapsulated data
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter for balance is private, so only BankAccount class can modify the balance
    private void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit and withdraw methods to control balance changes
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(this.balance + amount); // Safely update the balance
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            setBalance(this.balance - amount); // Safely update the balance
        }
    }
}


package designpattern.structuralpattern.privateclassdata;

// Main BankAccount class that uses BankAccountData
class BankAccount {
    private final BankAccountData data; // Encapsulated data

    public BankAccount(String accountHolderName, double balance) {
        this.data = new BankAccountData(accountHolderName, balance);
    }

    // Expose only the necessary public methods to interact with the data
    public String getAccountHolderName() {
        return data.getAccountHolderName();
    }

    public double getBalance() {
        return data.getBalance();
    }

    // Methods to allow controlled balance changes
    public void deposit(double amount) {
        data.deposit(amount);
    }

    public void withdraw(double amount) {
        data.withdraw(amount);
    }

    // Printing account details
    public void printAccountDetails() {
        System.out.println("Account Holder: " + getAccountHolderName());
        System.out.println("Balance: $" + getBalance());
    }
}

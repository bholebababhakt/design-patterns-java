package designpattern.structuralpattern.facade;

// Subsystem 2: Funds Check
class FundChecker {
    public boolean hasSufficientFunds(String accountNumber, double amount) {
        System.out.println("Checking if account " + accountNumber + " has sufficient funds.");
        return true; // Assume there are sufficient funds
    }
}
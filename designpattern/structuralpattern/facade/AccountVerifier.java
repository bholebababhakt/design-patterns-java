package designpattern.structuralpattern.facade;

// Subsystem 1: Account Verification
class AccountVerifier {
    public boolean verifyAccount(String accountNumber) {
        System.out.println("Verifying account: " + accountNumber);
        return true; // Assume verification is always successful
    }
}
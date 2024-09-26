package designpattern.structuralpattern.facade;

// Subsystem 3: Security Check
class SecurityChecker {
    public boolean securityCheck(String accountNumber) {
        System.out.println("Performing security check for account: " + accountNumber);
        return true; // Assume security check passes
    }
}

package designpattern.structuralpattern.facade;

// Subsystem 4: Transaction Processing
class TransactionProcessor {
    public void processTransaction(String fromAccount, String toAccount, double amount) {
        System.out.println("Transferring " + amount + " from " + fromAccount + " to " + toAccount);
    }
}

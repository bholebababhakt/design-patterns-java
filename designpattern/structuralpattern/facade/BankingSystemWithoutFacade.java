package designpattern.structuralpattern.facade;

// Client manually interacting with each subsystem
public class BankingSystemWithoutFacade {
    public static void main(String[] args) {
        String fromAccount = "12345";
        String toAccount = "67890";
        double amount = 100.0;

        // The client has to interact with multiple systems directly
        AccountVerifier verifier = new AccountVerifier();
        FundChecker fundChecker = new FundChecker();
        SecurityChecker securityChecker = new SecurityChecker();
        TransactionProcessor transactionProcessor = new TransactionProcessor();

        // Step-by-step manual process
        if (verifier.verifyAccount(fromAccount) && fundChecker.hasSufficientFunds(fromAccount, amount) && securityChecker.securityCheck(fromAccount)) {
            transactionProcessor.processTransaction(fromAccount, toAccount, amount);
        } else {
            System.out.println("Transaction failed.");
        }
    }
}

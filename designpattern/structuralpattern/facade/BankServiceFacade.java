package designpattern.structuralpattern.facade;

public class BankServiceFacade {
    private AccountVerifier accountVerifier;
    private FundChecker fundChecker;
    private SecurityChecker securityChecker;
    private TransactionProcessor transactionProcessor;

    public BankServiceFacade(){
        accountVerifier = new AccountVerifier();
        fundChecker = new FundChecker();
        securityChecker = new SecurityChecker();
        transactionProcessor = new TransactionProcessor();
    }
    public void transferMoney(String fromAccount,String toAccount, Double amount){
        if(accountVerifier.verifyAccount(fromAccount)&& fundChecker.hasSufficientFunds(fromAccount,amount)&&securityChecker.securityCheck(fromAccount)){
            transactionProcessor.processTransaction(fromAccount,toAccount,amount);
            System.out.println("transaction completed successfully");
        }
        else {
            System.out.println("Transaction failed due to insufficient funds or security issues.");
        }
    }
}

package designpattern.structuralpattern.facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        BankServiceFacade bankServiceFacade = new BankServiceFacade();
        String fromAccount = "764534567";
        String toAccount = "9876534567";
        Double amount = 1009.00;
        bankServiceFacade.transferMoney(fromAccount,toAccount,amount);
    }
}

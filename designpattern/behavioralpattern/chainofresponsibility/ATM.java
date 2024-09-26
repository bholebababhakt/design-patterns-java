package designpattern.behavioralpattern.chainofresponsibility;

public class ATM {
    private MoneyDispenser chain;
    public ATM(){
        MoneyDispenser fiveHundredDispenser = new FiveHundredDispenser();
        MoneyDispenser hundredDispenser = new HundredDispenser();
        MoneyDispenser fiftyDispenser = new FiftyDispenser();
        MoneyDispenser tenDispenser = new TenDispenser();
        fiveHundredDispenser.setNextDispenser(hundredDispenser);
        fiftyDispenser.setNextDispenser(tenDispenser);
        hundredDispenser.setNextDispenser(fiftyDispenser);
        this.chain = fiveHundredDispenser;
    }
    public void withdraw(int amount){
        if(amount%10 !=0){
            System.out.println("Amount should be in multiples of 10");
            return;
        }
        chain.dispense(amount);
    }
}

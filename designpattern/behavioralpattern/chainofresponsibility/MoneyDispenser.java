package designpattern.behavioralpattern.chainofresponsibility;

// Abstract Handler Interface
public abstract class MoneyDispenser {


    protected MoneyDispenser nextDispenser;

    // Set the next dispenser in the chain
    public void setNextDispenser(MoneyDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    // Method to handle the request (dispense money)
    public abstract void dispense(int amount);
}

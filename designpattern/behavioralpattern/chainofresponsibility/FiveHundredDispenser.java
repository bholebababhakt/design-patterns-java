package designpattern.behavioralpattern.chainofresponsibility;

public class FiveHundredDispenser extends MoneyDispenser {
    @Override
    public void dispense(int amount) {
        if (amount >= 500) {
            int numBills = amount / 500;
            int remainder = amount % 500;
            System.out.println("Dispensing " + numBills + " Rs500 bill(s)");
            if (remainder != 0 && nextDispenser != null) {
                nextDispenser.dispense(remainder); // Pass the remaining amount to the next dispenser
            }
        } else {
            nextDispenser.dispense(amount); // Pass the entire amount to the next dispenser
        }
    }
}


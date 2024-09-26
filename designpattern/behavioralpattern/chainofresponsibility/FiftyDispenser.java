package designpattern.behavioralpattern.chainofresponsibility;

public class FiftyDispenser extends MoneyDispenser {
    @Override
    public void dispense(int amount) {
        if (amount >= 50) {
            int numBills = amount / 50;
            int remainder = amount % 50;
            System.out.println("Dispensing " + numBills + " Rs50 bill(s)");
            if (remainder != 0 && nextDispenser != null) {
                nextDispenser.dispense(remainder); // Pass the remaining amount to the next dispenser
            }
        } else {
            nextDispenser.dispense(amount); // Pass the entire amount to the next dispenser
        }
    }
}

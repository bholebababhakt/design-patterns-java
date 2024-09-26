package designpattern.behavioralpattern.chainofresponsibility;

public class HundredDispenser extends MoneyDispenser{
    @Override
    public void dispense(int amount) {
        if (amount >= 100) {
            int numBills = amount / 100;
            int remainder = amount % 100;
            System.out.println("Dispensing " + numBills + " Rs100 bill(s)");
            if (remainder != 0 && nextDispenser != null) {
                nextDispenser.dispense(remainder); // Pass the remaining amount to the next dispenser
            }
        } else {
            nextDispenser.dispense(amount); // Pass the entire amount to the next dispenser
        }
    }
}

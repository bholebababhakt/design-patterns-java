package designpattern.behavioralpattern.chainofresponsibility;

public class TenDispenser extends MoneyDispenser {
    @Override
    public void dispense(int amount) {
        if (amount >= 10) {
            int numBills = amount / 10;
            int remainder = amount % 10;
            System.out.println("Dispensing " + numBills + " Rs10 bill(s)");
            if (remainder != 0 && nextDispenser != null) {
                nextDispenser.dispense(remainder); // Pass the remaining amount to the next dispenser
            }
        } else {
            nextDispenser.dispense(amount); // Pass the entire amount to the next dispenser
        }
    }
}

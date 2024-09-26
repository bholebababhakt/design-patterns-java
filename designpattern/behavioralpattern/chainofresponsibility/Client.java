package designpattern.behavioralpattern.chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.withdraw(2990);
        atm.withdraw(101);
    }
}

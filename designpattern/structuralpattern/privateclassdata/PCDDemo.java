package designpattern.structuralpattern.privateclassdata;

public class PCDDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 1000.0);
        account.printAccountDetails();

        // Perform some operations on the balance
        account.deposit(500);
        System.out.println("After deposit: $" + account.getBalance());

        account.withdraw(300);
        System.out.println("After withdrawal: $" + account.getBalance());

        // Balance can't be directly modified (no direct setter)
        // account.data.setBalance(10000); // This would not compile
    }
}

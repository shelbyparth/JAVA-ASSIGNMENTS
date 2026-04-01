// Group no. 9
//Assignment no. 7
/*
Abstract Class:
An abstract class is a class that cannot be instantiated.
It can have:
Abstract methods (without body), non-abstract methods (with body)
Used when classes share a common base with some implementation.

Key Points-
Declared using abstract keyword
Can have constructors
Can have instance variables
Supports partial abstraction
 */

abstract class BankAccount {

    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    // abstract method
    abstract void calculateInterest();

    // normal method
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
}

// Child class
class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    void calculateInterest() {
        double interest = balance * 0.04;
        System.out.println("Savings Interest: " + interest);
    }
}

// Main class
public class Abstract {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(1000);
        acc.deposit(500);
        acc.calculateInterest();
    }
}

/*
Output-
Deposited: 500.0
Savings Interest: 60.0
*/
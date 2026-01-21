package Task_21_01_2026.Questions;
import java.util.*;

interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }

    public abstract double calculateInterest();

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    public double calculateInterest() {
        return balance * 0.04;
    }

    public void applyForLoan() {}

    public double calculateLoanEligibility() {
        return balance * 5;
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    public double calculateInterest() {
        return balance * 0.02;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = List.of(
                new SavingsAccount("SA101", "Ashish", 50000),
                new CurrentAccount("CA202", "Ravi", 80000)
        );

        for (BankAccount acc : accounts) {
            System.out.println("Interest : " + acc.calculateInterest());
        }
    }
}

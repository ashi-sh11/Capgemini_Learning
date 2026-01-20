package Task_19_01_2026.HierarchicalInheritance;

public class BankAccountSystem {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("5634325101", 50000, 4.5);
        CheckingAccount checking = new CheckingAccount("657925202", 30000, 10000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("978765345303", 200000, 24);

        System.out.println("=== Savings Account ===");
        savings.displayAccountDetails();
        savings.displayAccountType();

        System.out.println("\n=== Checking Account ===");
        checking.displayAccountDetails();
        checking.displayAccountType();

        System.out.println("\n=== Fixed Deposit Account ===");
        fixedDeposit.displayAccountDetails();
        fixedDeposit.displayAccountType();
    }
}


class BankAccount {

    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : INR " + balance);
    }
}


class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type   : Savings Account");
        System.out.println("Interest Rate : " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {

    private double withdrawalLimit ;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type      : Checking Account");
        System.out.println("Withdrawal Limit : INR " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {

    private int tenure;

    public FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    public void displayAccountType() {
        System.out.println("Account Type : Fixed Deposit Account");
        System.out.println("Tenure      : " + tenure + " months");
    }
}

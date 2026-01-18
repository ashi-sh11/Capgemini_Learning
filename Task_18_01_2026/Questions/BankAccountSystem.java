package Task_18_01_2026.Questions;

public class BankAccountSystem {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Ashish", 101, 5000);
        BankAccount acc2 = new BankAccount("Rahul", 102, 8000);
        acc1.deposit(2000);
        System.out.println("=== Account Details ===");
        BankAccount.displayIfValidAccount(acc1);
        System.out.println("\nTotal Accounts in Bank: " +
                BankAccount.getTotalAccounts());
    }
}
class BankAccount {

    private static String bankName = "Capgemini Bank";
    private static int totalAccounts = 0;
    private String accountHolderName;
    private final int accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void displayDetails() {
        System.out.println("Bank Name        : " + bankName);
        System.out.println("Account Holder   : " + accountHolderName);
        System.out.println("Account Number   : " + accountNumber);
        System.out.println("Balance          : ₹" + balance);
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void displayIfValidAccount(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount account = (BankAccount) obj;
            account.displayDetails();
        } else {
            System.out.println("Invalid object. Not a BankAccount.");
        }
    }
}

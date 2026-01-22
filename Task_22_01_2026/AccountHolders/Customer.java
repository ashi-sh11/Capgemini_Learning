package Task_22_01_2026.AccountHolders;

public class Customer {
    private String name;
    private double balance;

    public Customer(String name) {
        this.name = name;
    }

    public void viewBalance() {
        System.out.println(name + " Balance: " + balance);
    }

    void setBalance(double balance) {
        this.balance = balance;
    }
}

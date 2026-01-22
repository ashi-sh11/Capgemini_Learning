package Task_22_01_2026.AccountHolders;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("HDFC");
        Customer customer = new Customer("Ashish");
        Customer customer1 = new Customer("Aman");

        bank.openAccount(customer, 5000);
        bank.openAccount(customer1, 50050);
        customer.viewBalance();
    }
}

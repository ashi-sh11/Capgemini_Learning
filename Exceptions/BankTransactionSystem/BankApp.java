package Task_05_02_2026.Exceptions.BankTransactionSystem;

public class BankApp {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        try {
            account.withdraw(6000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

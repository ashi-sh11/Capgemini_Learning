package Task_05_02_2026.Exceptions.BankTransactionSystem;

class BankAccount {
    private double balance = 5000;

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= amount;
        System.out.println(
                "Withdrawal successful, new balance: " + balance
        );
    }
}

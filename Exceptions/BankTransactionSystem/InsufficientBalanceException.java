package Task_05_02_2026.Exceptions.BankTransactionSystem;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

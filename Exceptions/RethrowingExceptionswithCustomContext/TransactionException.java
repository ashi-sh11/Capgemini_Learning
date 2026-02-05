package Task_05_02_2026.Exceptions.RethrowingExceptionswithCustomContext;

class TransactionException extends Exception {
    public TransactionException(String message) {
        super(message);
    }
}

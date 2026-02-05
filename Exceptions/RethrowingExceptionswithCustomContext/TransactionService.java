package Task_05_02_2026.Exceptions.RethrowingExceptionswithCustomContext;

class TransactionService {

    public static void processTransaction(String userId, double amount)
            throws TransactionException {

        try {
            if (amount <= 0) {
                throw new TransactionException("Invalid transaction amount");
            }
            System.out.println("Transaction successful for user: " + userId);

        } catch (TransactionException e) {
            throw new TransactionException(
                    "Transaction failed for user " + userId + ": " + e.getMessage()
            );
        }
    }
}

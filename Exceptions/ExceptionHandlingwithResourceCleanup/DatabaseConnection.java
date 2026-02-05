package Task_05_02_2026.Exceptions.ExceptionHandlingwithResourceCleanup;

class DatabaseConnection implements AutoCloseable {
    public void connect() {
        System.out.println("Database connected");
    }
    public void execute() {
        throw new RuntimeException("Execution error");
    }
    @Override
    public void close() {
        System.out.println("Database connection closed");
    }
}

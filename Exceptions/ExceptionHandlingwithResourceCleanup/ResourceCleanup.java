package Task_05_02_2026.Exceptions.ExceptionHandlingwithResourceCleanup;

public class ResourceCleanup {
    public static void main(String[] args) {

        try (DatabaseConnection db = new DatabaseConnection()) {
            db.connect();
            db.execute();
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

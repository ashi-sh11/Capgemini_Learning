package Task_06_02_2026.Regex.BeforeAndAfter;

public class DatabaseConnection {
    boolean connected = false;

    void connect() {
        connected = true;
    }

    void disconnect() {
        connected = false;
    }
}

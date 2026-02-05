package Task_05_02_2026.Exceptions.ThrowandThrows;

public class UserApp {
    public static void main(String[] args) {

        UserService service = new UserService();
        try {
            service.registerUser("ashish");
            service.registerUser("ashish"); // duplicate user
        }
        catch (UserAlreadyExistsException e) {
            System.out.println("Registration Error: " + e.getMessage());
        }
        try {
            service.checkUserExistence("rahul"); // user not found
        }
        catch (UserNotFoundException e) {
            System.out.println("Lookup Error: " + e.getMessage());
        }
    }
}

package Task_05_02_2026.Exceptions.ThrowandThrows;

import java.util.HashSet;
import java.util.Set;

class UserService {

    private Set<String> users = new HashSet<>();

    public void registerUser(String username)
            throws UserAlreadyExistsException {

        if (users.contains(username)) {
            throw new UserAlreadyExistsException(
                    "User '" + username + "' already exists."
            );
        }
        users.add(username);
        System.out.println("User registered successfully: " + username);
    }

    public void checkUserExistence(String username)
            throws UserNotFoundException {

        if (!users.contains(username)) {
            throw new UserNotFoundException(
                    "User '" + username + "' not found."
            );
        }

        System.out.println("User exists: " + username);
    }
}

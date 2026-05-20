import java.util.ArrayList;
import java.util.List;

/**
 * AuthenticationService handles user login and logout operations
 * Manages multiple user accounts
 */
public class AuthenticationService {
    // List to store all registered user accounts
    private List<UserAccount> userAccounts;
    private UserAccount currentLoggedInUser;

    // Constructor
    public AuthenticationService() {
        this.userAccounts = new ArrayList<>();
        this.currentLoggedInUser = null;
    }

    /**
     * Register a new user account
     * @param account - UserAccount to register
     */
    public void registerAccount(UserAccount account) {
        userAccounts.add(account);
        System.out.println("Account registered successfully for: " + account.getUsername());
    }

    /**
     * Attempt to login with username and password
     * @param username - user's username
     * @param password - user's password
     * @return true if login successful, false otherwise
     */
    public boolean login(String username, String password) {
        for (UserAccount account : userAccounts) {
            if (account.validateCredentials(username, password)) {
                currentLoggedInUser = account;
                System.out.println("\n*** Login Successful! ***");
                System.out.println("Welcome, " + account.getStudent().getName() + "!");
                return true;
            }
        }
        System.out.println("\n*** Login Failed! Invalid credentials. ***");
        return false;
    }

    /**
     * Logout the current user
     */
    public void logout() {
        if (currentLoggedInUser != null) {
            System.out.println("\n*** Logging out " + currentLoggedInUser.getUsername() + " ***");
            currentLoggedInUser = null;
            System.out.println("Logout successful!");
        } else {
            System.out.println("No user is currently logged in.");
        }
    }

    /**
     * Get the currently logged in user
     * @return current UserAccount or null if no one is logged in
     */
    public UserAccount getCurrentUser() {
        return currentLoggedInUser;
    }

    /**
     * Check if a user is currently logged in
     * @return true if user is logged in, false otherwise
     */
    public boolean isUserLoggedIn() {
        return currentLoggedInUser != null;
    }
}
/**
 * UserAccount class manages user login credentials
 * Links a Student (which is a Person) with authentication details
 */
public class UserAccount {
    // Private fields for security
    private String username;
    private String password;
    private Student student; // Composition with Student (which extends Person)

    // Constructor
    public UserAccount(String username, String password, Student student) {
        this.username = username;
        this.password = password;
        this.student = student;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public Student getStudent() {
        return student;
    }

    /**
     * Validates user credentials
     * @param inputUsername - username to validate
     * @param inputPassword - password to validate
     * @return true if credentials match, false otherwise
     */
    public boolean validateCredentials(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    /**
     * Display account information (without showing password)
     */
    public void displayAccountInfo() {
        System.out.println("\n=== Account Information ===");
        System.out.println("Username: " + username);
        System.out.println("Student: " + student.getName());
        System.out.println("==========================");
    }
}
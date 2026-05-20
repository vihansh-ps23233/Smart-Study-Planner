/**
 * Person - Abstract parent class demonstrating INHERITANCE
 * This is the base class for all person types in the system
 */
public abstract class Person {
    // Protected fields - accessible by child classes
    protected String name;
    protected String email;

    // Constructor
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Abstract method - must be implemented by child classes
     * This demonstrates POLYMORPHISM
     */
    public abstract void displayDetails();

    /**
     * Common method available to all persons
     */
    public void displayContactInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
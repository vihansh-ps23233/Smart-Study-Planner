/**
 * Student class extends Person - demonstrates INHERITANCE
 * Inherits name and email from Person parent class
 */
public class Student extends Person {
    // Student-specific field
    private String studentId;

    // Constructor
    public Student(String studentId, String name, String email) {
        super(name, email); // Call parent constructor
        this.studentId = studentId;
    }

    // Getter for studentId
    public String getStudentId() {
        return studentId;
    }

    /**
     * Override abstract method from Person - demonstrates POLYMORPHISM
     * Each child class implements this differently
     */
    @Override
    public void displayDetails() {
        System.out.println("\n=== Student Details ===");
        System.out.println("Student ID: " + studentId);
        displayContactInfo(); // Call inherited method from Person
        System.out.println("======================");
    }

    /**
     * Student-specific method
     */
    public void study() {
        System.out.println(name + " is studying...");
    }
}
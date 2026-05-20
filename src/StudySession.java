/**
 * StudySession class tracks study time for a specific subject
 */
public class StudySession {
    // Private fields
    private String sessionId;
    private Subject subject;
    private double durationInHours;

    // Constructor
    public StudySession(String sessionId, Subject subject, double durationInHours) {
        this.sessionId = sessionId;
        this.subject = subject;
        this.durationInHours = durationInHours;
    }

    // Getters
    public String getSessionId() {
        return sessionId;
    }

    public Subject getSubject() {
        return subject;
    }

    public double getDurationInHours() {
        return durationInHours;
    }

    // Setters
    public void setDurationInHours(double durationInHours) {
        this.durationInHours = durationInHours;
    }

    /**
     * Display study session information
     */
    public void displaySession() {
        System.out.println("\n--- Study Session ---");
        System.out.println("Session ID: " + sessionId);
        System.out.println("Subject: " + subject.getSubjectName() + " (" + subject.getSubjectCode() + ")");
        System.out.println("Duration: " + durationInHours + " hours");
        System.out.println("--------------------");
    }
}
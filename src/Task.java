/**
 * Task class represents a study task with deadline and priority
 */
public class Task {
    // Private fields
    private String taskId;
    private String taskName;
    private String deadline;
    private String priority; // HIGH, MEDIUM, LOW
    private boolean isCompleted;

    // Constructor
    public Task(String taskId, String taskName, String deadline, String priority) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.deadline = deadline;
        this.priority = priority;
        this.isCompleted = false; // Initially not completed
    }

    // Getters
    public String getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    // Setters
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * Mark the task as completed
     */
    public void markCompleted() {
        this.isCompleted = true;
        System.out.println("Task '" + taskName + "' marked as completed!");
    }

    /**
     * Display task details
     */
    public void displayTask() {
        System.out.println("\n--- Task Details ---");
        System.out.println("Task ID: " + taskId);
        System.out.println("Name: " + taskName);
        System.out.println("Deadline: " + deadline);
        System.out.println("Priority: " + priority);
        System.out.println("Status: " + (isCompleted ? "COMPLETED" : "PENDING"));
        System.out.println("-------------------");
    }
}
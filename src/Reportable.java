/**
 * Reportable interface - defines contract for generating reports
 * Classes implementing this interface demonstrate POLYMORPHISM
 */
public interface Reportable {
    /**
     * Generate and display a report
     */
    void generateReport();

    /**
     * Get report type
     */
    String getReportType();
}
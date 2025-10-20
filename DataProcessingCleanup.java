public class DataProcessingCleanup {

    // Simulated data processing method
    static void processData() {
        try {
            // Simulating invalid input exception
            throw new Exception("Invalid input");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            // Cleanup code (always runs)
            System.out.println("Data processing completed");
        }
    }

    public static void main(String[] args) {
        processData();
    }
}

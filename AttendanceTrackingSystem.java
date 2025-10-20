import java.util.*;

public class AttendanceTrackingSystem {
    public static void main(String[] args) {
        TreeMap<String, Integer> attendance = new TreeMap<>();

        
        attendance.put("Amit", 90);
        attendance.put("Rohan", 85);
        attendance.put("Priya", 95);

        
        System.out.println("Attendance Report:");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

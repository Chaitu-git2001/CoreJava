import java.util.*;

public class GradeBasedFilter {
    public static void main(String[] args) {
        
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Amit", 85);
        studentGrades.put("Priya", 52);
        studentGrades.put("Rohan", 78);

        int threshold = 60;

        
        studentGrades.entrySet().removeIf(entry -> entry.getValue() < threshold);

        
        System.out.println("Honor Roll:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

import java.util.*;

public class GradeDistributionCounter {
    public static void main(String[] args) {
        
        String[] grades = {"A", "B", "A", "C", "B", "A"};

        
        Map<String, Integer> gradeCount = new HashMap<>();
        for (String grade : grades) {
            gradeCount.put(grade, gradeCount.getOrDefault(grade, 0) + 1);
        }

        
        System.out.println("Grade Distribution:");
        for (Map.Entry<String, Integer> entry : gradeCount.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}

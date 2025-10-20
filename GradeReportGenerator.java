import java.util.*;

public class GradeReportGenerator {
    public static void main(String[] args) {
        
        Map<String, Integer> studentGrades = new LinkedHashMap<>();
        studentGrades.put("Amit", 85);
        studentGrades.put("Priya", 92);

        
        Iterator<Map.Entry<String, Integer>> iterator = studentGrades.entrySet().iterator();

        System.out.print("Grade Report: ");
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.print(entry.getKey() + ":" + entry.getValue());
            if (iterator.hasNext()) {
                System.out.print(", ");
            }
        }
    }
}

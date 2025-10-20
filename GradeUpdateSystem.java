import java.util.*;

public class GradeUpdateSystem {
    public static void main(String[] args) {
        
        Map<String, Integer> grades = new HashMap<>();

        
        grades.put("Rohan", 78);
        System.out.println("Initial Grade: Rohan:" + grades.get("Rohan"));

        
        grades.put("Rohan", 88);

        
        System.out.println("Updated Grade: Rohan:" + grades.get("Rohan"));
    }
}

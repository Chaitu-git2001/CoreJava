import java.util.*;

public class DepartmentEmployeeMapping {
    public static void main(String[] args) {
        
        Map<String, List<String>> deptEmployees = new LinkedHashMap<>();

        
        deptEmployees.put("IT", new ArrayList<>(Arrays.asList("Amit", "Rohan")));
        deptEmployees.put("HR", new ArrayList<>(Arrays.asList("Priya")));

        
        System.out.print("Department Structure: ");
        int deptCount = 0;
        for (Map.Entry<String, List<String>> entry : deptEmployees.entrySet()) {
            System.out.print(entry.getKey() + ": " + String.join(", ", entry.getValue()));
            deptCount++;
            if (deptCount < deptEmployees.size()) {
                System.out.print("; ");
            }
        }
    }
}

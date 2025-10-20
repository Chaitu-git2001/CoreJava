import java.util.*;

class Student {
    private String name;
    private String grade;

    
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    
    public String getName() {
        return name;
    }
    public String getGrade() {
        return grade;
    }

    
    @Override
    public String toString() {
        return name + ":" + grade;
    }
}

public class GradeBasedStudentFilter {
    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();
        students.add(new Student("Amit", "A"));
        students.add(new Student("Priya", "C"));
        students.add(new Student("Rohan", "B"));

        
        List<String> allowedGrades = Arrays.asList("A", "B");

        
        students.removeIf(student -> !allowedGrades.contains(student.getGrade()));

        
        System.out.print("Qualified Students: ");
        for (int i = 0; i < students.size(); i++) {
            System.out.print(students.get(i));
            if (i < students.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}

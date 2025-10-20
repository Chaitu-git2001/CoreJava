import java.util.*;

public class StudentGradeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> gradeBook = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks for " + name + ": ");
            int marks = sc.nextInt();
            sc.nextLine();

            gradeBook.put(name, marks);
        }

        System.out.println("\nGrade Report:");
        for (Map.Entry<String, Integer> entry : gradeBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.print("\nEnter a student name to check marks: ");
        String query = sc.nextLine();

        if (gradeBook.containsKey(query)) {
            System.out.println(query + "'s marks: " + gradeBook.get(query));
        } else {
            System.out.println("Student not found!");
        }

        sc.close();
    }
}

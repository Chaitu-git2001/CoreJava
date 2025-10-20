import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AlphabeticalStudentDirectory {
    public static void main(String[] args) {
        Set<String> students = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students to add: ");
        int n = sc.nextInt();
        sc.nextLine();

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            students.add(name);
        }

        
        System.out.println("Students: " + students);

        sc.close();
    }
}

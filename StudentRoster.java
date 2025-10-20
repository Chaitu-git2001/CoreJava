import java.util.ArrayList;
import java.util.Scanner;

public class StudentRoster {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
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

        System.out.print("Enter name to remove: ");
        String removeName = sc.nextLine();
        students.remove(removeName);

        System.out.println("Students after removal: " + students);

        sc.close();
    }
}

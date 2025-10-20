import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueRollNumberValidator {
    public static void main(String[] args) {
        Set<Integer> rollNumbers = new LinkedHashSet<>(); 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of roll numbers to register: ");
        int n = sc.nextInt();

      
        for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();
            rollNumbers.add(roll); 
        }

        System.out.println("Unique Roll Numbers: " + rollNumbers);

        sc.close();
    }
}

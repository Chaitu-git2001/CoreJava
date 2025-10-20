import java.util.Scanner;

public class EmployeeAgeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: primitive int
        int age = sc.nextInt();   // e.g., 30

        // Autoboxing: int → Integer
        Integer ageObj = age;

        // Output
        System.out.println("Integer object: " + ageObj);
    }
}

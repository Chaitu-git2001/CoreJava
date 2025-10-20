import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Integer object
        Integer ageObj = sc.nextInt();   // e.g., 25

        // Unboxing: Integer → int
        int age = ageObj;

        // Output
        System.out.println("int value: " + age);
    }
}

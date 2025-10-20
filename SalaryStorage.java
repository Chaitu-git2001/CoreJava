import java.util.Scanner;

public class SalaryStorage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: primitive double
        double salary = sc.nextDouble();  // e.g., 45000.5

        // Convert to Double object
        Double salaryObj = Double.valueOf(salary);

        // Output
        System.out.println("Double object: " + salaryObj);
    }
}

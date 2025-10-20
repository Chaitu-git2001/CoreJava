import java.util.Scanner;

public class EmployeeData {
    
    static void calculateWage(int[] salaries, int index, int hours) {
        try {
            try {
                int wage = salaries[index] / hours;
                System.out.println(wage);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          
        int[] salaries = new int[n];   

        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextInt();
        }

        int index = sc.nextInt();   
        int hours = sc.nextInt();   

        calculateWage(salaries, index, hours);
    }
}

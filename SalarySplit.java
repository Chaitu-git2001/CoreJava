import java.util.Scanner;

public class SalarySplit {

    public static void divideBonus(int bonus, int employees) {
        if (employees == 0) {
            System.out.println("Error: Division by zero not allowed");
        } else {
            int perEmployee = bonus / employees;
            System.out.println("Each employee gets: " + perEmployee);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int bonus = sc.nextInt();

        int employees = sc.nextInt();

        divideBonus(bonus, employees);
    }
}

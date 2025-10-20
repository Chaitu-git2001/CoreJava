import java.util.Scanner;

public class EvenOddTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("Both numbers are Even");
        } else if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Both numbers are Odd");
        } else {
            System.out.println("Numbers are mixed (one even, one odd)");
        }
        sc.close();
    }
}

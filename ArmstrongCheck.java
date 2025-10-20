import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3-digit number: ");
        int num = sc.nextInt();
        int temp = num, sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        if (sum == num)
            System.out.println(num + " is an Armstrong number C-DAC MUMBAI");
        else
            System.out.println(num + " is NOT an Armstrong number");
        sc.close();
    }
}

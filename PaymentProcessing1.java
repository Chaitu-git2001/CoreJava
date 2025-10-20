import java.util.Scanner;

public class PaymentProcessing1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: amount as string
        String amountStr = sc.nextLine();  // "1000"

        // Parse string to integer
        int amount = Integer.parseInt(amountStr);

        // Input: additional amount
        int additional = sc.nextInt();     // 500

        // Calculate total
        int total = amount + additional;

        // Output
        System.out.println(amount + " + " + additional + " = " + total);
    }
}

import java.util.Scanner;

public class ShopDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total purchase amount: ");
        double amount = sc.nextDouble();

        double finalCost;
        if (amount > 1000) {
            finalCost = amount - (amount * 0.10); // 10% discount
        } else {
            finalCost = amount;
        }

        System.out.println("Final cost after discount: " + finalCost);

        sc.close();
    }
}

import java.util.Scanner;

public class OnlineShopping {
    
    static void processOrder(double[] prices, int index, int quantity) {
        try {
            if (quantity <= 0) {
                throw new ArithmeticException("Quantity must be positive");
            }
            double total = prices[index] * quantity;
            System.out.println("Total Price: " + total);
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception caught");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantity = sc.nextInt();   
        int n = sc.nextInt();          
        double[] prices = new double[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
        }

        int productIndex = sc.nextInt(); 
        processOrder(prices, productIndex, quantity);
    }
}

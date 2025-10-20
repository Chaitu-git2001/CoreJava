import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of grocery items to add: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter item: ");
            String item = sc.nextLine();
            groceries.add(item);
        }

        
        System.out.println("Grocery List: " + groceries);

        
        System.out.print("Enter purchased item to remove: ");
        String purchased = sc.nextLine();

        if (groceries.remove(purchased)) {
            System.out.println("Item '" + purchased + "' purchased and removed.");
        } else {
            System.out.println("Item not found in list!");
        }

        System.out.println("Items to buy: " + groceries);

        sc.close();
    }
}

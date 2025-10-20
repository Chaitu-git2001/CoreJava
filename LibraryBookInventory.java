import java.util.*;

public class LibraryBookInventory {
    public static void main(String[] args) {
        
        Map<String, Integer> inventory = new HashMap<>();

        
        inventory.put("Java", 3);
        inventory.put("Python", 5);

        System.out.println("Initial Inventory: " + inventory);

        
        String bookToBorrow = "Java";
        int copies = inventory.getOrDefault(bookToBorrow, 0);

        if (copies > 0) {
            inventory.put(bookToBorrow, copies - 1);
            System.out.println("Borrowed 1 copy of " + bookToBorrow);
        } else {
            System.out.println("Sorry, " + bookToBorrow + " is not available.");
        }

        System.out.println("Current Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

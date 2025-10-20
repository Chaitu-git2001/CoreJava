import java.util.*;

public class BrowserHistoryManagement {
    public static void main(String[] args) {
       
        Stack<String> history = new Stack<>();
        history.push("Google");
        history.push("YouTube");
        history.push("GFG");

        System.out.println("Initial History: " + history);

        
        if (!history.isEmpty()) {
            String backPage = history.pop();
            System.out.println("Back Operation: Removed -> " + backPage);
        }

        
        System.out.print("Current history: ");
        for (int i = 0; i < history.size(); i++) {
            System.out.print(history.get(i));
            if (i < history.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}

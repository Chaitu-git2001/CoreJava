import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RecentSearchHistory {
    public static void main(String[] args) {
        Queue<String> searches = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of searches: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter search query: ");
            String query = sc.nextLine();

            if (searches.size() == 5) {
                searches.poll(); 
            }
            searches.add(query);
        }

        System.out.println("Recent searches: " + searches);

        sc.close();
    }
}

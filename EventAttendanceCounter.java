import java.util.*;

public class EventAttendanceCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        Set<String> attendees = new HashSet<>();

        System.out.print("Enter number of attendees: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter attendee names:");
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            if (!attendees.add(name)) {
                //System.out.println("Duplicate entry ignored: " + name);No need of this statement.
            }
        }

        System.out.println("Total unique attendees: " + attendees.size());

        sc.close();
    }
}

import java.util.Scanner;

public class MeetingNotification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String baseText = sc.nextLine();     // Meeting:
        String details = sc.nextLine();      // Friday at 5 PM

        // Using StringBuffer
        StringBuffer sb = new StringBuffer(baseText);
        sb.append(" ").append(details);   // method chaining

        // Output
        System.out.println(sb.toString());
    }
}

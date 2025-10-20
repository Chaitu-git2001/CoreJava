import java.util.Scanner;

public class TicketNumberVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String ticketNumber = sc.nextLine();   // 12345

        // Using StringBuffer to reverse
        StringBuffer sb = new StringBuffer(ticketNumber);
        sb.reverse();

        // Output
        System.out.println(sb.toString());
    }
}

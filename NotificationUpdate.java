import java.util.Scanner;

public class NotificationUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String originalText = sc.nextLine();    // Exam postponed
        String textToFind = sc.nextLine();      // postponed
        String replacementText = sc.nextLine(); // rescheduled

        // Using StringBuilder
        StringBuilder sb = new StringBuilder(originalText);

        int startIndex = sb.indexOf(textToFind);  // find position
        if (startIndex != -1) {
            int endIndex = startIndex + textToFind.length();
            sb.replace(startIndex, endIndex, replacementText);
        }

        // Output
        System.out.println(sb.toString());
    }
}

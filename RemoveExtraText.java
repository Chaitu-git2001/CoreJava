import java.util.Scanner;

public class RemoveExtraText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String originalText = sc.nextLine();       // Please read - Do not disturb
        String substringToDelete = sc.nextLine();  // - Do not disturb

        // Using StringBuilder
        StringBuilder sb = new StringBuilder(originalText);

        int startIndex = sb.indexOf(substringToDelete);
        if (startIndex != -1) {
            int endIndex = startIndex + substringToDelete.length();
            sb.delete(startIndex, endIndex);
        }

        // Output
        System.out.println(sb.toString().trim());
    }
}

import java.util.Scanner;

public class RemoveOutdatedInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String originalText = sc.nextLine();        // CDAC Kharghar 2024
        String substringToDelete = sc.nextLine();   // 2024

        // Using StringBuffer
        StringBuffer sb = new StringBuffer(originalText);

        int startIndex = sb.indexOf(substringToDelete);
        if (startIndex != -1) {
            int endIndex = startIndex + substringToDelete.length();
            sb.delete(startIndex, endIndex);
        }

        // Output (trim to clean up spaces if needed)
        System.out.println(sb.toString().trim());
    }
}

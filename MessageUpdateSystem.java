import java.util.Scanner;

public class MessageUpdateSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String originalText = sc.nextLine();     // Old Notice
        String textToFind = sc.nextLine();       // Old
        String replacementText = sc.nextLine();  // Updated

        // Using StringBuffer
        StringBuffer sb = new StringBuffer(originalText);

        int startIndex = sb.indexOf(textToFind);
        if (startIndex != -1) {
            int endIndex = startIndex + textToFind.length();
            sb.replace(startIndex, endIndex, replacementText);
        }

        // Output
        System.out.println(sb.toString());
    }
}

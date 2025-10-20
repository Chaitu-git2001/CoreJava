import java.util.Scanner;

public class RoomAllocationUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String originalText = sc.nextLine();   // 101
        String textToInsert = sc.nextLine();   // New Building
        int insertIndex = sc.nextInt();        // 0

        // Using StringBuffer
        StringBuffer sb = new StringBuffer(originalText);
        sb.insert(insertIndex, textToInsert + " ");  // insert with space

        // Output
        System.out.println(sb.toString());
    }
}

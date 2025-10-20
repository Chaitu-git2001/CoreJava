import java.util.Scanner;

public class ReportTitle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String originalTitle = sc.nextLine();   // Annual Report
        String departmentName = sc.nextLine();  // CDAC

        // Using StringBuilder with method chaining
        StringBuilder sb = new StringBuilder(originalTitle);

        int insertIndex = sb.indexOf("Report");  // find where to insert

        String modifiedTitle = sb.insert(insertIndex, departmentName + " ")
                                 .toString();

        // Output
        System.out.println(modifiedTitle);
    }
}

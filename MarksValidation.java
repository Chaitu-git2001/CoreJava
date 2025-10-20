import java.util.Scanner;

public class MarksValidation {

    // Method to validate marks
    static void validateMarks(int marks) throws Exception {
        if (marks < 0 || marks > 100) {
            throw new Exception("Invalid marks");
        } else {
            System.out.println("Valid marks: " + marks);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        try {
            validateMarks(marks);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

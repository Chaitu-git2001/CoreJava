import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        String grade;

        if (marks >= 90) grade = "A+";
        else if (marks >= 80) grade = "A";
        else if (marks >= 70) grade = "A−";
        else if (marks >= 60) grade = "B+";
        else if (marks >= 50) grade = "B";
        else if (marks >= 40) grade = "C";
        else grade = "Fail";

        System.out.println("Grade: " + grade);
        sc.close();
    }
}

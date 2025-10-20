import java.util.Scanner;

public class ExamAttendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes held: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter classes attended: ");
        int attended = sc.nextInt();

        double attendancePercentage = (attended * 100.0) / totalClasses;

        if (attendancePercentage >= 75) {
            System.out.println("Student is allowed to sit for the exam");
        } else {
            System.out.println("Student is NOT allowed to sit for the exam");
        }

        sc.close();
    }
}

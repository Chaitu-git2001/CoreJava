import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        String result = (month == 1) ? "January" :
                        (month == 2) ? "February" :
                        (month == 3) ? "March" :
                        (month == 4) ? "April" :
                        (month == 5) ? "May" :
                        (month == 6) ? "June" :
                        (month == 7) ? "July" :
                        (month == 8) ? "August" :
                        (month == 9) ? "September" :
                        (month == 10) ? "October" :
                        (month == 11) ? "November" :
                        (month == 12) ? "December" : "Invalid month";

        System.out.println("Month is " + result);
        sc.close();
    }
}

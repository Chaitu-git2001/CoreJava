import java.util.Scanner;

public class SeasonMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int month = sc.nextInt();

        String season = (month == 12 || month == 1 || month == 2) ? "Winter" :
                        (month >= 3 && month <= 5) ? "Summer" :
                        (month >= 6 && month <= 8) ? "Monsoon" :
                        (month >= 9 && month <= 11) ? "Autumn" : "Invalid";

        System.out.println("Season is " + season);
        sc.close();
    }
}

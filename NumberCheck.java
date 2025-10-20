import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String result = (n > 0) ? "Number is Positive" : 
                        (n < 0) ? "Number is Negative" : 
                        "Number is Zero";

        System.out.println(result + " C-DAC MUMBAI");
        sc.close();
    }
}

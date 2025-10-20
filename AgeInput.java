import java.util.Scanner;

public class AgeInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ageInput = sc.nextLine();

        try {
            
            int age = Integer.parseInt(ageInput);
            System.out.println("Age entered: " + age);
        } 
		catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}

import java.util.Scanner;

public class ExamScores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        
        int index = sc.nextInt();

        try {
            
            System.out.println("Score: " + scores[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index accessed");
        }
    }
}

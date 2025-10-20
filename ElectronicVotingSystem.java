import java.util.*;

public class ElectronicVotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> voters = new HashSet<>();

        System.out.print("Enter number of voters: ");
        int n = sc.nextInt();

        System.out.println("Enter voter IDs:");
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt(); 
            if (!voters.add(id)) {
                //System.out.println("Duplicate vote ignored for Voter ID: " + id);
            }
        }


        System.out.println("Total voters: " + voters.size());

        sc.close();
    }
}
